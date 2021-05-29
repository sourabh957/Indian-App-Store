package com.example.governmentapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    Button governmentApps, educationaApps, entertainmentApps, treavellingApps, newsApps, paymentApps, gamesApps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getWindow().setBackgroundDrawableResource(R.drawable.indian_flag2);

        governmentApps = (Button)findViewById(R.id.government);
        governmentApps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGovActivity();
            }
        });

        educationaApps = (Button) findViewById(R.id.educational);
        educationaApps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEducationalActivity();
            }
        });

        entertainmentApps = (Button) findViewById(R.id.entertainment);
        entertainmentApps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEntertainmentActivity();
            }
        });

        treavellingApps = (Button) findViewById(R.id.travelling);
        treavellingApps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTravellingAppsActivity();
            }
        });

        newsApps = (Button) findViewById(R.id.news);
        newsApps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewsAppsActivity();
            }
        });

        paymentApps = (Button) findViewById(R.id.payment);
        paymentApps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPaymentAppsActivity();
            }
        });

        gamesApps = (Button) findViewById(R.id.games);
        gamesApps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGamesAppsActivity();
            }
        });
    }

    private void openGamesAppsActivity() {
        Intent intent = new Intent(this, gamesApps.class);
        startActivity(intent);
    }

    private void openPaymentAppsActivity() {
        Intent intent = new Intent(this, paymentApps.class);
        startActivity(intent);
    }

    private void openNewsAppsActivity() {
        Intent intent = new Intent(this, newsApps.class);
        startActivity(intent);
    }

    private void openTravellingAppsActivity() {
        Intent intent = new Intent(this, travellingApps.class);
        startActivity(intent);
    }

    private void openEntertainmentActivity() {
        Intent intent = new Intent(this, entertainmentApps.class);
        startActivity(intent);
    }

    private void openEducationalActivity() {
        Intent intent = new Intent(this, educationalApps.class);
        startActivity(intent);
    }

    private void openGovActivity() {
        Intent intent = new Intent(this , govApps.class);
        startActivity(intent);
    }
}