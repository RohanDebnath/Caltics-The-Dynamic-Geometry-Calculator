package com.example.calticcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Square extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    TextView result;
    EditText side_sq,area_sq,peri_sq;
    Spinner sq_spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);

        result=findViewById(R.id.Answer_sq);
        side_sq=findViewById(R.id.side_sq_inp);
        area_sq=findViewById(R.id.Area_sq_inp);
        peri_sq=findViewById(R.id.Perimeter_sq_inp);
        sq_spinner=findViewById(R.id.Choice_Square);

        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,
                R.array.Square_Parameters, android.R.layout.simple_spinner_item);
        sq_spinner.setAdapter(adapter);
        sq_spinner.setOnItemSelectedListener(this);


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if(parent.getItemAtPosition(position).equals("Side to Area"))
        {
            double s,ans;
            s=Double.parseDouble(side_sq.getText().toString());
            ans=s*s;
            result.setText(String.valueOf(ans)+ "unit");
        }

        if(parent.getItemAtPosition(position).equals("Side to Perimeter"))
        {
            double s,ans;
            s=Double.parseDouble(side_sq.getText().toString());
            ans=4*s;
            result.setText(String.valueOf(ans)+" unit");
        }
        if(parent.getItemAtPosition(position).equals("Area to Side"))
        {
            double A,ans;
            A=Double.parseDouble(area_sq.getText().toString());
            ans = Math.sqrt(A);
            result.setText(String.valueOf(ans)+" unit");
        }
        if(parent.getItemAtPosition(position).equals("Area to Perimeter"))
        {
            double A,s,ans;
            A=Double.parseDouble(area_sq.getText().toString());
            s=Math.sqrt(A);
            ans=4*s;
            result.setText(String.valueOf(ans)+ " unit");
        }
        if(parent.getItemAtPosition(position).equals("Perimeter to Area"))
        {
            double P,A,s;
            P=Double.parseDouble(peri_sq.getText().toString());
            s=P/4;
            A=s*s;
            result.setText(String.valueOf(A)+" unit");
        }
        if(parent.getItemAtPosition(position).equals("Perimeter to side"))
        {
            double p,ans;
            p=Double.parseDouble(peri_sq.getText().toString());
            ans=p/4;
            result.setText(String.valueOf(ans)+ " unit");
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}