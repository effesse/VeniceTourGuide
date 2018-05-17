package com.example.android.venicetourguide;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
/**
 * A simple {@link Fragment} subclass.
 */
public class AccomodationFragment extends Fragment {


    public AccomodationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getResources().getString(R.string.dogi), getResources().getString(R.string.dogi_address),
                R.drawable.dogi));
        locations.add(new Location(getResources().getString(R.string.aman), getResources().getString(R.string.aman_address),
                R.drawable.aman));
        locations.add(new Location(getResources().getString(R.string.bauer), getResources().getString(R.string.bauer_address),
                R.drawable.bauer));
        locations.add(new Location(getResources().getString(R.string.excelsior), getResources().getString(R.string.excelsior_address),
                R.drawable.excelsior));
        locations.add(new Location(getResources().getString(R.string.hcipriani), getResources().getString(R.string.hcipriani_address),
                R.drawable.hcipriani));
        locations.add(new Location(getResources().getString(R.string.danieli), getResources().getString(R.string.danieli_address),
                R.drawable.danieli));
        locations.add(new Location(getResources().getString(R.string.jw), getResources().getString(R.string.jw_address),
                R.drawable.jw));
        locations.add(new Location(getResources().getString(R.string.westin), getResources().getString(R.string.westin_address),
                R.drawable.westin));

        // Create an {@link LocationAdapter}, whose data source is a list of {@link Location}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_accomodation);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // location_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link LocationAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Location} in the list.
        listView.setAdapter(adapter);

        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {


                // Get the {@link Word} object at the given position the user clicked on
                Location location = locations.get(position);


            }
        });

        return rootView;
    }



}


