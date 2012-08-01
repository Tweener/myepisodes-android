package com.tweener.android.activities;

import android.app.Activity;
import android.os.Bundle;

import com.tweener.android.R;
import com.tweener.android.config.Configuration;

public class SplashScreenActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(final Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        // Create SplahScreen thread
        Thread welcomeThread = new Thread()
        {
            int wait = 0;

            @Override
            public void run()
            {
                try
                {
                    super.run();

                    while (wait < Configuration.SPLASHSCREEN_DURATION)
                    {
                        sleep(100);
                        wait += 100;
                    }
                }
                catch (Exception e)
                {
                    // Message.alertShort(SplashScreenActivity.this, "e : " + e.getMessage());
                }
                finally
                {
                    // startActivity(new Intent(SplashScreenActivity.this, LoginActivity.class));
                    finish();
                }
            }
        };

        welcomeThread.start();
    }
}
