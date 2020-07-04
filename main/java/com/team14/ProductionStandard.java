package com.team14;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class ProductionStandard extends AppCompatActivity {

    EditText etname, etemail, etcompany, etnumber;
    Button submit;
    String name, email, company, number;
    RelativeLayout relativeLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_production_standard);


        getSupportActionBar().setTitle("မှတ်ပုံတင်ခြင်း");
        getSupportActionBar().setIcon(R.mipmap.applogo);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        etname = (EditText) findViewById(R.id.etname);
        etemail = (EditText) findViewById(R.id.etNRC);
        etcompany = (EditText) findViewById(R.id.etcompany);
        etnumber = (EditText) findViewById(R.id.etphone);
        submit = (Button) findViewById(R.id.submit);
        name = etname.getText().toString();
        email = etemail.getText().toString();
        company = etcompany.getText().toString();
        number = etnumber.getText().toString();

        //relativeLayout = (RelativeLayout) findViewById(R.id.snack);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDatabase mydatabase = new MyDatabase(ProductionStandard.this);
                boolean trt = mydatabase.insertdata(name, email, company, number);

                if (trt) {
                    // Snackbar snackbar = Snackbar.make(relativeLayout,"Database Inserted",12000);
                    // snackbar.setDuration(12000);
                    //  snackbar.show();
                    Toast.makeText(getApplicationContext(), "Saved successfully", Toast.LENGTH_SHORT).show();
                    etname.setText("");
                    etemail.setText("");
                    etcompany.setText("");
                    etnumber.setText("");
                }
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
