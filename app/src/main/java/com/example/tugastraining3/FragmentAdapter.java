package com.example.tugastraining3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class FragmentAdapter extends FragmentStatePagerAdapter {
    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment =  new FragmentTab();
        if(i == 2) {
            fragment = new BlankFragment();
        } else if( i == 1) {
            fragment = new Recycler();
        }
        Bundle args = new Bundle();
        // Our object is just an integer :-P
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0) {
            return "Page Profile";
        } else if(position == 2){
            return "Logout";
        }
        return "blank";
    }
}