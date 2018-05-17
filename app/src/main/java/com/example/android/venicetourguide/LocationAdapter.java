package com.example.android.venicetourguide;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by francesca on 16/05/18.
 */

public class LocationAdapter extends ArrayAdapter<Location>{
    // private static final String LOG_TAG = Word.class.getSimpleName();

    /** Resource ID for the background color for this list of words */
    private int mColorResourceId;


    /**
     * Create a new {@link LocationAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param locations is the list of {@link Location}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of locations
     */

    public LocationAdapter(Activity context, ArrayList<Location> locations, int colorResourceId) {
        super(context, 0, locations);
        mColorResourceId = colorResourceId;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the {@link AndroidFlavor} object located at this position in the list
        Location currentLocation = getItem(position);

        // Find the TextView in the list_view.xml layout with the ID version_name
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.location_name);
        // Get the version name from the current Word object and
        // set this text on the name TextView
        miwokTextView.setText(currentLocation.getLocationName());

        // Find the TextView in the list_view.xml layout with the ID version_name
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.location_address);
        // Get the version name from the current Word object and
        // set this text on the name TextView
        defaultTextView.setText(currentLocation.getLocationAddress());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Check if an image is provided for this word or not
        if (currentLocation.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentLocation.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);
        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;

    }
}
