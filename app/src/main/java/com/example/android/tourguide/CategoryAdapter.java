package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Reshaud Ally on 1/17/2017.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    // Context of the app
    private Context mContext;

    public CategoryAdapter(Context context,FragmentManager fm) {
        super(fm);
        this.mContext = context;
    }

    //Return fragment that should be displayed based on position
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new RestaurantsFragment();
            default:
                return new BeachesFragment();
        }
    }

    //Return total number of pages (Should be 4 for this project)
    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0){
            return mContext.getString(R.string.restaurant);
        }
        else {
            return mContext.getString(R.string.beaches);
        }
    }
}
