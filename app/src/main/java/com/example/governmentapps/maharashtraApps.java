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
1)Aaple Sarkar
	https://play.google.com/store/apps/details?id=com.aaplesarkar

2)E-Tender Maharashtra
	https://play.google.com/store/apps/details?id=raza1001.com.etendersmaharashtra

3) महाराष्ट्राचा इतिहास - History of Maharashtra
	https://play.google.com/store/apps/details?id=com.historyisfun.maharashtra

4)MAHA Bhulekh - Maharashtra Bhumi Abhilekh 7/12 8A
	https://play.google.com/store/apps/details?id=com.maharashtra.bhulekh

5)Maha E Seva Maharashtra E Seva
	https://play.google.com/store/apps/details?id=com.visiontotech.maharashtraseva

6)Maharashtra Government Jobs
	https://play.google.com/store/apps/details?id=com.zeejobs.maharashtra

7)आपल्या योजना - महाराष्ट्र शासन योजना Gov. Scheme
	https://play.google.com/store/apps/details?id=com.maha.shasan.yojana

8)महा जॉब अलर्ट - Maharashtra Govt Jobs
	https://play.google.com/store/apps/details?id=in.mahajobalert.mahajobalert

9)Maharashtra Ration card
	https://play.google.com/store/apps/details?id=maharashtra.rationcard

10)Maharashtra State Board Books
	https://play.google.com/store/apps/details?id=maharashtra.state.board.textbooks

11)Maharashtra Website Directory : उपयुक्त संकेतस्थळे
	https://play.google.com/store/apps/details?id=labs.onyx.maharashtrawebsitedirectory

12)RTO Maharashtra
	https://play.google.com/store/apps/details?id=in.mahatranscom.app

13)RTO Vehicle Information Maharashtra
	https://play.google.com/store/apps/details?id=com.margaloo.rtovehicleinfo

 */


public class maharashtraApps extends AppCompatActivity {

    private List<appStyle> maharashtra_app_list = new ArrayList<appStyle>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maharashtra_apps);

        ArrayAdapter<appStyle> adapter = new customAdapter();
        maharashtra_app_list.add(new appStyle("Aaple Sarkar", R.drawable.aaple_sarkar, "https://play.google.com/store/apps/details?id=com.aaplesarkar"));
        maharashtra_app_list.add(new appStyle("E-Tender Maharashtra", R.drawable.e_tender_mh, "https://play.google.com/store/apps/details?id=raza1001.com.etendersmaharashtra"));
        maharashtra_app_list.add(new appStyle("महाराष्ट्राचा इतिहास - History of Maharashtra", R.drawable.history_of_mh, "https://play.google.com/store/apps/details?id=com.historyisfun.maharashtra"));
        maharashtra_app_list.add(new appStyle("MAHA Bhulekh - Maharashtra Bhumi Abhilekh 7/12 8A", R.drawable.mh_bhulekha, "https://play.google.com/store/apps/details?id=com.maharashtra.bhulekh"));
        maharashtra_app_list.add(new appStyle("Maha E Seva Maharashtra E Seva", R.drawable.mh_e_seva, "https://play.google.com/store/apps/details?id=com.visiontotech.maharashtraseva"));
        maharashtra_app_list.add(new appStyle("Maharashtra Government Jobs", R.drawable.mh_government_jobs, "https://play.google.com/store/apps/details?id=com.zeejobs.maharashtra"));
        maharashtra_app_list.add(new appStyle("आपल्या योजना - महाराष्ट्र शासन योजना Gov. Scheme", R.drawable.mh_government_schemes, "https://play.google.com/store/apps/details?id=com.maha.shasan.yojana"));
        maharashtra_app_list.add(new appStyle("महा जॉब अलर्ट - Maharashtra Govt Jobs", R.drawable.mh_jobs_alert, "https://play.google.com/store/apps/details?id=in.mahajobalert.mahajobalert"));
        maharashtra_app_list.add(new appStyle("Maharashtra Ration card", R.drawable.mh_ration_card, "https://play.google.com/store/apps/details?id=maharashtra.rationcard"));
        maharashtra_app_list.add(new appStyle("Maharashtra State Board Books", R.drawable.mh_state_board_books, "https://play.google.com/store/apps/details?id=maharashtra.state.board.textbooks"));
        maharashtra_app_list.add(new appStyle("Maharashtra Website Directory : उपयुक्त संकेतस्थळे", R.drawable.mh_website_directory, "https://play.google.com/store/apps/details?id=labs.onyx.maharashtrawebsitedirectory"));
        maharashtra_app_list.add(new appStyle("RTO Maharashtra", R.drawable.rto_mh, "https://play.google.com/store/apps/details?id=in.mahatranscom.app"));
        maharashtra_app_list.add(new appStyle("RTO Vehicle Information Maharashtra", R.drawable.rto_vehicle_information_mh, "https://play.google.com/store/apps/details?id=com.margaloo.rtovehicleinfo"));

        ListView aap = (ListView) findViewById(R.id.maharashtraAppListID);
        aap.setAdapter(adapter);

        aap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                appStyle aap = maharashtra_app_list.get(position);
                Uri uri = Uri.parse(aap.getAppUrl());
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

    }

    private class customAdapter extends ArrayAdapter<appStyle> {
        public customAdapter() {
            super(maharashtraApps.this, R.layout.list_view_layout, maharashtra_app_list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.list_view_layout, parent, false);
            }

            appStyle aps = maharashtra_app_list.get(position);

            ImageView myImg = (ImageView) convertView.findViewById(R.id.appIcon);
            TextView name = (TextView) convertView.findViewById(R.id.name);

            myImg.setImageResource(aps.getImageID());
            name.setText(aps.getAppName());

            return convertView;
        }

    }

}