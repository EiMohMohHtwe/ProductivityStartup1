package com.team14;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
Button btnManufacturer,btnManufacturerPhoto,btnBuyer,btnHelp,btnBuyerPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        btnManufacturer=(Button) findViewById(R.id.btnManufacturer);
        btnManufacturerPhoto=(Button)findViewById(R.id.btn_producer_photo);
        btnHelp=(Button)findViewById(R.id.btn_help);
        btnBuyer=(Button) findViewById(R.id.btnBuyer);
        btnBuyerPhoto=(Button)findViewById(R.id.btn_buyer_photo) ;

        btnManufacturer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Manufacturer.class);
                startActivity(i);
            }
        });

        btnManufacturerPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Manufacturer.class);
                startActivity(i);
            }
        });

        btnHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), HelpGuide.class);
                startActivity(i);
            }
        });

        btnBuyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Buyer.class);
                startActivity(i);
            }
        });

        btnBuyerPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Buyer.class);
                startActivity(i);
            }
        });
    }
}
