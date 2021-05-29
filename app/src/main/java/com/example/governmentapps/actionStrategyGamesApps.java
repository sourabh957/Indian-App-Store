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
1)Baahubali: The Game (Official)
	https://play.google.com/store/apps/details?id=com.bahubali.game

2)Daya Darwaza Tod Do - CID Fast & Endless Run
	https://play.google.com/store/apps/details?id=com.games2win.dayadarwazatoddo

3)Dhoom:3 The Game
	https://play.google.com/store/apps/details?id=com.ninetyninegames.dhoomthree

4)Hrithik Action Runner Game
	https://play.google.com/store/apps/details?id=com.nazara.hrithiklovehero

5)Sultan: The Game
	https://play.google.com/store/apps/details?id=com.NNGames.sultan

6)YuddhBhoomi: the epic war land
	https://play.google.com/store/apps/details?id=com.octro.mahayodha
 */


public class actionStrategyGamesApps extends AppCompatActivity {

    private List<appStyle> actionStrategy_app_list = new ArrayList<appStyle>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_strategy_games_apps);

        ArrayAdapter<appStyle> adapter = new customAdapter();
        actionStrategy_app_list.add(new appStyle("Baahubali: The Game (Official)", R.drawable.bahubali, "https://play.google.com/store/apps/details?id=com.bahubali.game"));
        actionStrategy_app_list.add(new appStyle("Daya Darwaza Tod Do - CID Fast & Endless Run", R.drawable.daya_darwaza_tod_do, "https://play.google.com/store/apps/details?id=com.games2win.dayadarwazatoddo"));
        actionStrategy_app_list.add(new appStyle("Dhoom:3 The Game", R.drawable.dhoom_3, "https://play.google.com/store/apps/details?id=com.ninetyninegames.dhoomthree"));
        actionStrategy_app_list.add(new appStyle("Hrithik Action Runner Game", R.drawable.hrithik_action, "https://play.google.com/store/apps/details?id=com.nazara.hrithiklovehero"));
        actionStrategy_app_list.add(new appStyle("Sultan: The Game", R.drawable.sultan, "https://play.google.com/store/apps/details?id=com.NNGames.sultan"));
        actionStrategy_app_list.add(new appStyle("YuddhBhoomi: the epic war land", R.drawable.yuddhbhoomi, "https://play.google.com/store/apps/details?id=com.octro.mahayodha"));


        ListView aap = (ListView) findViewById(R.id.actionStrategyGamesAppsID);
        aap.setAdapter(adapter);

        aap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                appStyle aap = actionStrategy_app_list.get(position);
                Uri uri = Uri.parse(aap.getAppUrl());
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

    }

    private class customAdapter extends ArrayAdapter<appStyle> {
        public customAdapter() {
            super(actionStrategyGamesApps.this, R.layout.list_view_layout, actionStrategy_app_list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.list_view_layout, parent, false);
            }

            appStyle aps = actionStrategy_app_list.get(position);

            ImageView myImg = (ImageView) convertView.findViewById(R.id.appIcon);
            TextView name = (TextView) convertView.findViewById(R.id.name);

            myImg.setImageResource(aps.getImageID());
            name.setText(aps.getAppName());

            return convertView;
        }

    }

}