package com.tweener.android.activities;

import android.app.ActionBar;
import android.app.ActionBar.OnNavigationListener;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;

import com.tweener.android.R;

/**
 * Main class to all MyEpisodes activities. This is where are defined all commons properties
 * 
 * @author tweener
 */
public abstract class MyEpisodesActivity extends AbstractActivity
{
    @Override
    public void onCreate(final Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        ActionBar actionBar = getActionBar();

        setDropDownActionBar(actionBar);
    }

    /**
     * Initialize and setup the drop down list to switch between users
     * 
     * @param actionBar The actionBar where the drop down list has to be attached
     */
    protected void setDropDownActionBar(final ActionBar actionBar)
    {
        SpinnerAdapter mSpinnerAdapter =
            ArrayAdapter.createFromResource(this, R.array.action_list,
                android.R.layout.simple_spinner_dropdown_item);

        OnNavigationListener mOnNavigationListener = new OnNavigationListener()
        {
            // Get the same strings provided for the drop-down's ArrayAdapter
            String[] strings = getResources().getStringArray(R.array.action_list);

            @Override
            public boolean onNavigationItemSelected(final int position, final long itemId)
            {
                return true;
            }
        };

        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);
        actionBar.setListNavigationCallbacks(mSpinnerAdapter, mOnNavigationListener);
    }
}
