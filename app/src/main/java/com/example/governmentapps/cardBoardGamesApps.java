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
1)Callbreak Gold - Multiplayer
	https://play.google.com/store/apps/details?id=com.callbreak.game

2)Ludo Board Indian Politics 2019: by So Sorry
	https://play.google.com/store/apps/details?id=com.games2win.ludomantri

3)Ludo Club - Fun Dice Game
	https://play.google.com/store/apps/details?id=com.moonfrog.ludo.club

4)Ludo Live! Heroes & Strategy
	https://play.google.com/store/apps/details?id=com.octro.ludolive

5)Poker Gold - Texas Holdem Poker Online Card Game
	https://play.google.com/store/apps/details?id=com.teenpatti.hd.gold.poker

6)Rummy Gold - 13 Card Indian Rummy Card Game Online
	https://play.google.com/store/apps/details?id=com.teenpatti.hd.gold.rummy

7)Seep
	https://play.google.com/store/apps/details?id=com.octro.sweep

8)Teen Patti by Octro - Indian Poker Card Game
	https://play.google.com/store/apps/details?id=com.octro.teenpatti

9)Teen Patti Gold - 3 Patti, Rummy, Poker Card Game
	https://play.google.com/store/apps/details?id=com.teenpatti.hd.gold
 */


public class cardBoardGamesApps extends AppCompatActivity {

    private List<appStyle> cardBoard_app_list = new ArrayList<appStyle>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_board_games_apps);

        ArrayAdapter<appStyle> adapter = new customAdapter();
        cardBoard_app_list.add(new appStyle("Callbreak Gold - Multiplayer", R.drawable.callbreak_gold, "https://play.google.com/store/apps/details?id=com.callbreak.game"));
        cardBoard_app_list.add(new appStyle("Ludo Board Indian Politics 2019: by So Sorry", R.drawable.ludo_board_indian_politics, "https://play.google.com/store/apps/details?id=com.games2win.ludomantri"));
        cardBoard_app_list.add(new appStyle("Ludo Club - Fun Dice Game", R.drawable.ludo_club, "https://play.google.com/store/apps/details?id=com.moonfrog.ludo.club"));
        cardBoard_app_list.add(new appStyle("Ludo Live! Heroes & Strategy", R.drawable.ludo_live, "https://play.google.com/store/apps/details?id=com.octro.ludolive"));
        cardBoard_app_list.add(new appStyle("Poker Gold - Texas Holdem Poker Online Card Game", R.drawable.poker_gold, "https://play.google.com/store/apps/details?id=com.teenpatti.hd.gold.poker"));
        cardBoard_app_list.add(new appStyle("Rummy Gold - 13 Card Indian Rummy Card Game Online", R.drawable.rummy_gold, "https://play.google.com/store/apps/details?id=com.teenpatti.hd.gold.rummy"));
        cardBoard_app_list.add(new appStyle("Seep", R.drawable.seep, "https://play.google.com/store/apps/details?id=com.octro.sweep"));
        cardBoard_app_list.add(new appStyle("Teen Patti by Octro - Indian Poker Card Game", R.drawable.teen_patti_by_octro, "https://play.google.com/store/apps/details?id=com.octro.teenpatti"));
        cardBoard_app_list.add(new appStyle("Teen Patti Gold - 3 Patti, Rummy, Poker Card Game", R.drawable.teen_patti_gold_rummy, "https://play.google.com/store/apps/details?id=com.teenpatti.hd.gold"));

        ListView aap = (ListView) findViewById(R.id.cardBoardGamesAppListID);
        aap.setAdapter(adapter);

        aap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                appStyle aap = cardBoard_app_list.get(position);
                Uri uri = Uri.parse(aap.getAppUrl());
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

    }

    private class customAdapter extends ArrayAdapter<appStyle> {
        public customAdapter() {
            super(cardBoardGamesApps.this, R.layout.list_view_layout, cardBoard_app_list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.list_view_layout, parent, false);
            }

            appStyle aps = cardBoard_app_list.get(position);

            ImageView myImg = (ImageView) convertView.findViewById(R.id.appIcon);
            TextView name = (TextView) convertView.findViewById(R.id.name);

            myImg.setImageResource(aps.getImageID());
            name.setText(aps.getAppName());

            return convertView;
        }

    }

}