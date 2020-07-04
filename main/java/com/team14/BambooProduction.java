package com.team14;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class BambooProduction extends AppCompatActivity implements View.OnClickListener {

    Button btnlamp,btnfowerbasket,btnbookshelf,btnphotoframe,btnfruitbasket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bamboo_production);

        getSupportActionBar().setTitle("ဝါးထုတ်ကုန်များ");
        getSupportActionBar().setIcon(R.mipmap.applogo);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        btnlamp = (Button) findViewById(R.id.Lamp_btn);
        btnfowerbasket=(Button)findViewById(R.id.flowerBasket_btn);
        btnbookshelf=(Button)findViewById(R.id.bookshelf_btn);
        btnphotoframe=(Button)findViewById(R.id.photoframe_btn);
        btnfruitbasket=(Button)findViewById(R.id.fruitbasket_btn);



        btnlamp.setOnClickListener(this);
        btnfowerbasket.setOnClickListener(this);
        btnbookshelf.setOnClickListener(this);
        btnphotoframe.setOnClickListener(this);
        btnfruitbasket.setOnClickListener(this);

    }

    public void onClick(View v) {
        int id = v.getId ();
        Intent myIntent = new Intent (this, CallingJsonBamboo.class);
        if (id == R.id.Lamp_btn) {
            id = 0;
        }
        else if (id==R.id.flowerBasket_btn){
            id=1;
        }
        else if (id==R.id.bookshelf_btn){
            id=2;
        }
        else if (id==R.id.photoframe_btn){
            id=3;
        }
        else if (id==R.id.fruitbasket_btn){
            id=4;
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
