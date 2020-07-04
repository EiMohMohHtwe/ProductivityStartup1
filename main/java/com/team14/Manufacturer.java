package com.team14;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toolbar;

public class Manufacturer extends AppCompatActivity {
    Button btnFoodProduction,btnCosmeticProduction,btnProductSelling,btnTrademarkLicense,btnBambooProduction,btnFoodPhoto,btnCosmeticPhoto,btnProductSellingPhoto,btnTrademarkLicensePhoto,btnBambooPhoto,btnProductionStandard,btnProductionStandardPhoto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manufacturer);

        getSupportActionBar().setTitle("ကုန်ချောထုတ်စို့");
        getSupportActionBar().setIcon(R.mipmap.applogo);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        btnFoodProduction=(Button)findViewById(R.id.btnFood);
        btnFoodPhoto=(Button)findViewById(R.id.btn_food_photo);
        btnCosmeticProduction=(Button) findViewById(R.id.btnCosmetic);
        btnCosmeticPhoto=(Button)findViewById(R.id.btn_cosmetic_photo);
        btnProductSelling=(Button) findViewById(R.id.btnBusiness);
        btnProductSellingPhoto=(Button)findViewById(R.id.btn_business_photo);
        btnTrademarkLicense=(Button) findViewById(R.id.btnRegister);
        btnTrademarkLicensePhoto=(Button)findViewById(R.id.btn_register_photo);
        btnBambooProduction=(Button) findViewById(R.id.btnBamboo);
        btnBambooPhoto=(Button)findViewById(R.id.btn_bamboo_photo);
        btnProductionStandard=(Button)findViewById(R.id.btnStandard);
        btnProductionStandardPhoto=(Button)findViewById(R.id.btn_standard_photo);

        btnProductionStandard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ProductionStandard.class);
                startActivity(i);
            }
        });

        btnProductionStandardPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ProductionStandard.class);
                startActivity(i);
            }
        });

        btnFoodPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), FoodProduction.class);
                startActivity(i);
            }
        });

        btnFoodProduction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), FoodProduction.class);
                startActivity(i);

            }

        });
        btnCosmeticPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), CosmeticProduction.class);
                startActivity(i);
            }
        });
        btnCosmeticProduction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), CosmeticProduction.class);
                startActivity(i);

            }

        });

        btnProductSellingPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ProductSelling.class);
                startActivity(i);
            }
        });
        btnProductSelling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ProductSelling.class);
                startActivity(i);

            }

        });

        btnTrademarkLicensePhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), TrademarkLicense.class);
                startActivity(i);
            }
        });
        btnTrademarkLicense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), TrademarkLicense.class);
                startActivity(i);

            }

        });

        btnBambooPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), BambooProduction.class);
                startActivity(i);
            }
        });

        btnBambooProduction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), BambooProduction.class);
                startActivity(i);
            }

        });
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if (id==android.R.id.home){
            this.finish();
        }
        return  super.onOptionsItemSelected(item);
    }
}
