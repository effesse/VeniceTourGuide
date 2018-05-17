package com.example.android.venicetourguide;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShoppingFragment extends Fragment {


    public ShoppingFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);



        // Create a list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getResources().getString(R.string.macana), getResources().getString(R.string.macana_address)));
        locations.add(new Location(getResources().getString(R.string.nardi), getResources().getString(R.string.nardi_address)));
        locations.add(new Location(getResources().getString(R.string.bevilacqua), getResources().getString(R.string.bevilacqua_address)));
        locations.add(new Location(getResources().getString(R.string.venini), getResources().getString(R.string.venini_address)));
        locations.add(new Location(getResources().getString(R.string.attombri), getResources().getString(R.string.attombri_address)));
        locations.add(new Location(getResources().getString(R.string.rizzo), getResources().getString(R.string.rizzo_address)));
        locations.add(new Location(getResources().getString(R.string.rubelli), getResources().getString(R.string.rubelli)));
        locations.add(new Location(getResources().getString(R.string.olbi), getResources().getString(R.string.olbi_address)));

        // Create an {@link LocationAdapter}, whose data source is a list of {@link Location}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_shopping);
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