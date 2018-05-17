package com.example.android.venicetourguide;

/**
 * Created by francesca on 16/05/18.
 */

import android.content.Context;


public class Location {

    //state (variables)
    /** name of the location */
    private String mLocationName;
    /** address of the location */
    private String mLocationAddress;

    // Image resource ID  for the location */
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Location object.
     *
     * @param locationName is name of the location
     * @param locationAddress is the address of the location

     */
    public Location(String locationName, String locationAddress){
        mLocationName = locationName;
        mLocationAddress = locationAddress;

    }

    /**
     * Create a new Word object.
     *
     * @param locationName is name of the location
     * @param locationAddress is the address of the location
     * @param imageResourceId is the drawable resource ID for the image associated with the location
     *
     */
    public Location(String locationName, String locationAddress, int imageResourceId) {
        mLocationName = locationName;
        mLocationAddress = locationAddress;
        mImageResourceId = imageResourceId;

    }

    //methods
    //setters
    // getters

    /**
     * Get the name of the location.
     */
    public String getLocationName(){
        return mLocationName;
    }

    /**
     * Get the address of the location.
     */
    public String getLocationAddress() {
        return mLocationAddress;
    }
    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
    /**
     /* Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}
