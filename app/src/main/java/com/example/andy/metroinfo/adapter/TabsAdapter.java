package com.example.andy.metroinfo.adapter;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.andy.metroinfo.fragment.BlueFragment;
import com.example.andy.metroinfo.fragment.GreenFragment;
import com.example.andy.metroinfo.fragment.RedFragment;
import com.example.andy.metroinfo.fragment.DefaultFragment;

import java.util.HashMap;
import java.util.Map;

public class TabsAdapter extends FragmentPagerAdapter {

    private Map<Integer, DefaultFragment> tabs;
    private Context context;

    public TabsAdapter(Context context, android.support.v4.app.FragmentManager fm)
    {
        super(fm);
        this.context = context;
        initTabs(context);
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();

    }

    @Override
    public Fragment getItem(int position) {
        return tabs.get(position);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }

    private void initTabs(Context context) {
        tabs = new HashMap<>();
        tabs.put(1, BlueFragment.getInstance(context));
        tabs.put(2, GreenFragment.getInstance(context));
        tabs.put(0, RedFragment.getInstance(context));
    }
}
