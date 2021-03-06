package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.recycler_layout, container, false);

        RecyclerView mRecyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view);

        //Declare and initialize an ArrayList of locationData objects
        ArrayList<LocationData> locationData = new ArrayList<LocationData>();

        //add data to be displayed
        locationData.add(new LocationData(R.drawable.chefette, R.string.chefette, R.string.champers_text));
        locationData.add(new LocationData(R.drawable.cin_cin, R.string.cin_cin, R.string.cin_cin_text));
        locationData.add(new LocationData(R.drawable.cliff, R.string.cliff, R.string.cliff_text));
        locationData.add(new LocationData(R.drawable.champers, R.string.champers, R.string.champers_text));

        //Use a Linear Layout Manager
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);

        //Pass the dataset to the adapter
        RecyclerAdapter mAdapter = new RecyclerAdapter(locationData);

        //Specify an adapter
        mRecyclerView.setAdapter(mAdapter);

        return rootView;
    }

}
