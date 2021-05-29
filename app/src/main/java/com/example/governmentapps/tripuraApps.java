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
1)Government Schemes in Tripura
	https://play.google.com/store/apps/details?id=governmentschemes.sarkariyojna.bharatiyesarkariyojnaye.govschemesintripura

2)History of Tripura
	https://play.google.com/store/apps/details?id=com.nishan_babaji.Tripura_History

3)Tripura eSeva - Ration/Land/Services
	https://play.google.com/store/apps/details?id=io.kodular.whatsapptop4846.triration

4)Tripura Jobs
	https://play.google.com/store/apps/details?id=com.tripura.jobss

5)Tripura Land Details - ত্রিপুরা জমির তথ্য
	https://play.google.com/store/apps/details?id=com.govtapp4all.tripuraland

6)Tripura Power
	https://play.google.com/store/apps/details?id=tripura.tcs.com.tripuraapp

7)Tripura (TR) RTO Vehicle Owner Details
	https://play.google.com/store/apps/details?id=com.binakapps.tripuratrrtovehicleownerdetails

 */


public class tripuraApps extends AppCompatActivity {

    private List<appStyle> tripura_app_list = new ArrayList<appStyle>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tripura_apps);

        ArrayAdapter<appStyle> adapter = new customAdapter();
        tripura_app_list.add(new appStyle("Government Schemes in Tripura", R.drawable.government_schemes_in_tripura, "https://play.google.com/store/apps/details?id=governmentschemes.sarkariyojna.bharatiyesarkariyojnaye.govschemesintripura"));
        tripura_app_list.add(new appStyle("History Of Tripura", R.drawable.history_of_tripura, "https://play.google.com/store/apps/details?id=com.nishan_babaji.Tripura_History"));
        tripura_app_list.add(new appStyle("Tripura eSeva - Ration/Land/Services", R.drawable.tripura_e_seva, "https://play.google.com/store/apps/details?id=io.kodular.whatsapptop4846.triration"));
        tripura_app_list.add(new appStyle("Tripura Jobs", R.drawable.tripura_jobs, "https://play.google.com/store/apps/details?id=com.tripura.jobss"));
        tripura_app_list.add(new appStyle("Tripura Land Details - ত্রিপুরা জমির তথ্য", R.drawable.tripura_land_details, "https://play.google.com/store/apps/details?id=com.govtapp4all.tripuraland"));
        tripura_app_list.add(new appStyle("Tripura Power", R.drawable.tripura_power, "https://play.google.com/store/apps/details?id=tripura.tcs.com.tripuraapp"));
        tripura_app_list.add(new appStyle("Tripura (TR) RTO Vehicle Owner Details", R.drawable.tripura_rto_vehicle_owner, "https://play.google.com/store/apps/details?id=com.binakapps.tripuratrrtovehicleownerdetails"));



        ListView aap = (ListView) findViewById(R.id.tripuraAppListID);
        aap.setAdapter(adapter);

        aap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                appStyle aap = tripura_app_list.get(position);
                Uri uri = Uri.parse(aap.getAppUrl());
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

    }

    private class customAdapter extends ArrayAdapter<appStyle> {
        public customAdapter() {
            super(tripuraApps.this, R.layout.list_view_layout, tripura_app_list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.list_view_layout, parent, false);
            }

            appStyle aps = tripura_app_list.get(position);

            ImageView myImg = (ImageView) convertView.findViewById(R.id.appIcon);
            TextView name = (TextView) convertView.findViewById(R.id.name);

            myImg.setImageResource(aps.getImageID());
            name.setText(aps.getAppName());

            return convertView;
        }

    }

}