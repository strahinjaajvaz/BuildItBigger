package com.android.strahinja.androidlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokesDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes_display);

        String joke = getIntent().getStringExtra("joke");
        TextView textView = (TextView) findViewById(R.id.joke);
        textView.setText(joke);
    }
}
