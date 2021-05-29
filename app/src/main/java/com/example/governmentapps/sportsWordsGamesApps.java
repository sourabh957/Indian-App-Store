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

/*1)Carrom Live 3D
	https://play.google.com/store/apps/details?id=com.octro.carromlive

2)Cricket Battle - Politics 2019 powered by So Sorry
	https://play.google.com/store/apps/details?id=com.games2win.mantricricket

3)Gully Cricket Game - 2020
	https://play.google.com/store/apps/details?id=com.games2win.gullycricket

4)Power Cricket T20 Cup 2019
	https://play.google.com/store/apps/details?id=com.games2win.powercrickett20

5)Real Cricket™ 20
	https://play.google.com/store/apps/details?id=com.nautilus.RealCricket3D

6)Smash Cricket
	https://play.google.com/store/apps/details?id=com.moonfrog.cricket

7)SpellUp
	https://play.google.com/store/apps/details?id=com.NNGames.cipher

8)War Of Words
	https://play.google.com/store/apps/details?id=com.octro.wordroyale

9)World T20 Cricket Champs 2019
	https://play.google.com/store/apps/details?id=com.games2win.worldcupcricketchamp
 */


public class sportsWordsGamesApps extends AppCompatActivity {

    private List<appStyle> sportWord_app_list = new ArrayList<appStyle>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports_words_games_apps);

        ArrayAdapter<appStyle> adapter = new customAdapter();
        sportWord_app_list.add(new appStyle("Carrom Live 3D", R.drawable.carrom_live_3d, "https://play.google.com/store/apps/details?id=com.octro.carromlive"));
        sportWord_app_list.add(new appStyle("Cricket Battle - Politics 2019 powered by So Sorry", R.drawable.cricket_battle_politics, "https://play.google.com/store/apps/details?id=com.games2win.mantricricket"));
        sportWord_app_list.add(new appStyle("Gully Cricket Game - 2020", R.drawable.gully_cricket_game_2020, "https://play.google.com/store/apps/details?id=com.games2win.gullycricket"));
        sportWord_app_list.add(new appStyle("Power Cricket T20 Cup 2019", R.drawable.power_cricket_t20, "https://play.google.com/store/apps/details?id=com.games2win.powercrickett20"));
        sportWord_app_list.add(new appStyle("Real Cricket™ 20", R.drawable.real_cricket_20, "https://play.google.com/store/apps/details?id=com.nautilus.RealCricket3D"));
        sportWord_app_list.add(new appStyle("Smash Cricket", R.drawable.smash_cricket, "https://play.google.com/store/apps/details?id=com.moonfrog.cricket"));
        sportWord_app_list.add(new appStyle("SpellUp", R.drawable.spell_up, "https://play.google.com/store/apps/details?id=com.NNGames.cipher"));
        sportWord_app_list.add(new appStyle("War Of Words", R.drawable.war_of_word, "https://play.google.com/store/apps/details?id=com.octro.wordroyale"));
        sportWord_app_list.add(new appStyle("World T20 Cricket Champs 2019", R.drawable.world_t20_cricket_champs, "https://play.google.com/store/apps/details?id=com.games2win.worldcupcricketchamp"));


        ListView aap = (ListView) findViewById(R.id.sportsWordsGamesAppListID);
        aap.setAdapter(adapter);

        aap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                appStyle aap = sportWord_app_list.get(position);
                Uri uri = Uri.parse(aap.getAppUrl());
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

    }

    private class customAdapter extends ArrayAdapter<appStyle> {
        public customAdapter() {
            super(sportsWordsGamesApps.this, R.layout.list_view_layout, sportWord_app_list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.list_view_layout, parent, false);
            }

            appStyle aps = sportWord_app_list.get(position);

            ImageView myImg = (ImageView) convertView.findViewById(R.id.appIcon);
            TextView name = (TextView) convertView.findViewById(R.id.name);

            myImg.setImageResource(aps.getImageID());
            name.setText(aps.getAppName());

            return convertView;
        }

    }

}