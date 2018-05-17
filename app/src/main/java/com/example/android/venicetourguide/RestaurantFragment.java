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

public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getResources().getString(R.string.cipriani), getResources().getString(R.string.cipriani_address),
                R.drawable.cipriani));
        locations.add(new Location(getResources().getString(R.string.fiore), getResources().getString(R.string.fiore_address),
                R.drawable.fiore));
        locations.add(new Location(getResources().getString(R.string.monaco), getResources().getString(R.string.monaco_address),
                R.drawable.monaco));
        locations.add(new Location(getResources().getString(R.string.boccadoro), getResources().getString(R.string.boccadoro_address),
                R.drawable.boccadoro));
        locations.add(new Location(getResources().getString(R.string.cortesconta), getResources().getString(R.string.cortesconta_address),
                R.drawable.cortesconta));
        locations.add(new Location(getResources().getString(R.string.doforni), getResources().getString(R.string.doforni_address),
                R.drawable.doforni));
        locations.add(new Location(getResources().getString(R.string.gigio), getResources().getString(R.string.gigio_address),
                R.drawable.gigio));
        locations.add(new Location(getResources().getString(R.string.bitta), getResources().getString(R.string.bitta_address),
                R.drawable.bitta));

        // Create an {@link LocationAdapter}, whose data source is a list of {@link Location}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_restaurant);
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


