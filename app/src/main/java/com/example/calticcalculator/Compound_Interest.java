package com.example.calticcalculator;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Compound_Interest extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    EditText Principle,rate,time,n_;
    TextView result;
    Spinner Choice_Ci;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compound_interest);

        Principle=findViewById(R.id.Principle_ci_inp);
        rate=findViewById(R.id.Rate_ci_inp);
        time=findViewById(R.id.TIme_ci_inp);
        n_=findViewById(R.id.ci_n_inp);

        result=findViewById(R.id.Answer_Ci);
        Choice_Ci=findViewById(R.id.Choice_ci);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Coumpound_Interest,
                android.R.layout.simple_spinner_item);
        Choice_Ci.setAdapter(adapter);
        Choice_Ci.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (parent.getItemAtPosition(position).equals("Compound Interest"))
        {
            double p,r,n,t,ans;
            p=Double.parseDouble(Principle.getText().toString());
            r=Double.parseDouble(rate.getText().toString());
            n=Double.parseDouble(n_.getText().toString());
            t=Double.parseDouble(time.getText().toString());
            double amt  = p *( Math.pow(1 + (r / n), n * t));
            ans =amt-p;
            result.setText(String.valueOf(ans));
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}