package com.tweener.android.activities;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

import com.tweener.android.R;

public class HomeActivity extends MyEpisodesActivity
{
    private static int NUM_PAGES_VIEWS = 4;

    @Override
    public void onCreate(final Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
    }

    @Override
    public boolean onCreateOptionsMenu(final Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.actionbar, menu);
        return true;
    }

    public static class MyAdapter extends FragmentPagerAdapter
    {
        public MyAdapter(final FragmentManager fm)
        {
            super(fm);
        }

        @Override
        public int getCount()
        {
            return NUM_PAGES_VIEWS;
        }

        @Override
        public Fragment getItem(final int position)
        {
            return ArrayListFragment.newInstance(position);
        }
    }
}
