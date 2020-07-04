package com.team14;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class CosmeticProduction extends AppCompatActivity implements View.OnClickListener {
    Button btnSoap,btnPowder,btnShampoo,btnOil,btnYogurtScrub,btnRoseToner,btnWashingSoda,btnBodyLotion,btnGel,btnSugarScrub,btnMoisturizer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cosmetic_production);

        getSupportActionBar().setTitle("အလှကုန်များ");
        getSupportActionBar().setIcon(R.mipmap.applogo);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        btnSoap = (Button) findViewById(R.id.soap_btn);
        btnPowder=(Button)findViewById(R.id.powder_btn);
        btnShampoo=(Button)findViewById(R.id.shampoo_btn);
        btnOil=(Button)findViewById(R.id.oil_btn);
        btnYogurtScrub=(Button)findViewById(R.id.yogurt_btn);
        btnRoseToner=(Button)findViewById(R.id.rosetoner_btn);
        btnWashingSoda=(Button)findViewById(R.id.washingsoda_btn);
        btnBodyLotion=(Button)findViewById(R.id.bodylotion_btn);
        btnGel=(Button)findViewById(R.id.gel_btn);
        btnSugarScrub=(Button)findViewById(R.id.sugarscrub_btn);
        btnMoisturizer=(Button)findViewById(R.id.moisturizer_btn);

        btnSoap.setOnClickListener(this);
        btnPowder.setOnClickListener(this);
        btnShampoo.setOnClickListener(this);
        btnOil.setOnClickListener(this);
        btnYogurtScrub.setOnClickListener(this);
        btnRoseToner.setOnClickListener(this);
        btnWashingSoda.setOnClickListener(this);
        btnBodyLotion.setOnClickListener(this);
        btnGel.setOnClickListener(this);
        btnSugarScrub.setOnClickListener(this);
        btnMoisturizer.setOnClickListener(this);
    }

    public void onClick(View v) {
        int id = v.getId ();
        Intent myIntent = new Intent (this, CallingJsonCosmetic.class);
        if (id == R.id.soap_btn) {
            id = 0;
        }
        else if (id==R.id.powder_btn){
            id=1;
        }
        else if (id==R.id.shampoo_btn){
            id=2;
        }
        else if (id==R.id.oil_btn){
            id=3;
        }
        else if (id==R.id.yogurt_btn){
            id=4;
        }
        else if (id==R.id.rosetoner_btn){
            id=5;
        }
        else if (id==R.id.washingsoda_btn){
            id=6;
        }
        else if (id==R.id.bodylotion_btn){
            id=7;
        }
        else if (id==R.id.gel_btn){
            id=8;
        }
        else if (id==R.id.sugarscrub_btn){
            id=9;
        }
        else if (id==R.id.moisturizer_btn){
            id=10;
        }


        myIntent.putExtra ("index", id);
        startActivity (myIntent);
    }

    public void onPointerCaptureChanged(boolean hasCapture) {
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();

        if (id==android.R.id.home){
            this.finish();
        }
        return  super.onOptionsItemSelected(item);
    }
}
