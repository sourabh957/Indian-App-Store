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
1)ALTBalaji - Watch Web Series, Originals & Movies
	https://play.google.com/store/apps/details?id=com.balaji.alt

2)BookMyShow - Movie Tickets & Live Events
	https://play.google.com/store/apps/details?id=com.bt.bms

3)Gaana Music Hindi Tamil Telugu Songs Free MP3 App
	https://play.google.com/store/apps/details?id=com.gaana

4)Indian Meme Generator - WAStickerApps Stickers
	https://play.google.com/store/apps/details?id=com.ammdhillon.indianmemepack

5)India Tok –Share Videos ,Status Downloader,Shayari
	https://play.google.com/store/apps/details?id=com.rudax.indiatok

6)JioCinema: Movies TV Originals
	https://play.google.com/store/apps/details?id=com.jio.media.ondemand

7)JioSaavn Music & Radio – JioTunes, Podcasts, Songs
	https://play.google.com/store/apps/details?id=com.jio.media.jiobeats

8)JioTV – News, Movies, Entertainment, LIVE TV
	https://play.google.com/store/apps/details?id=com.jio.jioplay.tv

9)Mitron
	https://play.google.com/store/apps/details?id=com.mitron.tv

10)Mp4 HD Player - Music Player & Media Player
	https://play.google.com/store/apps/details?id=videoplayer.musicplayer.mp4player.mediaplayer&hl=en_IN

11)nexGTv HD:Mobile TV, Live TV
	https://play.google.com/store/apps/details?id=com.mediamatrix.nexgtv.hd

12)Roposo - Video Status, Earn Money, Friends Chat
	https://play.google.com/store/apps/details?id=com.roposo.android

13)Voot-Voot Select Originals, Colors TV, MTV & more
	https://play.google.com/store/apps/details?id=com.tv.v18.viola

14)Wynk Music - Download & Play Songs, MP3, HelloTune
	https://play.google.com/store/apps/details?id=com.bsbportal.music

15)ZEE5 - Latest Movies, Originals & TV Shows
	https://play.google.com/store/apps/details?id=com.graymatrix.did
 */


public class entertainmentApps extends AppCompatActivity {

    public List<appStyle> entertainment_app_list = new ArrayList<appStyle>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment_apps);

        ArrayAdapter<appStyle> adapter = new customAdapter();

        entertainment_app_list.add(new appStyle("ALTBalaji - Watch Web Series, Originals & Movies", R.drawable.alt_balaji, "https://play.google.com/store/apps/details?id=com.balaji.alt"));
        entertainment_app_list.add(new appStyle("BookMyShow - Movie Tickets & Live Events", R.drawable.book_my_show, "https://play.google.com/store/apps/details?id=com.bt.bms"));
        entertainment_app_list.add(new appStyle("Gaana Music Hindi Tamil Telugu Songs Free MP3 App", R.drawable.gaana_music_app, "https://play.google.com/store/apps/details?id=com.gaana"));
        entertainment_app_list.add(new appStyle("Indian Meme Generator - WAStickerApps Stickers", R.drawable.indian_meme_generator_app, "https://play.google.com/store/apps/details?id=com.ammdhillon.indianmemepack"));
        entertainment_app_list.add(new appStyle("India Tok –Share Videos ,Status Downloader,Shayari", R.drawable.indian_tok, "https://play.google.com/store/apps/details?id=com.rudax.indiatok"));
        entertainment_app_list.add(new appStyle("JioCinema: Movies TV Originals", R.drawable.jio_cinema, "https://play.google.com/store/apps/details?id=com.jio.media.ondemand"));
        entertainment_app_list.add(new appStyle("JioSaavn Music & Radio – JioTunes, Podcasts, Songs", R.drawable.jio_saavn_music_app, "https://play.google.com/store/apps/details?id=com.jio.media.jiobeats"));
        entertainment_app_list.add(new appStyle("JioTV – News, Movies, Entertainment, LIVE TV", R.drawable.jio_tv, "https://play.google.com/store/apps/details?id=com.jio.jioplay.tv"));
        entertainment_app_list.add(new appStyle("Mitron", R.drawable.mitron_app, "https://play.google.com/store/apps/details?id=com.mitron.tv"));
        entertainment_app_list.add(new appStyle("Mp4 HD Player - Music Player & Media Player", R.drawable.mp4_hd_player, "https://play.google.com/store/apps/details?id=videoplayer.musicplayer.mp4player.mediaplayer&hl=en_IN"));
        entertainment_app_list.add(new appStyle("nexGTv HD:Mobile TV, Live TV", R.drawable.nex_gtv, "https://play.google.com/store/apps/details?id=com.mediamatrix.nexgtv.hd"));
        entertainment_app_list.add(new appStyle("Roposo - Video Status, Earn Money, Friends Chat", R.drawable.roposo_video, "https://play.google.com/store/apps/details?id=com.roposo.android"));
        entertainment_app_list.add(new appStyle("Voot-Voot Select Originals, Colors TV, MTV & more", R.drawable.voot_app, "https://play.google.com/store/apps/details?id=com.tv.v18.viola"));
        entertainment_app_list.add(new appStyle("Wynk Music - Download & Play Songs, MP3, HelloTune", R.drawable.wynk_music, "https://play.google.com/store/apps/details?id=com.bsbportal.music"));
        entertainment_app_list.add(new appStyle("ZEE5 - Latest Movies, Originals & TV Shows", R.drawable.zee_5_app, "https://play.google.com/store/apps/details?id=com.graymatrix.did"));


        ListView aap = (ListView) findViewById(R.id.entertainmentAppListId);
        aap.setAdapter(adapter);

        aap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                appStyle aap = entertainment_app_list.get(position);
                Uri uri = Uri.parse(aap.getAppUrl());
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

    }

    private class customAdapter extends ArrayAdapter<appStyle> {
        public customAdapter() {
            super(entertainmentApps.this, R.layout.list_view_layout, entertainment_app_list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.list_view_layout, parent, false);
            }

            appStyle aps = entertainment_app_list.get(position);

            ImageView myImg = (ImageView) convertView.findViewById(R.id.appIcon);
            TextView name = (TextView) convertView.findViewById(R.id.name);

            myImg.setImageResource(aps.getImageID());
            name.setText(aps.getAppName());

            return convertView;
        }

    }

}