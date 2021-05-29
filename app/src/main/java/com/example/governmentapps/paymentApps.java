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
1)BHIM - MAKING INDIA CASHLESS
	https://play.google.com/store/apps/details?id=in.org.npci.upiapp

2)Freecharge - Recharges & Bills, Mutual Funds, UPI
	https://play.google.com/store/apps/details?id=com.freecharge.android

3)BHIM UPI, Money Transfer, Recharge & Bill Payment
	https://play.google.com/store/apps/details?id=com.mobikwik_new

4)Bill Payment & Recharge,Wallet
	https://play.google.com/store/apps/details?id=com.oxigen.oxigenwallet&hl=en_IN

5)Paytm - Mobile Recharge, UPI Payments & Bank App
	https://play.google.com/store/apps/details?id=net.one97.paytm

6)PhonePe – UPI Payments, Recharges & Money Transfer
	https://play.google.com/store/apps/details?id=com.phonepe.app

7)YONO SBI: The Mobile Banking and Lifestyle App!
	https://play.google.com/store/apps/details?id=com.sbi.lotusintouch
 */

public class paymentApps extends AppCompatActivity {

    private List<appStyle> payment_apps_list = new ArrayList<appStyle>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_apps);

        ArrayAdapter<appStyle> adapter = new customAdapter();
        payment_apps_list.add(new appStyle("BHIM - MAKING INDIA CASHLESS", R.drawable.bhim, "https://play.google.com/store/apps/details?id=in.org.npci.upiapp"));
        payment_apps_list.add(new appStyle("Freecharge - Recharges & Bills, Mutual Funds, UPI", R.drawable.freecharge, "https://play.google.com/store/apps/details?id=com.freecharge.android"));
        payment_apps_list.add(new appStyle("BHIM UPI, Money Transfer, Recharge & Bill Payment(mobikwik)", R.drawable.mobikwik, "https://play.google.com/store/apps/details?id=com.mobikwik_new"));
        payment_apps_list.add(new appStyle("Bill Payment & Recharge,Wallet", R.drawable.oxigen, "https://play.google.com/store/apps/details?id=com.oxigen.oxigenwallet&hl=en_IN"));
        payment_apps_list.add(new appStyle("Paytm - Mobile Recharge, UPI Payments & Bank App", R.drawable.paytm, "https://play.google.com/store/apps/details?id=net.one97.paytm"));
        payment_apps_list.add(new appStyle("PhonePe – UPI Payments, Recharges & Money Transfer", R.drawable.phone_pe, "https://play.google.com/store/apps/details?id=com.phonepe.app"));
        payment_apps_list.add(new appStyle("YONO SBI: The Mobile Banking and Lifestyle App!", R.drawable.yono_sbi, "https://play.google.com/store/apps/details?id=com.sbi.lotusintouch"));

        ListView aap = (ListView) findViewById(R.id.paymentAppListID);
        aap.setAdapter(adapter);

        aap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                appStyle aap = payment_apps_list.get(position);
                Uri uri = Uri.parse(aap.getAppUrl());
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

    }

    private class customAdapter extends ArrayAdapter<appStyle> {
        public customAdapter() {
            super(paymentApps.this, R.layout.list_view_layout, payment_apps_list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.list_view_layout, parent, false);
            }

            appStyle aps = payment_apps_list.get(position);

            ImageView myImg = (ImageView) convertView.findViewById(R.id.appIcon);
            TextView name = (TextView) convertView.findViewById(R.id.name);

            myImg.setImageResource(aps.getImageID());
            name.setText(aps.getAppName());

            return convertView;
        }

    }

}