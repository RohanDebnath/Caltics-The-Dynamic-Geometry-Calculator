package com.example.calticcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Parabola extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    EditText yp,xp,ap;
    TextView result;
    Spinner choice_parabola;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parabola);

        xp=findViewById(R.id.Parabola_x);
        yp=findViewById(R.id.Parabola_y);
        ap=findViewById(R.id.Parabola_a);

        result=findViewById(R.id.Answer_Parabola);
        choice_parabola=findViewById(R.id.Choice_parabola);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Parabola_Parameter,
                android.R.layout.simple_spinner_item);
        choice_parabola.setAdapter(adapter);
        choice_parabola.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if(parent.getItemAtPosition(position).equals("Finding Focus Distance"))
        {
            double x,y,a;
            x=Double.parseDouble(xp.getText().toString());
            y=Double.parseDouble(yp.getText().toString());
            a=(y*y)/(4*x);
            result.setText(String.valueOf(a)+ " unit");

        }
        if(parent.getItemAtPosition(position).equals("Finding Y"))
        {
            double x,y,a;
            x=Double.parseDouble(xp.getText().toString());
            a=Double.parseDouble(ap.getText().toString());
            y=Math.sqrt(4*a*x);
            result.setText(String.valueOf(y)+ " unit");

        }
        if(parent.getItemAtPosition(position).equals("Finding X"))
        {
            double x,y,a;
            a=Double.parseDouble(ap.getText().toString());
            y=Double.parseDouble(yp.getText().toString());
            x=(y*y)/(4*a);
            result.setText(String.valueOf(x)+ " unit");

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}