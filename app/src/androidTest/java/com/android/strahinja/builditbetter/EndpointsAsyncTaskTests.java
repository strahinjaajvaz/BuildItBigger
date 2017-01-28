package com.android.strahinja.builditbetter;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTests {

    @Test
    public void returnsStringNotNull() throws Exception{
        new EndpointsAsyncTask(new EndpointsAsyncTask.Loader() {
            @Override
            public void returnJoke(String joke) {
                assertNotNull(joke);
            }
        }).execute();
    }
}
