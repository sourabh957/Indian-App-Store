package com.example.governmentapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/*
1)Air India
	https://play.google.com/store/apps/details?id=com.bets.airindia.ui

2)Bounce - Bike & Scooter Rentals
	https://play.google.com/store/apps/details?id=com.metrobikes.app

3)Goibibo - Hotel Car Flight IRCTC Train Bus Booking
	https://play.google.com/store/apps/details?id=com.goibibo

4)IndiGo-Flight Ticket Booking App
	https://play.google.com/store/apps/details?id=in.goindigo.android

5)MakeMyTrip-Flight Hotel Bus Cab IRCTC Rail Booking
	https://play.google.com/store/apps/details?id=com.makemytrip

6)NaviMaps: 3D GPS Navigation
	https://play.google.com/store/apps/details?id=com.mmi.navimaps

7)Ola. Get rides on-demand
	https://play.google.com/store/apps/details?id=com.olacabs.customer

8)OYO : Book Safe Rooms With Best Hotel Booking App
	https://play.google.com/store/apps/details?id=com.oyo.consumer

9)Rapido - Bike Taxi
	https://play.google.com/store/apps/details?id=com.rapido.passenger

10)redBus - rPool Online Bus Ticket Booking App India
	https://play.google.com/store/apps/details?id=in.redbus.android

11)PNR Status, Train Running Status & Ticket Booking
	https://play.google.com/store/apps/details?id=in.trainman.trainmanandroidapp

12)VOGO -Scooter & Bike Rental App | Rent.Ride.Return
	https://play.google.com/store/apps/details?id=com.VoDrive

13)Yatra - Flights, Hotels, Bus, Trains & Cabs
	https://play.google.com/store/apps/details?id=com.yatra.base

14)Yulu
	https://play.google.com/store/apps/details?id=app.yulu.bike
 */

public class travellingApps extends AppCompatActivity {

    private List<appStyle> travelling_apps_list = new ArrayList<appStyle>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travelling_apps);

        ArrayAdapter<appStyle> adapter = new customAdapter();
        travelling_apps_list.add(new appStyle("Air India", R.drawable.air_india, "https://play.google.com/store/apps/details?id=com.bets.airindia.ui"));
        travelling_apps_list.add(new appStyle("Bounce - Bike & Scooter Rentals", R.drawable.bounce, "https://play.google.com/store/apps/details?id=com.metrobikes.app"));
        travelling_apps_list.add(new appStyle("Goibibo - Hotel Car Flight IRCTC Train Bus Booking", R.drawable.goibibo, "https://play.google.com/store/apps/details?id=com.goibibo"));
        travelling_apps_list.add(new appStyle("IndiGo-Flight Ticket Booking App", R.drawable.indigo, "https://play.google.com/store/apps/details?id=in.goindigo.android"));
        travelling_apps_list.add(new appStyle("MakeMyTrip-Flight Hotel Bus Cab IRCTC Rail Booking", R.drawable.make_my_trip, "https://play.google.com/store/apps/details?id=com.makemytrip"));
        travelling_apps_list.add(new appStyle("NaviMaps: 3D GPS Navigation", R.drawable.navi_maps, "https://play.google.com/store/apps/details?id=com.mmi.navimaps"));
        travelling_apps_list.add(new appStyle("Ola. Get rides on-demand", R.drawable.ola, "https://play.google.com/store/apps/details?id=com.olacabs.customer"));
        travelling_apps_list.add(new appStyle("Rapido - Bike Taxi", R.drawable.rapido, "https://play.google.com/store/apps/details?id=com.rapido.passenger"));
        travelling_apps_list.add(new appStyle("redBus - rPool Online Bus Ticket Booking App India", R.drawable.red_bus, "https://play.google.com/store/apps/details?id=in.redbus.android"));
        travelling_apps_list.add(new appStyle("PNR Status, Train Running Status & Ticket Booking", R.drawable.trainman, "https://play.google.com/store/apps/details?id=in.trainman.trainmanandroidapp"));
        travelling_apps_list.add(new appStyle("VOGO -Scooter & Bike Rental App | Rent.Ride.Return", R.drawable.vogo, "https://play.google.com/store/apps/details?id=com.VoDrive"));
        travelling_apps_list.add(new appStyle("Yatra - Flights, Hotels, Bus, Trains & Cabs", R.drawable.yatra, "https://play.google.com/store/apps/details?id=com.yatra.base"));
        travelling_apps_list.add(new appStyle("Yulu", R.drawable.yulu, "https://play.google.com/store/apps/details?id=app.yulu.bike"));

        ListView aap = (ListView) findViewById(R.id.travellingAppListID);
        aap.setAdapter(adapter);

        aap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                appStyle aap = travelling_apps_list.get(position);
                Uri uri = Uri.parse(aap.getAppUrl());
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

    }

    private class customAdapter extends ArrayAdapter<appStyle> {
        public customAdapter() {
            super(travellingApps.this, R.layout.list_view_layout, travelling_apps_list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.list_view_layout, parent, false);
            }

            appStyle aps = travelling_apps_list.get(position);

            ImageView myImg = (ImageView) convertView.findViewById(R.id.appIcon);
            TextView name = (TextView) convertView.findViewById(R.id.name);

            myImg.setImageResource(aps.getImageID());
            name.setText(aps.getAppName());

            return convertView;
        }

    }

}