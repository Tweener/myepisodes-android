package com.tweener.android;

import android.app.Application;

import com.tweener.android.config.Configuration;

public class MyEpisodesApplication extends Application
{
    @Override
    public void onLowMemory()
    {
        super.onLowMemory();
    }

    @Override
    public void onCreate()
    {
        getSharedPreferences(Configuration.PREFERENCES_NAME, 0);
    }
}
