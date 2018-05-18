package com.example.android.venicetourguide;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
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
                R.drawable.basilica, getResources().getString(R.string.basilica_phone), getResources().getString(R.string.basilica_url) ,
                getResources().getString(R.string.basilica_description)));
        locations.add(new Location(getResources().getString(R.string.dogespalace), getResources().getString(R.string.dogespalace_address),
                R.drawable.dogepalace, getResources().getString(R.string.dogespalace_phone), getResources().getString(R.string.dogespalace_url) ,
                getResources().getString(R.string.dogespalace_description)));
        locations.add(new Location(getResources().getString(R.string.lafenice), getResources().getString(R.string.lafenice_address),
                R.drawable.lafenice, getResources().getString(R.string.lafenice_phone), getResources().getString(R.string.lafenice_url) ,
                getResources().getString(R.string.lafenice_description)));
        locations.add(new Location(getResources().getString(R.string.rialto), getResources().getString(R.string.rialto_address),
                R.drawable.rialto, getResources().getString(R.string.rialto_phone), getResources().getString(R.string.rialto_url) ,
                getResources().getString(R.string.rialto_description)));
        locations.add(new Location(getResources().getString(R.string.pontedeipugni), getResources().getString(R.string.pontedeipugni_address),
                R.drawable.pontedeipugni, getResources().getString(R.string.pontedeipugni_phone), getResources().getString(R.string.pontedeipugni_url) ,
                getResources().getString(R.string.pontedeipugni_description)));
        locations.add(new Location(getResources().getString(R.string.accademia), getResources().getString(R.string.accademia_address),
                R.drawable.accademia, getResources().getString(R.string.accademia_phone), getResources().getString(R.string.accademia_url) ,
                getResources().getString(R.string.accademia_description)));
        locations.add(new Location(getResources().getString(R.string.frari), getResources().getString(R.string.frari_address),
                R.drawable.frari, getResources().getString(R.string.frari_phone), getResources().getString(R.string.frari_url) ,
                getResources().getString(R.string.frari_description)));
        locations.add(new Location(getResources().getString(R.string.fondaco), getResources().getString(R.string.fondaco_address),
                R.drawable.fondaco, getResources().getString(R.string.fondaco_phone), getResources().getString(R.string.fondaco_url) ,
                getResources().getString(R.string.fondaco_description)));

        /** for (int i = 0; i < getResources().getStringArray(R.array.sightseeing_phone_array).length; i++) {
        String phone = getResources().getStringArray(R.array.sightseeing_phone_array)[i];
        String url = getResources().getStringArray(R.array.sightseeing_url_array)[i];
        String description = getResources().getStringArray(R.array.sightseeing_description_array)[i];
        }*/

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

        // Set a click listener to the location detail when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                // Get the {@link Location} object at the given position the user clicked on
                Location location = locations.get(position);

                Intent intent = new Intent(getContext(), LocationDetailActivity.class);
                intent.putExtra("LOCATION", location);
                startActivity(intent);

            }
        });
        return rootView;
    }
    }

