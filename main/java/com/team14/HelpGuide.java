package com.team14;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.viewpagerindicator.CirclePageIndicator;

public class HelpGuide extends AppCompatActivity {
    ViewPager viewPager;
    CirclePageIndicator circlePageIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_guide);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        circlePageIndicator = findViewById(R.id.indicator);

        ViewPagerAdapter viewPagerAdapter;
        viewPagerAdapter = new ViewPagerAdapter(this);
        viewPager.setAdapter(viewPagerAdapter);
        circlePageIndicator.setViewPager(viewPager);

        getSupportActionBar().setTitle("အသုံးပြုနည်းလမ်းညွှန်");
        getSupportActionBar().setIcon(R.mipmap.applogo);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
