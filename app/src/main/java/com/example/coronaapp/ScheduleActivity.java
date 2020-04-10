package com.example.coronaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.widget.TextView;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class ScheduleActivity extends AppCompatActivity {

    TextView textView;
    Geocoder geocoder;
    List<Address> addresses;

    Double latitude = 18.944620;
    Double longitude = 72.822278;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        textView = (TextView) findViewById(R.id.location);
        geocoder = new Geocoder(this, Locale.getDefault());

        try {
            addresses = geocoder.getFromLocation(latitude, longitude, 1);

            String address = addresses.get(0).getAddressLine(0);
            String area = addresses.get(0).getLocality();
            String city = addresses.get(0).getAdminArea();
            String country = addresses.get(0).getCountryName();
            String postalCode = addresses.get(0).getPostalCode();

            String fullAddress = address+", "+area+", "+city+", "+country+", "+postalCode ;
            textView.setText((fullAddress));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
