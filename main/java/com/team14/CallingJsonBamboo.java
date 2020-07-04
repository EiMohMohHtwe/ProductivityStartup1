package com.team14;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CallingJsonBamboo extends AppCompatActivity {
    private List<DataFilling> foodMadeList = new ArrayList<>();

    VideoView videoApplecake;
    MediaController mediaControls;
    TextView mTvFoodTitle;
    TextView txtviewIngredients;
    TextView tvIngredients;
    TextView txtviewMethod;
    TextView tvMethod;

    int position = 0;
    int index = 0;
    int vdoArr[] = {R.raw.nightlamp, R.raw.bamboobasketmaking,R.raw.bamboostickphotoframe,R.raw.bamboostickphotoframe,R.raw.bamboobasketmaking};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calling_json_bamboo);

        getSupportActionBar().setIcon(R.mipmap.applogo);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        index = getIntent().getIntExtra("index", 0);

        mTvFoodTitle = findViewById(R.id.tv_food_title);
        txtviewIngredients = findViewById(R.id.txtviewIngredients);
        tvIngredients = findViewById(R.id.tvIngredients);
        txtviewMethod = findViewById(R.id.txtviewMethod);
        tvMethod = findViewById(R.id.tvMethod);
        videoApplecake = (VideoView) findViewById(R.id.vdvApplecake);
        prepareFoodData();
    }

    private void prepareFoodData() {
        try {
            JSONArray arrJSON = new JSONArray(loadJSONFromAsset());
            for (int i = 0; i < arrJSON.length(); i++) {
                JSONObject objJSON = arrJSON.getJSONObject(i);
                DataFilling applecake = new DataFilling(
                        objJSON.getString("title"),
                        objJSON.getString("ingredients"),
                        objJSON.getString("method"),
                        objJSON.getInt("video")
                );
                foodMadeList.add(applecake);
            }
            bindData();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void bindData() {
        DataFilling tmp = foodMadeList.get(index);
        mTvFoodTitle.setText(tmp.getTitle());
        getSupportActionBar().setTitle(tmp.getTitle());

        String tmpString = "";
        String[] tmpArray = tmp.getIngredients().split(",");

        for (int j = 0; j < tmpArray.length; j++) {
            tmpString += tmpArray[j] + "\n\n";
        }
        tvIngredients.setText(tmpString);

        String tmpStringg= "";
        String[] tmpArrayy = tmp.getIngredients().split(",");


        tmpArrayy = tmp.getMethod().split(",");
        for (int k = 0; k < tmpArrayy.length; k++) {
            tmpStringg += tmpArrayy[k] + "\n\n";
        }
        tvMethod.setText(tmpStringg);

        videoApplecake.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + vdoArr[tmp.getVideo()]));
        videoApplecake.requestFocus();
        videoApplecake.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {

            public void onPrepared(MediaPlayer mediaPlayer) {
                videoApplecake.seekTo(position);
                if (position == 0) {
                    videoApplecake.start();
                } else {
                    videoApplecake.pause();
                }
            }
        });

        if (mediaControls == null) {
            mediaControls = new MediaController(CallingJsonBamboo.this);
        }

        videoApplecake.setMediaController(mediaControls);
        videoApplecake.start();
        videoApplecake.pause();
        videoApplecake.resume();
        videoApplecake.seekTo(position);
    }

    private String loadJSONFromAsset() {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            InputStream is = getAssets().open("bamboo.json");
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(is));
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }

            bufferedReader.close();

            Log.d("RESPONSE ", stringBuilder.toString());

            return stringBuilder.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("Position", videoApplecake.getCurrentPosition());
        videoApplecake.pause();
    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        position = savedInstanceState.getInt("Position");
        videoApplecake.seekTo(position);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
