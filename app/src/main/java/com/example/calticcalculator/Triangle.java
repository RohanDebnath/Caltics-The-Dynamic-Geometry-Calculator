package com.example.calticcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Triangle extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    EditText tri_len,tri_base,tri_area;
    Spinner choice_tri;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);

        tri_len= findViewById(R.id.tri_len_inp);
        tri_base=findViewById(R.id.tri_base_inp);
        tri_area=findViewById(R.id.tri_area_inp);

        choice_tri = findViewById(R.id.Choice_Triangle);

        result = findViewById(R.id.Answer_Triangle);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Triangle_Parameter, android.R.layout.simple_spinner_item);
        choice_tri.setAdapter(adapter);
        choice_tri.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if(parent.getItemAtPosition(position).equals("Area"))
        {
            double l,b,ans;
            l=Double.parseDouble(tri_len.getText().toString());
            b=Double.parseDouble(tri_base.getText().toString());
            ans=(l*b)/2;
            result.setText(String.valueOf(ans)+ "unit");

        }
        if(parent.getItemAtPosition(position).equals("Area to Height"))
        {
            double a,b,ans;
            a=Double.parseDouble(tri_area.getText().toString());
            b=Double.parseDouble(tri_base.getText().toString());
            ans=(a/b)*2;
            result.setText(String.valueOf(ans)+ "unit");

        }
        if(parent.getItemAtPosition(position).equals("Area to Base"))
        {
            double a,l,ans;
            a=Double.parseDouble(tri_area.getText().toString());
            l=Double.parseDouble(tri_len.getText().toString());
            ans=(a/l)*2;
            result.setText(String.valueOf(ans)+ "unit");

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}