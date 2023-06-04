package com.example.calticcalculator;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Simple_Interest extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    EditText principle,time,rate,s_i;
    TextView result;
    Spinner Choice_si;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_interest);

        principle=findViewById(R.id.principle_si_inp);
        rate=findViewById(R.id.Rate_si_inp);
        time=findViewById(R.id.Time_si_inp);
        s_i=findViewById(R.id.SimpleInterest_si_inp);

        result=findViewById(R.id.Answer_SI);
        Choice_si=findViewById(R.id.Choice_SI);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Simple_Interest,
                android.R.layout.simple_spinner_item);
        Choice_si.setAdapter(adapter);
        Choice_si.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if(parent.getItemAtPosition(position).equals("Simple Interest"))
        {
            double p,r,t,ans;
            p=Double.parseDouble(principle.getText().toString());
            r=Double.parseDouble(rate.getText().toString());
            t=Double.parseDouble(time.getText().toString());
            ans=(p*r*t)/100;
            result.setText(String.valueOf(ans));
        }
        if(parent.getItemAtPosition(position).equals("Rate"))
        {
            double si ,p,t,ans;
            p=Double.parseDouble(principle.getText().toString());
            si=Double.parseDouble(s_i.getText().toString());
            t=Double.parseDouble(time.getText().toString());

            ans= (100*si)/(p*t);
            result.setText(String.valueOf(ans));
        }
        if(parent.getItemAtPosition(position).equals("Time"))
        {
            double p,si,r,ans;
            p=Double.parseDouble(principle.getText().toString());
            si=Double.parseDouble(s_i.getText().toString());
            r=Double.parseDouble(rate.getText().toString());
            ans = (100*si)/(p*r);
            result.setText(String.valueOf(ans));
        }

        if(parent.getItemAtPosition(position).equals("Principle"))
        {
            double si,r,t,ans;
            si=Double.parseDouble(s_i.getText().toString());
            r=Double.parseDouble(rate.getText().toString());
            t=Double.parseDouble(time.getText().toString());
            ans =(100*si)/(r*t);
            result.setText(String.valueOf(ans));
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}