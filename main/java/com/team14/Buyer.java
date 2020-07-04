package com.team14;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Buyer extends AppCompatActivity {

    Button btnHtanyatcall,btnTeamixCall,btnKeychangeCall,btnHatCall,btnBellaCall,btnBrushCall;

    boolean hasPhoneCallPermission;
    private int REQUEST_PHONECALL = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buyer);

        getSupportActionBar().setTitle("ကုန်ပစ္စည်းများ");
        getSupportActionBar().setIcon(R.mipmap.applogo);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        btnHtanyatcall=(Button)findViewById (R.id.btnHtanyatCall);
        btnTeamixCall=(Button)findViewById (R.id.btnTeamixCall);
        btnKeychangeCall=(Button)findViewById (R.id.btnKeyChangeCall);
        btnHatCall=(Button)findViewById (R.id.btnHatCall);
        btnBellaCall=(Button)findViewById (R.id.btnLipstickCall);
        btnBrushCall=(Button)findViewById (R.id.btnBurshCall);

        hasPhoneCallPermission = (ContextCompat.checkSelfPermission(Buyer.this,
            Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED);
        if(!hasPhoneCallPermission){
            ActivityCompat.requestPermissions(Buyer.this,
                    new String[]{Manifest.permission.CALL_PHONE},
                    REQUEST_PHONECALL);
        }

        btnHtanyatcall.setOnClickListener (new View.OnClickListener(){
            @SuppressLint("MissingPermission")
            @Override
            public void onClick(View v) {
                if(hasPhoneCallPermission) {
                    Intent callIntent = new Intent (Intent.ACTION_DIAL);
                    callIntent.setData (Uri.parse ("tel:09793107725"));
                    startActivity (callIntent);
                }
                else{
                    ActivityCompat.requestPermissions(Buyer.this,
                            new String[]{Manifest.permission.CALL_PHONE},
                            REQUEST_PHONECALL);
                }
            }
        });

        btnTeamixCall.setOnClickListener (new View.OnClickListener(){
            @SuppressLint("MissingPermission")
            @Override
            public void onClick(View v) {
                if(hasPhoneCallPermission) {
                    Intent callIntent = new Intent (Intent.ACTION_DIAL);
                    callIntent.setData (Uri.parse ("tel:09789313155"));
                    startActivity (callIntent);
                }
                else{
                    ActivityCompat.requestPermissions(Buyer.this,
                            new String[]{Manifest.permission.CALL_PHONE},
                            REQUEST_PHONECALL);
                }
            }
        });

        btnKeychangeCall.setOnClickListener (new View.OnClickListener(){
            @SuppressLint("MissingPermission")
            @Override
            public void onClick(View v) {
                if(hasPhoneCallPermission) {
                    Intent callIntent = new Intent (Intent.ACTION_DIAL);
                    callIntent.setData (Uri.parse ("tel:081201105"));
                    startActivity (callIntent);
                }
                else{
                    ActivityCompat.requestPermissions(Buyer.this,
                            new String[]{Manifest.permission.CALL_PHONE},
                            REQUEST_PHONECALL);
                }
            }
        });

        btnHatCall.setOnClickListener (new View.OnClickListener(){
            @SuppressLint("MissingPermission")
            @Override
            public void onClick(View v) {
                if(hasPhoneCallPermission) {
                    Intent callIntent = new Intent (Intent.ACTION_DIAL);
                    callIntent.setData (Uri.parse ("tel:081201105"));
                    startActivity (callIntent);
                }
                else{
                    ActivityCompat.requestPermissions(Buyer.this,
                            new String[]{Manifest.permission.CALL_PHONE},
                            REQUEST_PHONECALL);
                }
            }
        });

        btnBellaCall.setOnClickListener (new View.OnClickListener(){
            @SuppressLint("MissingPermission")
            @Override
            public void onClick(View v) {
                if(hasPhoneCallPermission) {
                    Intent callIntent = new Intent (Intent.ACTION_DIAL);
                    callIntent.setData (Uri.parse ("tel:09591266"));
                    startActivity (callIntent);
                }
                else{
                    ActivityCompat.requestPermissions(Buyer.this,
                            new String[]{Manifest.permission.CALL_PHONE},
                            REQUEST_PHONECALL);
                }
            }
        });
        btnBrushCall.setOnClickListener (new View.OnClickListener(){
            @SuppressLint("MissingPermission")
            @Override
            public void onClick(View v) {
                if(hasPhoneCallPermission) {
                    Intent callIntent = new Intent (Intent.ACTION_DIAL);
                    callIntent.setData (Uri.parse ("tel:0978508347"));
                    startActivity (callIntent);
                }
                else{
                    ActivityCompat.requestPermissions(Buyer.this,
                            new String[]{Manifest.permission.CALL_PHONE},
                            REQUEST_PHONECALL);
                }
            }
        });

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        if (requestCode == REQUEST_PHONECALL && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            hasPhoneCallPermission = true;
        }
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if (id==android.R.id.home){
            this.finish();
        }
        return  super.onOptionsItemSelected(item);
    }
}
