package com.udacity.gradle.builditbigger;


import android.support.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertTrue;




/**
 * Created by shola on 12/29/2018.
 */

@RunWith(AndroidJUnit4.class)
public class ServerAsyncTaskTest {

    @Test
    public void testDoInBackground() throws Exception {
       MainActivityFragment fragment = new MainActivityFragment();
        fragment.testIndicator = true;
        new ServerAsyncTask().execute(fragment);
        Thread.sleep(5000);
        assertTrue("Error: Fetched Joke = " + fragment.fetchJoke, fragment.fetchJoke != null);
    }
}