package com.tweener.android.activities;

import android.app.Activity;

import com.tweener.android.config.Configuration;

public abstract class AbstractActivity extends Activity
{
    /**
     * Main application activity. This is the first activity launched
     */
    private static final Class< ? > BASE_ACTIVITY = HomeActivity.class;

    public static final String LOG_TAG = Configuration.LOG_TAG;

    protected static Class< ? > getBaseActivity()
    {
        return BASE_ACTIVITY;
    }
}
