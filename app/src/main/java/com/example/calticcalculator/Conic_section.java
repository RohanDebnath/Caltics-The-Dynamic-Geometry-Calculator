package com.example.calticcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Conic_section extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String [] conic_operation={"Select","Parabola","Ellipse","Cone"};
    int [] conic_icon={R.drawable.select,R.drawable.parabola,R.drawable.ellipse,R.drawable.cone};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conic_section);

        Spinner conic_spinner =findViewById(R.id.conic_spinner);
        conic_spinner.setOnItemSelectedListener(this);

        conic_ItemAdapter adapter = new conic_ItemAdapter(this,conic_operation,conic_icon);
        conic_spinner.setAdapter(adapter);


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this,conic_operation[position],Toast.LENGTH_SHORT).show();
        switch (position)
        {
            case 1:
                Intent intent = new Intent(Conic_section.this,Parabola.class);
                startActivity(intent);
                break;
            case 2:
                Intent intentEli = new Intent(Conic_section.this,Ellipse.class);
                startActivity(intentEli);
                break;
            case 3:
                Intent intent_cone = new Intent(Conic_section.this,cone.class);
                startActivity(intent_cone);
        }

    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}