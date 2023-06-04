package com.example.calticcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class circle1 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner Circle_choice_spinner;
    EditText radius , area, peri;
    TextView result_Circle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle1);

        Circle_choice_spinner=findViewById(R.id.Choice_circle);
        radius=findViewById(R.id.radius_inp);
        area = findViewById(R.id.Area_inp);
        peri= findViewById(R.id.Perimeter_inp);
        result_Circle = findViewById(R.id.Answer_Circle);

        ArrayAdapter<CharSequence> adapter =ArrayAdapter.createFromResource(this, R.array.Circle_Parameters,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Circle_choice_spinner.setAdapter(adapter);
        Circle_choice_spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if(parent.getItemAtPosition(position).equals("Radius to Area"))
        {
            double n1,ans;
            n1=Double.parseDouble(radius.getText().toString());
            ans = 3.142*n1*n1;
            result_Circle.setText(String.valueOf(ans)+ "unit");

        }
        if(parent.getItemAtPosition(position).equals("Radius to Circumference"))
        {
            double n1,ans;
            n1=Double.parseDouble(radius.getText().toString());
            ans=2*(3.142)*n1;
            result_Circle.setText(String.valueOf(ans)+" unit");
        }
        if(parent.getItemAtPosition(position).equals("Area to Radius"))
        {
            double n1,ans;
            n1=Double.parseDouble(area.getText().toString());
            ans=(n1/3.142);
            ans= Math.sqrt(ans);
            result_Circle.setText(String.valueOf(ans)+" unit");
        }
        if(parent.getItemAtPosition(position).equals("Area to Circumference"))
        {
            double n1,r,ans;
            n1=Double.parseDouble(area.getText().toString());
            r=(n1/3.142);
            r= Math.sqrt(r);

            ans=2*3.142*r;
            result_Circle.setText(String.valueOf(ans)+" unit");
        }
        if(parent.getItemAtPosition(position).equals("Circumference to Radius"))
        {
            double p,ans;
            p=Double.parseDouble(peri.getText().toString());
            ans=(p)/(2*3.142);
            result_Circle.setText(String.valueOf(ans)+ "unit");

        }

        if(parent.getItemAtPosition(position).equals("Circumference to Area"))
        {
            double c,r,ans;
            c=Double.parseDouble(peri.getText().toString());
            r= (c)/(2*3.142);
            ans=r*3.142*r;
            result_Circle.setText(String.valueOf(ans)+ " unit");

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}