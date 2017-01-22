package com.example.android.tourguide;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);

        // Create an adapter that knows which fragment should be shown on each page
        CategoryAdapter categoryAdapter = new CategoryAdapter(this, getSupportFragmentManager());

        //Set FragmentPagerAdapter for viewPager
        viewPager.setAdapter(categoryAdapter);

        //Find Tab Layout
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);

        //set viewPager for tabLayout
        tabLayout.setupWithViewPager(viewPager);

        //Remove shadow under action bar
        getSupportActionBar().setElevation(0);
    }
}
