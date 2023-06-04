package com.example.calticcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Rectangle extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    EditText len ,breath,area , perimeter;
    Spinner choice_rectangle;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);

        len=findViewById(R.id.Rectangle_length_inp);
        breath=findViewById(R.id.Rectangle_breadth_inp);
        area=findViewById(R.id.Rectangle_Area_inp);
        perimeter=findViewById(R.id.Rectangle_perimeter_inp);

        result=findViewById(R.id.Answer_Rectangle);
        choice_rectangle=findViewById(R.id.Choice_rectangle);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Rectangle_Parameter,
                android.R.layout.simple_spinner_item);

        choice_rectangle.setAdapter(adapter);
        choice_rectangle.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if(parent.getItemAtPosition(position).equals("Area"))
        {
            double l,b,ans;
            l= Double.parseDouble(len.getText().toString());
            b=Double.parseDouble(breath.getText().toString());
            ans=l*b;
            result.setText(String.valueOf(ans));
        }
        if(parent.getItemAtPosition(position).equals("Perimeter"))
        {
            double l,b,peri;
            l= Double.parseDouble(len.getText().toString());
            b=Double.parseDouble(breath.getText().toString());
            peri=2*(l+b);
            result.setText(String.valueOf(peri)+" unit");
        }
        if(parent.getItemAtPosition(position).equals("Area to Length"))
        {
            double a,b,ans;
            a=Double.parseDouble(area.getText().toString());
            b=Double.parseDouble(breath.getText().toString());
            ans=a/b;
            result.setText(String.valueOf(ans)+ " unit");

        }

        if(parent.getItemAtPosition(position).equals("Area to Breadth"))
        {
            double a,l,ans;
            a=Double.parseDouble(area.getText().toString());
            l=Double.parseDouble(len.getText().toString());
            ans=a/l;
            result.setText(String.valueOf(ans)+ " unit");
        }
        if(parent.getItemAtPosition(position).equals("Perimeter to Length"))
        {
            double p,b,ans;
            p=Double.parseDouble(perimeter.getText().toString());
            b=Double.parseDouble(breath.getText().toString());
            ans=(p/2)-b;
            result.setText(String.valueOf(ans)+" unit");

        }
        if(parent.getItemAtPosition(position).equals("Perimeter to Breadth"))
        {
            double p,l,ans;
            p=Double.parseDouble(perimeter.getText().toString());
            l=Double.parseDouble(len.getText().toString());
            ans=(p/2)-l;
            result.setText(String.valueOf(ans)+" unit");

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}