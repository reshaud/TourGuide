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
public class BeachesFragment extends Fragment {


    public BeachesFragment() {
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
        locationData.add(new LocationData(R.drawable.bathsheba, R.string.bathsheba, R.string.bathsheba_text));
        locationData.add(new LocationData(R.drawable.brownes_beach, R.string.browns_beach, R.string.browns_beach_text));
        locationData.add(new LocationData(R.drawable.bottom_bay, R.string.bottom_bay, R.string.bottom_bay_text));
        locationData.add(new LocationData(R.drawable.surfers_point, R.string.surfers_point, R.string.surfers_point_text));

        //Use a Linear Layout Manager
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);

        //Pass the dataset to the adapter
        RecyclerAdapter mAdapter = new RecyclerAdapter(locationData);

        //Specify an adapter
        mRecyclerView.setAdapter(mAdapter);

        return rootView;
    }

}
