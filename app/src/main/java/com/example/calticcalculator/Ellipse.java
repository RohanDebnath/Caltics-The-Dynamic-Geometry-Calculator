package com.example.calticcalculator;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Ellipse extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    EditText Major_axis,Minor_axis,Area,Circum;
    Spinner Choice_ellipse;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ellipse);

        Major_axis=findViewById(R.id.Ellipse_Major);
        Minor_axis=findViewById(R.id.Ellipse_Minor);
        Area=findViewById(R.id.Ellipse_Area);
        Circum=findViewById(R.id.Ellipse_Perimeter);

        result=findViewById(R.id.Answer_Ellipse);

        Choice_ellipse=findViewById(R.id.Choice_ellipse);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Ellipse_Parameter,
                android.R.layout.simple_spinner_item);
        Choice_ellipse.setAdapter(adapter);
        Choice_ellipse.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if(parent.getItemAtPosition(position).equals("Area"))
        {
            double ans,maj_a,min_a;
            maj_a=Double.parseDouble(Major_axis.getText().toString());
            min_a=Double.parseDouble(Minor_axis.getText().toString());
            ans=3.142*maj_a*min_a;
            result.setText(String.valueOf(ans)+" Unit");
        }
        if(parent.getItemAtPosition(position).equals("Circumference"))
        {
            double maj_a,min_a,ans;
            maj_a=Double.parseDouble(Major_axis.getText().toString());
            min_a=Double.parseDouble(Minor_axis.getText().toString());
            ans =(2*3.142)*(Math.sqrt(((maj_a*maj_a)+(min_a*min_a))/2));

            result.setText(String.valueOf(ans)+ " unit");

        }
        if(parent.getItemAtPosition(position).equals("Major Axis"))
        {
            double min_a,A,ans;
            min_a=Double.parseDouble(Minor_axis.getText().toString());
            A=Double.parseDouble(Area.getText().toString());
            ans=(A)/(3.142*min_a);
            result.setText(String.valueOf(ans));

        }
        if(parent.getItemAtPosition(position).equals("Minor Axis"))
        {
            double maj_a,A,ans;
            maj_a=Double.parseDouble(Major_axis.getText().toString());
            A=Double.parseDouble(Area.getText().toString());
            ans=(A)/(3.142*maj_a);
            result.setText(String.valueOf(ans));

        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}