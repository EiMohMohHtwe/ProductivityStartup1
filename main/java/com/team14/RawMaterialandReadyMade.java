package com.team14;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RawMaterialandReadyMade extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    int pause;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raw_materialand_ready_made);
        Button btnPlay = (Button)findViewById(R.id.btnvoiceStart);
        Button btnStop = (Button)findViewById(R.id.btnvoiceStop);

        mediaPlayer=MediaPlayer.create(this,R.raw.rawmaterial);

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

        getSupportActionBar().setTitle(" ကုန်ကြမ်းနှင့်ကုန်ချော အရည်အသွေးစစ်ဆေးခြင်း");
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
