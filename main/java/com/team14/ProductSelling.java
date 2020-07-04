package com.team14;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class ProductSelling extends AppCompatActivity {
    private static EditText username;
    private static EditText password;
    private static TextView attempts;
    private static Button login_btn;
    int attempt_counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_selling);

        getSupportActionBar().setTitle("ထုတ်ကုန်ရောင်းခြင်း\n");
        getSupportActionBar().setIcon(R.mipmap.applogo);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        LoginButton();
    }
    public  void LoginButton() {
        username = (EditText)findViewById(R.id.editText_user);
        password = (EditText)findViewById(R.id.editText_password);
        attempts = (TextView)findViewById(R.id.textView_attemt_Count);
        login_btn = (Button)findViewById(R.id.button_login);

        attempts.setText(Integer.toString(attempt_counter));

        login_btn.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        if(username.getText().toString().equals("farmer") &&
                                password.getText().toString().equals("P@ssw0rd")  ) {
                            Toast.makeText(ProductSelling.this,"User and Password is correct",
                                    Toast.LENGTH_SHORT).show();
                            //Intent intent = new Intent("com.example.programmingknowledge.simpleloginapp.User");
                            Intent intent = new Intent(getApplicationContext(), SellingForm.class);
                            startActivity(intent);
                        } else {
                            Toast.makeText(ProductSelling.this,"User and Password is not correct",
                                    Toast.LENGTH_SHORT).show();
                            attempt_counter--;
                            attempts.setText(Integer.toString(attempt_counter));
                            if(attempt_counter == 0){
                                login_btn.setEnabled(false);
                            }
                        }

                    }
                }
        );
    }


    public boolean onCreateOptionsMenu(MenuItem menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        // getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id==android.R.id.home){
            this.finish();
        }

        //noinspection SimplifiableIfStatement
       /* if (id == R.id.action_settings) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }



}
