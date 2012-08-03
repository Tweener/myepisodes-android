package com.tweener.android.activities;

import android.support.v4.app.FragmentActivity;

import com.tweener.android.config.Configuration;

public abstract class AbstractActivity extends FragmentActivity
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
