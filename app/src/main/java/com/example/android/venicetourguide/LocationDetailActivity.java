package com.example.android.venicetourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class LocationDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_detail);

        if (getIntent().hasExtra("LOCATION")) {
            Location location = (Location) getIntent().getParcelableExtra("LOCATION");

            TextView locationTitle = findViewById(R.id.location_title);
            locationTitle.setText(location.getLocationName());

            ImageView locationImage = findViewById(R.id.location_image);
            locationImage.setImageResource(location.getImageResourceId());

            TextView locationPhone = findViewById(R.id.location_phone);
            locationPhone.setText(location.getPhone());

            TextView locationAddress = findViewById(R.id.location_address);
            locationAddress.setText(location.getLocationAddress());

            TextView locationUrl = findViewById(R.id.location_url);
            locationUrl.setText(location.getUrl());

            TextView locationDescription = findViewById(R.id.location_description);
            locationDescription.setText(location.getDescription());
        }
    }
}
