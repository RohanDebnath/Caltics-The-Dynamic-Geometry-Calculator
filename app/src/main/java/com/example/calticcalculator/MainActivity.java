package com.example.calticcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageButton creator,second;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //buttton
        creator = findViewById(R.id.Contibutor);
        second = findViewById(R.id.second_page);

        creator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                app_maker();
            }
        });

        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second_page();
            }
        });
    }

    private void second_page() {

        Intent intent = new Intent(this,Second_page.class);
        startActivity(intent);
    }

    private void app_maker() {
        Intent intent = new Intent(this, makers.class);
        startActivity(intent);

    }
}