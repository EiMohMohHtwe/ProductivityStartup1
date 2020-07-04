package com.team14;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import static com.team14.R.layout.activity_trademark_license;

public class TrademarkLicense extends AppCompatActivity {
    Button btnHomeMade,btnRequirements,btnTypes,btnAdvantages,btnPanishment,btnRawMaterial,btnLocation,btnMachine,btnEmployee,btnClean,btnKeepData;;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trademark_license);
        btnHomeMade=(Button)findViewById (R.id.btnHomeMade);
        btnRequirements=(Button)findViewById (R.id.btnRequirements);
        btnTypes=(Button)findViewById (R.id.btnTypes);
        btnAdvantages=(Button)findViewById (R.id.btnAdvantages);
        btnPanishment=(Button)findViewById(R.id.btnPanishment);
        btnRawMaterial=(Button)findViewById (R.id.btnRawproduct);
        btnLocation=(Button)findViewById (R.id.btnLocation);
        btnMachine=(Button)findViewById (R.id.btnMachine);
        btnEmployee=(Button)findViewById (R.id.btnEmployee);
        btnClean=(Button)findViewById(R.id.btnClean);
        btnKeepData=(Button)findViewById(R.id.btnKeepData);

        getSupportActionBar().setTitle("စံသတ်မှတ်ချက်များ");
        getSupportActionBar().setIcon(R.mipmap.applogo);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        btnHomeMade.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent (TrademarkLicense.this,HomeMade.class);
                startActivity (intent);
            }
        });

        btnRequirements.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent (TrademarkLicense.this,Documents.class);
                startActivity (intent);
            }
        });

        btnTypes.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent (TrademarkLicense.this,Types.class);
                startActivity (intent);
            }
        });

        btnAdvantages.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent (TrademarkLicense.this,Advantages.class);
                startActivity (intent);
            }
        });

        btnPanishment.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent (TrademarkLicense.this,Panishment.class);
                startActivity (intent);
            }
        });
        btnRawMaterial.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent (TrademarkLicense.this,RawMaterialandReadyMade.class);
                startActivity (intent);
            }
        });

        btnLocation.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent (TrademarkLicense.this,Location.class);
                startActivity (intent);
            }
        });

        btnMachine.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent (TrademarkLicense.this,Machine.class);
                startActivity (intent);
            }
        });

        btnEmployee.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent (TrademarkLicense.this,Employee.class);
                startActivity (intent);
            }
        });

        btnClean.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent (TrademarkLicense.this,Clean.class);
                startActivity (intent);
            }
        });

        btnKeepData.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent (TrademarkLicense.this,KeepData.class);
                startActivity (intent);
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
