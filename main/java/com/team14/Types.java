package com.team14;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Types extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    int pause;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_types);

        mediaPlayer=MediaPlayer.create(this,R.raw.types);
        Button btnPlay = (Button)findViewById(R.id.btnvoiceStart);
        Button btnStop = (Button)findViewById(R.id.btnvoiceStop);

        btnPlay.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
                Toast.makeText(getApplicationContext(),"ဖွင့်သည်။",Toast.LENGTH_SHORT).show();
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.pause();
                pause=mediaPlayer.getCurrentPosition();
                Toast.makeText(getApplicationContext(),"ရပ်သည်။",Toast.LENGTH_SHORT).show();
            }
        });

        getSupportActionBar().setTitle("မှတ်ပုံတင်လုပ်ငန်း အမျိုးအစားများ\n");
        getSupportActionBar().setIcon(R.mipmap.applogo);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    protected void onDestroy() {
        super.onDestroy();
        mediaPlayer.stop();
        mediaPlayer.release();
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if (id==android.R.id.home){
            this.finish();
        }
        return  super.onOptionsItemSelected(item);
    }
}
