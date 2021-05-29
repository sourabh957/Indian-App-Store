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
1)Jobs In Kerala - ThozhilVartha
	https://play.google.com/store/apps/details?id=com.thozhil.vartha

2)Kerala Bill Pay
	https://play.google.com/store/apps/details?id=com.kerala.bill.pay

3)Kerala Board Textbooks, SCERT Kerala
	https://play.google.com/store/apps/details?id=kerala.board.textbooks

4)Kerala Government Websites
	https://play.google.com/store/apps/details?id=parallel.keralagovtwebsite

5)Kerala GST
	https://play.google.com/store/apps/details?id=nic.kerala.gst.apublic.gst_public

6)Kerala Land Records Online | E - Rekha
	https://play.google.com/store/apps/details?id=com.techuseapps.Kerala_Land_Records

7)Kerala Lottery Result | Search | Scan | Prediction
	https://play.google.com/store/apps/details?id=com.kayla.lotteryresult

8)KeralaMatrimony® - The No. 1 choice of Malayalis
	https://play.google.com/store/apps/details?id=com.keralamatrimony

9)Kerala Pension
	https://play.google.com/store/apps/details?id=in.kerala.gov.in.keralapension

10)Pol-App (Official App of Kerala Police)
	https://play.google.com/store/apps/details?id=com.keralapolice

11)Kerala Startup Mission
	https://play.google.com/store/apps/details?id=com.ksum

12)Kerala Tourism
	https://play.google.com/store/apps/details?id=org.keralatourism.travelkerala

13)Kerala vehicle owner details
	https://play.google.com/store/apps/details?id=in.navaratna9.klvehicledetailsandfine

14)mKeralam
	https://play.google.com/store/apps/details?id=com.itm.MKeralam

15)Malayalam Radio Online
	https://play.google.com/store/apps/details?id=com.malayalam.radios

16)SCERT BOOKS KERALA MALAYALAM
	https://play.google.com/store/apps/details?id=com.mentor.eduapp

17)SPARK OnMobile
	https://play.google.com/store/apps/details?id=in.gov.kerala.spark.onmobile

*/

public class kerelaApps extends AppCompatActivity {

    private List<appStyle> kerela_app_list = new ArrayList<appStyle>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerela_apps);

        ArrayAdapter<appStyle> adapter = new customAdapter();
        kerela_app_list.add(new appStyle("Jobs In Kerala - ThozhilVartha", R.drawable.jobs_in_kerela, "https://play.google.com/store/apps/details?id=com.thozhil.vartha"));
        kerela_app_list.add(new appStyle("Kerala Bill Pay", R.drawable.kerela_bill_pay, "https://play.google.com/store/apps/details?id=com.kerala.bill.pay"));
        kerela_app_list.add(new appStyle("Kerala Board Textbooks, SCERT Kerala", R.drawable.kerela_board_textbooks, "https://play.google.com/store/apps/details?id=kerala.board.textbooks"));
        kerela_app_list.add(new appStyle("Kerala Government Websites", R.drawable.kerela_govenrment_websites, "https://play.google.com/store/apps/details?id=parallel.keralagovtwebsite"));
        kerela_app_list.add(new appStyle("Kerela GST", R.drawable.kerela_gst, "https://play.google.com/store/apps/details?id=nic.kerala.gst.apublic.gst_public"));
        kerela_app_list.add(new appStyle("Kerala Land Records Online | E - Rekha", R.drawable.kerela_land_records, "https://play.google.com/store/apps/details?id=com.techuseapps.Kerala_Land_Records"));
        kerela_app_list.add(new appStyle("Kerala Lottery Result | Search | Scan | Prediction", R.drawable.kerela_lottery_result, "https://play.google.com/store/apps/details?id=com.ap.govtservices"));
        kerela_app_list.add(new appStyle("KeralaMatrimony® - The No. 1 choice of Malayalis", R.drawable.kerela_matrimony, "https://play.google.com/store/apps/details?id=com.andhrapradesh.news.vaarthalu"));
        kerela_app_list.add(new appStyle("Kerala Pension", R.drawable.kerela_pension, "https://play.google.com/store/apps/details?id=in.kerala.gov.in.keralapension"));
        kerela_app_list.add(new appStyle("Pol-App (Official App of Kerala Police)", R.drawable.kerela_police_official, "https://play.google.com/store/apps/details?id=com.keralapolice"));
        kerela_app_list.add(new appStyle("Kerela Startup Mission", R.drawable.kerela_startup_mission, "https://play.google.com/store/apps/details?id=com.ksum"));
        kerela_app_list.add(new appStyle("Kerela Tourism", R.drawable.kerela_tourism, "https://play.google.com/store/apps/details?id=org.keralatourism.travelkerala"));
        kerela_app_list.add(new appStyle("Kerela vehicle owners details", R.drawable.kerela_vehicle_owners_details, "https://play.google.com/store/apps/details?id=in.navaratna9.klvehicledetailsandfine"));
        kerela_app_list.add(new appStyle("mKerelam", R.drawable.m_kerela, "https://play.google.com/store/apps/details?id=com.itm.MKeralam"));
        kerela_app_list.add(new appStyle("Malayalam Radio Online", R.drawable.malayalam_radio_online, "https://play.google.com/store/apps/details?id=com.malayalam.radios"));
        kerela_app_list.add(new appStyle("SCERT BOOKS KERALA MALAYALAM", R.drawable.scert_books_kerela, "https://play.google.com/store/apps/details?id=com.mentor.eduapp"));
        kerela_app_list.add(new appStyle("SPARK onMobile", R.drawable.spark_on_mobile, "https://play.google.com/store/apps/details?id=in.gov.kerala.spark.onmobile"));

        ListView aap = (ListView) findViewById(R.id.kerelaAppListID);
        aap.setAdapter(adapter);

        aap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                appStyle aap = kerela_app_list.get(position);
                Uri uri = Uri.parse(aap.getAppUrl());
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

    }

    private class customAdapter extends ArrayAdapter<appStyle> {
        public customAdapter() {
            super(kerelaApps.this, R.layout.list_view_layout, kerela_app_list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.list_view_layout, parent, false);
            }

            appStyle aps = kerela_app_list.get(position);

            ImageView myImg = (ImageView) convertView.findViewById(R.id.appIcon);
            TextView name = (TextView) convertView.findViewById(R.id.name);

            myImg.setImageResource(aps.getImageID());
            name.setText(aps.getAppName());

            return convertView;
        }

    }

}