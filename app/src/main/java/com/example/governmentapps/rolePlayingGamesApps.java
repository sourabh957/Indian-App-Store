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
0)Arjun : Warrior of Mahabharata
	https://play.google.com/store/apps/details?id=mahabharat.arjun.warrior

1)Decisions: Choose Your Interactive Stories Choice
	https://play.google.com/store/apps/details?id=com.games2win.decisions

2)Fab Tattoo Design Studio
	https://play.google.com/store/apps/details?id=com.games2win.fabtattoodesignstudio

3)Friends Forever : Choose your Story Choices 2019
	https://play.google.com/store/apps/details?id=com.games2win.friendsforever

4)Indian Fashion Stylist
	https://play.google.com/store/apps/details?id=air.com.games2win.indianfashionstylist

5)International Fashion Stylist: Model Design Studio
	https://play.google.com/store/apps/details?id=air.com.games2win.internationalfashionstylist

6)Kalyug : Warriors of Magic
	https://play.google.com/store/apps/details?id=com.warmagicgames.kalyug

7)Super Wedding Stylist 2020 Dress Up & Makeup Salon
	https://play.google.com/store/apps/details?id=com.games2win.weddingdressup
 */


public class rolePlayingGamesApps extends AppCompatActivity {

    private List<appStyle> rolePlaying_app_list = new ArrayList<appStyle>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_role_playing_games_apps);

        ArrayAdapter<appStyle> adapter = new customAdapter();
        rolePlaying_app_list.add(new appStyle("Arjun : Warrior of Mahabharata", R.drawable.arjun_warrior_of_mahabharata, "https://play.google.com/store/apps/details?id=mahabharat.arjun.warrior"));
        rolePlaying_app_list.add(new appStyle("Decisions: Choose Your Interactive Stories Choice", R.drawable.decisions_choose_your_interactive_story, "https://play.google.com/store/apps/details?id=com.games2win.decisions"));
        rolePlaying_app_list.add(new appStyle("Fab Tattoo Design Studio", R.drawable.fab_tattoo_design_studio, "https://play.google.com/store/apps/details?id=com.games2win.fabtattoodesignstudio"));
        rolePlaying_app_list.add(new appStyle("Friends Forever : Choose your Story Choices 2019", R.drawable.friends_forever_choose_your_story_choices, "https://play.google.com/store/apps/details?id=com.games2win.friendsforever"));
        rolePlaying_app_list.add(new appStyle("Indian Fashion Stylist", R.drawable.indian_fashion_stylist, "https://play.google.com/store/apps/details?id=air.com.games2win.indianfashionstylist"));
        rolePlaying_app_list.add(new appStyle("International Fashion Stylist: Model Design Studio", R.drawable.international_fashion_stylist, "https://play.google.com/store/apps/details?id=air.com.games2win.internationalfashionstylist"));
        rolePlaying_app_list.add(new appStyle("Kalyug : Warriors of Magic", R.drawable.kalyug_warriors, "https://play.google.com/store/apps/details?id=com.warmagicgames.kalyug"));
        rolePlaying_app_list.add(new appStyle("Super Wedding Stylist 2020 Dress Up & Makeup Salon", R.drawable.super_wedding_stylist_2020, "https://play.google.com/store/apps/details?id=com.games2win.weddingdressup"));

        ListView aap = (ListView) findViewById(R.id.rolePlayingGamesAppListID);
        aap.setAdapter(adapter);

        aap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                appStyle aap = rolePlaying_app_list.get(position);
                Uri uri = Uri.parse(aap.getAppUrl());
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

    }

    private class customAdapter extends ArrayAdapter<appStyle> {
        public customAdapter() {
            super(rolePlayingGamesApps.this, R.layout.list_view_layout, rolePlaying_app_list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.list_view_layout, parent, false);
            }

            appStyle aps = rolePlaying_app_list.get(position);

            ImageView myImg = (ImageView) convertView.findViewById(R.id.appIcon);
            TextView name = (TextView) convertView.findViewById(R.id.name);

            myImg.setImageResource(aps.getImageID());
            name.setText(aps.getAppName());

            return convertView;
        }

    }

}