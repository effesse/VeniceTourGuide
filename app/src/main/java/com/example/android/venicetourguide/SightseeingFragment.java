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
public class SightseeingFragment extends Fragment {


    public SightseeingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getResources().getString(R.string.basilica), getResources().getString(R.string.basilica_address),
                R.drawable.basilica));
        locations.add(new Location(getResources().getString(R.string.dogespalace), getResources().getString(R.string.dogespalace_address),
                R.drawable.dogepalace));
        locations.add(new Location(getResources().getString(R.string.lafenice), getResources().getString(R.string.lafenice_address),
                R.drawable.lafenice));
        locations.add(new Location(getResources().getString(R.string.rialto), getResources().getString(R.string.rialto_address),
                R.drawable.rialto));
        locations.add(new Location(getResources().getString(R.string.pontedeipugni), getResources().getString(R.string.pontedeipugni_address),
                R.drawable.rialto));
        locations.add(new Location(getResources().getString(R.string.accademia), getResources().getString(R.string.accademia_address),
                R.drawable.accademia));
        locations.add(new Location(getResources().getString(R.string.frari), getResources().getString(R.string.frari_address),
                R.drawable.frari));
        locations.add(new Location(getResources().getString(R.string.fondaco), getResources().getString(R.string.fondaco_address),
                R.drawable.fondaco));

        // Create an {@link LocationAdapter}, whose data source is a list of {@link Location}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_sightseeing);
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

