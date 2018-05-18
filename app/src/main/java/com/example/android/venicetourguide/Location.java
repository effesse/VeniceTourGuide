package com.example.android.venicetourguide;

/**
 * Created by francesca on 16/05/18.
 */

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.TextView;


public class Location implements Parcelable {

    //state (variables)
    /** name of the location */
    private String mLocationName;
    /** address of the location */
    private String mLocationAddress;
    /** description of the location */
    private String mLocationDescription;
    /** phone number of the location */
    private String mPhone;
    /** url of the location */
    private String mUrl;

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
     * Create a new Location object.
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



    /**
     * Create a new Location object.
     *
     * @param locationName is name of the location
     * @param locationAddress is the address of the location
     * @param imageResourceId is the drawable resource ID for the image associated with the location
     * @param locationDescription is the description of the location;
     * @param phone is the telephone number of the location;
     * @param url is the web site of the location
     */
    public Location(String locationName, String locationAddress, int imageResourceId, String phone,
                    String url, String locationDescription) {
        mLocationName = locationName;
        mLocationAddress = locationAddress;
        mImageResourceId = imageResourceId;
        mLocationDescription = locationDescription;
        mPhone = phone;
        mUrl = url;
    }
    //methods
    //setters
    // getters

    protected Location(Parcel in) {
        mLocationName = in.readString();
        mLocationAddress = in.readString();
        mImageResourceId = in.readInt();
        mLocationDescription = in.readString();
        mPhone = in.readString();
        mUrl = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mLocationName);
        dest.writeString(mLocationAddress);
        dest.writeInt(mImageResourceId);
        dest.writeString(mLocationDescription);
        dest.writeString(mPhone);
        dest.writeString(mUrl);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Location> CREATOR = new Creator<Location>() {
        @Override
        public Location createFromParcel(Parcel in) {
            return new Location(in);
        }

        @Override
        public Location[] newArray(int size) {
            return new Location[size];
        }
    };

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
     * Return the image resource ID of the location.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
    /**
     /* Returns whether or not there is an image for this location.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Get the name of the location.
     */
    public String getDescription(){
        return mLocationDescription;
    }

    /**
     * Get the phone of the location.
     */
    public String getPhone(){
        return mPhone;
    }

    /**
     * Get the URL of the location.
     */
    public String getUrl(){
        return mUrl;
    }

}
