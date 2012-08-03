package com.tweener.android.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tweener.android.R;

public class HomeActivity extends MyEpisodesActivity
{
    private static int NUM_PAGES_VIEWS = 3;

    private HomePagerAdapter pagerAdapter;

    private ViewPager viewPager;

    @Override
    public void onCreate(final Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        pagerAdapter = new HomePagerAdapter(getSupportFragmentManager());

        viewPager = (ViewPager) findViewById(R.id.pager);
        viewPager.setAdapter(pagerAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(final Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.actionbar, menu);
        return true;
    }

    public static class HomePagerAdapter extends FragmentPagerAdapter
    {
        public HomePagerAdapter(final FragmentManager fm)
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

    public static class ArrayListFragment extends Fragment
    {
        int fragmentNumber;

        /**
         * Create a new instance of CountingFragment, providing "num" as an argument.
         */
        static ArrayListFragment newInstance(final int num)
        {
            ArrayListFragment f = new ArrayListFragment();

            // Supply num input as an argument.
            Bundle args = new Bundle();
            args.putInt("num", num);
            f.setArguments(args);

            return f;
        }

        /**
         * When creating, retrieve this instance's number from its arguments.
         */
        @Override
        public void onCreate(final Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            fragmentNumber = getArguments() != null ? getArguments().getInt("num") : 1;
        }

        @Override
        public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
            final Bundle savedInstanceState)
        {
            View v = inflater.inflate(R.layout.fragment_pager, container, false);
            View tv = v.findViewById(R.id.text);

            String[] titleFragments = getResources().getStringArray(R.array.home_fragments);
            ((TextView) tv).setText(titleFragments[fragmentNumber].toUpperCase());

            return v;
        }

        @Override
        public void onActivityCreated(final Bundle savedInstanceState)
        {
            super.onActivityCreated(savedInstanceState);
        }
    }
}
