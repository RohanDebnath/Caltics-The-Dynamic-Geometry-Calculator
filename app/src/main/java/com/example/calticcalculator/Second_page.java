package com.example.calticcalculator;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Second_page extends AppCompatActivity {
    ImageButton Simplegeomerty , Conicsection , bankformula;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
        Simplegeomerty= findViewById(R.id.simple_geo);
        Conicsection= findViewById(R.id.conic_formula);
        bankformula=findViewById(R.id.ban_formula);
// classes_sub
        Simplegeomerty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s_g();
            }
        });

        Conicsection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c_s();
            }
        });

        bankformula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b_f();
            }
        });

    }

    private void b_f() {
        Intent intent = new Intent(this, Bank_Formula.class );
        startActivity(intent);
    }

    private void c_s() {
        Intent intent = new Intent(this, Conic_section.class);
        startActivity(intent);

    }

    private void s_g() {
        Intent intent = new Intent(this, Simple_geometry.class);
        startActivity(intent);
    }
}