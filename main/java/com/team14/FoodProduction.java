package com.team14;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toolbar;

public class FoodProduction extends AppCompatActivity implements View.OnClickListener {
    Button btnMadeappCake,btnLemonJuice,btnTomatoSauce,btnPineappeJuice,btnPumKim,btnPotato,btnGarlic,btnEggandPeanut,btnBanna;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_production);

        getSupportActionBar().setTitle("စားသောက်ကုန်များ");
        getSupportActionBar().setIcon(R.mipmap.applogo);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        btnMadeappCake=(Button) findViewById (R.id.applecake_btn);
        btnLemonJuice=(Button) findViewById (R.id.LemonJuice_btn);
        btnTomatoSauce=(Button)findViewById(R.id.TomatoSauce_btn);
        btnPineappeJuice=(Button)findViewById(R.id.pineapple_btn);
        btnPumKim=(Button)findViewById(R.id.pumkim_btn);
        btnBanna=(Button)findViewById(R.id.banna_btn);
        btnEggandPeanut=(Button)findViewById(R.id.eggandpeanut_btn);
        btnPotato=(Button)findViewById(R.id.potato_btn);
        btnGarlic=(Button)findViewById(R.id.garlic_btn);

        btnMadeappCake.setOnClickListener(this);
        btnLemonJuice.setOnClickListener (this);
        btnTomatoSauce.setOnClickListener(this);
        btnPineappeJuice.setOnClickListener(this);
        btnPumKim.setOnClickListener(this);
        btnGarlic.setOnClickListener(this);
        btnPotato.setOnClickListener(this);
        btnBanna.setOnClickListener(this);
        btnEggandPeanut.setOnClickListener(this);
        }

    private void setSupportActionBar(Toolbar toolbar) {
    }

    public void onClick(View v) {
        int id = v.getId ();
        Intent myIntent = new Intent (this, CallingJson.class);
        if (id == R.id.applecake_btn) {
            id = 0;
        }
        else if (id == R.id.LemonJuice_btn) {
            id = 1;
        }
        else if (id==R.id.TomatoSauce_btn){
            id=2;
        }
        else if(id==R.id.pineapple_btn){
            id=3;
        }
        else if (id==R.id.pumkim_btn){
            id=4;
        }
        else if (id == R.id.potato_btn) {
            id = 5;
        }
        else if (id==R.id.garlic_btn){
            id=6;
        }
        else if(id==R.id.eggandpeanut_btn){
            id=7;
        }
        else if (id==R.id.banna_btn){
            id=8;
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

