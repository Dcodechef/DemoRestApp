package com.arcfix.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arcfix.R;
import com.arcfix.adapter.TabPagerAdapter;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by deep on 30/03/16.
 */
public class FragmentTabsHome extends Fragment{
    @Bind(R.id.sliding_tabs)
    TabLayout mTabLayout;
    @Bind(R.id.viewpager)
    ViewPager mViewPager;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home_tab_layout,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this,view);


        mViewPager.setAdapter(new TabPagerAdapter(getChildFragmentManager(),
                getActivity()));
        mTabLayout.setupWithViewPager(mViewPager);
    }
}
