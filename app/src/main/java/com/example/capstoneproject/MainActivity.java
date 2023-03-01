package com.example.capstoneproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.capstoneproject.faq.ApplicationLeasingActivity;
import com.example.capstoneproject.faq.HearingActivity;
import com.example.capstoneproject.faq.LeaseRenewalActivity;
import com.example.capstoneproject.faq.MaintenanceActivity;
import com.example.capstoneproject.faq.RentControlActivity;
import com.example.capstoneproject.faq.RentIssuesActivity;
import com.example.capstoneproject.faq.RoommateReplacementActivity;
import com.example.capstoneproject.faq.WarningLettersActivity;

public class MainActivity extends AppCompatActivity {

    LinearLayout ApplicationLeasing;
    LinearLayout RoommateReplacement;
    LinearLayout rentIssues;
    LinearLayout warningLetters;
    LinearLayout leaseRenewal;
    LinearLayout hearing;
    LinearLayout maintenance;
    LinearLayout rentControl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApplicationLeasing = findViewById(R.id.ApplicationLeasing);
        RoommateReplacement = findViewById(R.id.RoommateReplacement);
        rentIssues = findViewById(R.id.rentIssues);
        warningLetters = findViewById(R.id.warningLetters);
        leaseRenewal = findViewById(R.id.leaseRenewal);
        hearing = findViewById(R.id.hearing);
        maintenance = findViewById(R.id.maintenance);
        rentControl = findViewById(R.id.rentControl);

        ApplicationLeasing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ApplicationLeasingActivity.class);
                startActivity(intent);
            }
        });

        RoommateReplacement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RoommateReplacementActivity.class);
                startActivity(intent);
            }
        });

        rentIssues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RentIssuesActivity.class);
                startActivity(intent);
            }
        });

        warningLetters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WarningLettersActivity.class);
                startActivity(intent);
            }
        });

        leaseRenewal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LeaseRenewalActivity.class);
                startActivity(intent);
            }
        });

        hearing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HearingActivity.class);
                startActivity(intent);
            }
        });

        maintenance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MaintenanceActivity.class);
                startActivity(intent);
            }
        });

        rentControl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RentControlActivity.class);
                startActivity(intent);
            }
        });


    }


}