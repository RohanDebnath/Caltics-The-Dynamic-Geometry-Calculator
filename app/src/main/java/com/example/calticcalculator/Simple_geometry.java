package com.example.calticcalculator;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Simple_geometry extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String [] figure_name= {"Select","Circle","Square","Rhombus","Rectangle","Triangle"};
    int [] figure_icon={R.drawable.select,R.drawable.circle,R.drawable.square,R.drawable.rombus,
            R.drawable.rectangle,R.drawable.triangle};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_geometry);


        Spinner Geometry_Shape_Spinner = findViewById(R.id.geo_spinner);
        Geometry_Shape_Spinner.setOnItemSelectedListener(this);
        Geometry_Item_Adapter adapter = new Geometry_Item_Adapter(this, figure_name,figure_icon);
        Geometry_Shape_Spinner.setAdapter(adapter);

    }



    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        Toast.makeText(this,figure_name[position],Toast.LENGTH_LONG).show();


        switch (position)
        {
            case 1:
                Intent intent = new Intent(Simple_geometry.this,circle1.class);
                startActivity(intent);
                break;

            case 2:
                Intent intent_sq= new Intent(Simple_geometry.this,Square.class);
                startActivity(intent_sq);
                break;
            case 3:
                Intent intent_rm = new Intent(Simple_geometry.this,Rombus.class);
                startActivity(intent_rm);
                break;

            case 4:
                Intent intent_rec = new Intent(Simple_geometry.this,Rectangle.class);
                startActivity(intent_rec);
                break;
            case 5:
                Intent intent_tri = new Intent(Simple_geometry.this,Triangle.class);
                startActivity(intent_tri);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}