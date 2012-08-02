package com.tweener.android.utils;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.tweener.android.config.Configuration;

public class Message
{
    public static void alertShort(final Context context, final String message)
    {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public static void alertShort(final Context context, final int message)
    {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public static void alertLong(final Context context, final String message)
    {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

    public static void alertLong(final Context context, final int message)
    {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

    public static void Logger(final String message)
    {
        Log.d(Configuration.LOG_TAG, message);
    }
}
