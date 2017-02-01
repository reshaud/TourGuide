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
public class ScenicSpotsFragment extends Fragment {


    public ScenicSpotsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.recycler_layout, container, false);


        RecyclerView mRecyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view);

        //Declare and initialize an ArrayList of locationData objects
        ArrayList<LocationData> locationData = new ArrayList<LocationData>();

        locationData.add(new LocationData(R.drawable.animal_flower_cave, R.string.animal_flower_cave, R.string.animal_flower_cave_text));
        locationData.add(new LocationData(R.drawable.farley_hill, R.string.farley_hill, R.string.farley_hill_text));
        locationData.add(new LocationData(R.drawable.hackleton, R.string.hackleton_cliff, R.string.hackleton_cliff_text));
        locationData.add(new LocationData(R.drawable.cherry_tree_hill, R.string.cherry_tree_hill, R.string.cherry_tree_hill_text));

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
