package com.example.dishant.testlogin;

import android.support.test.rule.ActivityTestRule;
import android.util.Log;
import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static junit.framework.Assert.assertNotNull;

/**
 * Created by Dishant on 3/20/2018.
 */

class MainActivityTest {
    private static final String TAG = "MainActivityTest";
    /**
     * Rule is created to launch the activity and to create the object or reference of MainActivity.
     */

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);
    private MainActivity mainActivity = null;

    /**
     *
     * setUp() is the pre-checking the conditions before the testing.
     */
    @Before
    public void setUp() throws Exception {
        Log.d(TAG, "setUp: Started.");

        mainActivity = mainActivityActivityTestRule.getActivity();

    }

    /**
     * testLaunch() is where the actual testing code is written.
     */
    @Test
    public void testLaunch(){
        Log.d(TAG, "testLaunch: Started.");

        View view = mainActivity.findViewById(R.id.username); // checks the view with the id of TextView.
        assertNotNull(view); // It will work if view is not NULL.
    }

    /**
     *
     * tearDown() is used to close the testing and do some final touch-ups.
     */
    @After
    public void tearDown() throws Exception{
        mainActivity = null;
    }

}
