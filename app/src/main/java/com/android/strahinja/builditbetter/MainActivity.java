package com.android.strahinja.builditbetter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.android.strahinja.androidlib.JokesDisplayActivity;
import com.example.Jokes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_settings)
            return true;

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {
        new EndpointsAsyncTask(new EndpointsAsyncTask.Loader() {
            @Override
            public void returnJoke(String joke) {
                Intent i = new Intent(MainActivity.this, JokesDisplayActivity.class);
                i.putExtra("joke", Jokes.getJoke());
                startActivity(i);
            }
        }).execute();
    }
}
