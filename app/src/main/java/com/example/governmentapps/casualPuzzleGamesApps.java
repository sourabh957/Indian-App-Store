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
-1)Don't Let Me Down
	https://play.google.com/store/apps/details?id=com.octro.dlmd

0)Fan: The Game
	https://play.google.com/store/apps/details?id=com.NNGames.fan

1)Fantastic Chefs: Match 'n Cook
	https://play.google.com/store/apps/details?id=com.NNGames.fantasticchefs

2)Motu Patlu Fruit Attack
	https://play.google.com/store/apps/details?id=com.nazara.motupatlufruitattack

3)Motu Patlu Truck Simulator
	https://play.google.com/store/apps/details?id=com.nazara.motupatlutrucksim

4)Star Chef™ : Cooking & Restaurant Game
	https://play.google.com/store/apps/details?id=com.NNGames.starchef_android

5)Tambola Housie - 90 Ball Bingo
	https://play.google.com/store/apps/details?id=com.octro.tambola
 */


public class casualPuzzleGamesApps extends AppCompatActivity {

    private List<appStyle> casualPuzzle_app_list = new ArrayList<appStyle>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_casual_puzzle_games_apps);

        ArrayAdapter<appStyle> adapter = new customAdapter();
        casualPuzzle_app_list.add(new appStyle("Don't Let Me Down", R.drawable.dont_let_me_down, "https://play.google.com/store/apps/details?id=com.octro.dlmd"));
        casualPuzzle_app_list.add(new appStyle("Fan: The Game", R.drawable.fan_the_game, "https://play.google.com/store/apps/details?id=com.NNGames.fantasticchefs"));
        casualPuzzle_app_list.add(new appStyle("Fantastic Chefs: Match 'n Cook", R.drawable.fantastic_chef, "https://play.google.com/store/apps/details?id=com.jobs.in.andhra.pradesh"));
        casualPuzzle_app_list.add(new appStyle("Motu Patlu Fruit Attack", R.drawable.motu_patlu_fruit_attack, "https://play.google.com/store/apps/details?id=com.nazara.motupatlufruitattack"));
        casualPuzzle_app_list.add(new appStyle("Motu Patlu Truck Simulator", R.drawable.motu_patlu_truck_simulator, "https://play.google.com/store/apps/details?id=com.nazara.motupatlutrucksim"));
        casualPuzzle_app_list.add(new appStyle("Star Chef™ : Cooking & Restaurant Game", R.drawable.star_chef, "https://play.google.com/store/apps/details?id=com.NNGames.starchef_android"));
        casualPuzzle_app_list.add(new appStyle("Tambola Housie - 90 Ball Bingo", R.drawable.tambola_housie, "https://play.google.com/store/apps/details?id=com.octro.tambola"));

        ListView aap = (ListView) findViewById(R.id.casualPuzzleGamesAppListID);
        aap.setAdapter(adapter);

        aap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                appStyle aap = casualPuzzle_app_list.get(position);
                Uri uri = Uri.parse(aap.getAppUrl());
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

    }

    private class customAdapter extends ArrayAdapter<appStyle> {
        public customAdapter() {
            super(casualPuzzleGamesApps.this, R.layout.list_view_layout, casualPuzzle_app_list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.list_view_layout, parent, false);
            }

            appStyle aps = casualPuzzle_app_list.get(position);

            ImageView myImg = (ImageView) convertView.findViewById(R.id.appIcon);
            TextView name = (TextView) convertView.findViewById(R.id.name);

            myImg.setImageResource(aps.getImageID());
            name.setText(aps.getAppName());

            return convertView;
        }

    }

}