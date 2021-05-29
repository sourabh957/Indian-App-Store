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
1)4x4 Dirt Racing - Offroad Dunes Rally Car Race 3D
	https://play.google.com/store/apps/details?id=com.games2win.racinghillcarchallenge

2)Driving Academy 2: Car Games & Driving School 2020
	https://play.google.com/store/apps/details?id=com.games2win.drivingacademy2

3)Driving Academy - Car School Driver Simulator 2020
	https://play.google.com/store/apps/details?id=com.games2win.drivingacademy

4)Driving Academy – India 3D
	https://play.google.com/store/apps/details?id=com.games2win.drivingacademyindia

5)Extreme Car Sports - Racing & Driving Simulator 3D
	https://play.google.com/store/apps/details?id=com.games2win.extremestuntcarracing

6)Oggy Super Speed Racing (The Official Game)
	https://play.google.com/store/apps/details?id=com.nazara.tinylabproductions.oggy

7)REAL Fast Car Racing: Race Cars in Street Traffic
	https://play.google.com/store/apps/details?id=com.games2win.highschoolracing

8)Ultimate Bus Driving - 3D Driver Simulator 2020
	https://play.google.com/store/apps/details?id=com.games2win.ultimatebusdriver
 */


public class racingGamesApps extends AppCompatActivity {

    private List<appStyle> racing_app_list = new ArrayList<appStyle>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_racing_games_apps);

        ArrayAdapter<appStyle> adapter = new customAdapter();
        racing_app_list.add(new appStyle("Driving Academy 2: Car Games & Driving School 2020", R.drawable.driving_academy_2, "https://play.google.com/store/apps/details?id=com.games2win.drivingacademy2"));
        racing_app_list.add(new appStyle("Driving Academy - Car School Driver Simulator 2020", R.drawable.driving_academy_car_school, "https://play.google.com/store/apps/details?id=com.games2win.drivingacademy"));
        racing_app_list.add(new appStyle("Driving Academy – India 3D", R.drawable.driving_academy_india_3d, "https://play.google.com/store/apps/details?id=com.games2win.drivingacademyindia"));
        racing_app_list.add(new appStyle("Extreme Car Sports - Racing & Driving Simulator 3D", R.drawable.extreme_car_sports, "https://play.google.com/store/apps/details?id=com.games2win.extremestuntcarracing"));
        racing_app_list.add(new appStyle("4x4 Dirt Racing - Offroad Dunes Rally Car Race 3D", R.drawable.four_by_four, "https://play.google.com/store/apps/details?id=com.games2win.racinghillcarchallenge"));
        racing_app_list.add(new appStyle("Oggy Super Speed Racing (The Official Game)", R.drawable.oggy_super, "https://play.google.com/store/apps/details?id=com.nazara.tinylabproductions.oggy"));
        racing_app_list.add(new appStyle("REAL Fast Car Racing: Race Cars in Street Traffic", R.drawable.real_fast_car_racing, "https://play.google.com/store/apps/details?id=com.games2win.highschoolracing"));
        racing_app_list.add(new appStyle("Ultimate Bus Driving - 3D Driver Simulator 2020", R.drawable.ultimate_bus_driving_3d, "https://play.google.com/store/apps/details?id=com.games2win.ultimatebusdriver"));


        ListView aap = (ListView) findViewById(R.id.racingAppListID);
        aap.setAdapter(adapter);

        aap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                appStyle aap = racing_app_list.get(position);
                Uri uri = Uri.parse(aap.getAppUrl());
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

    }

    private class customAdapter extends ArrayAdapter<appStyle> {
        public customAdapter() {
            super(racingGamesApps.this, R.layout.list_view_layout, racing_app_list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.list_view_layout, parent, false);
            }

            appStyle aps = racing_app_list.get(position);

            ImageView myImg = (ImageView) convertView.findViewById(R.id.appIcon);
            TextView name = (TextView) convertView.findViewById(R.id.name);

            myImg.setImageResource(aps.getImageID());
            name.setText(aps.getAppName());

            return convertView;
        }

    }

}