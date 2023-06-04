package com.example.calticcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class cone extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    EditText height,area,radius,volume,slant_height;
    TextView result;
    Spinner choice_cone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cone);
        height=findViewById(R.id.Cone_height_inp);
        area=findViewById(R.id.Cone_area_inp);
        radius=findViewById(R.id.Cone_radius_inp);
        volume=findViewById(R.id.Cone_vol_inp);
        slant_height=findViewById(R.id.cone_slant_inp);

        result=findViewById(R.id.Answer_Cone);
        choice_cone=findViewById(R.id.Choice_cone);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Cone, android.R.layout.simple_spinner_item);
        choice_cone.setAdapter(adapter);
        choice_cone.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if(parent.getItemAtPosition(position).equals("Volume"))
        {
            double r,h,ans;
            r=Double.parseDouble(radius.getText().toString());
            h=Double.parseDouble(height.getText().toString());
            ans=(3.142*(r*r)*h)/(3);
            result.setText(String.valueOf(ans)+ " unit");
        }
        if (parent.getItemAtPosition(position).equals("Area"))
        {
            double r,h,ans;
            r=Double.parseDouble(radius.getText().toString());
            h=Double.parseDouble(height.getText().toString());
            ans=(3.142*r)*(r+Math.sqrt((r*r)+(h*h)));
            result.setText(String.valueOf(ans)+ " unit");
        }
        if (parent.getItemAtPosition(position).equals("Slant Height"))
        {
            double r,h,ans;
            r=Double.parseDouble(radius.getText().toString());
            h=Double.parseDouble(height.getText().toString());
            ans=Math.sqrt((r*r)+(h*h));
            result.setText(String.valueOf(ans)+ " unit");
        }

        if(parent.getItemAtPosition(position).equals("Volume to Height"))
        {
            double v,r,ans;
            v=Double.parseDouble(volume.getText().toString());
            r=Double.parseDouble(radius.getText().toString());
            ans=(v*3)/(3.142*r*r);
            result.setText(String.valueOf(ans) + " unit");
        }

        if(parent.getItemAtPosition(position).equals("Volume to Radius"))
        {
            double v,h,an,ans;
            v=Double.parseDouble(volume.getText().toString());
            h=Double.parseDouble(height.getText().toString());
            an=(v*3)/(3.142*h);
            ans=Math.sqrt(an);
            result.setText(String.valueOf(ans) + " unit");
        }
        if(parent.getItemAtPosition(position).equals("Side Area"))
        {
            double r,h,ans;
            r=Double.parseDouble(radius.getText().toString());
            h=Double.parseDouble(height.getText().toString());
            ans  = (3.142*r)*(Math.sqrt((r*r)+(h*h)));
            result.setText(String.valueOf(ans) + " unit");
        }
        if(parent.getItemAtPosition(position).equals("Slant_Height to Radius"))
        {
            double s_h,h,ans;
            h=Double.parseDouble(height.getText().toString());
            s_h=Double.parseDouble(slant_height.getText().toString());
            ans=(s_h*s_h)-(h*h);
            result.setText(String.valueOf(ans) + " unit");
        }
        if(parent.getItemAtPosition(position).equals("Slant_Height to height"))
        {
            double s_h,r,ans;
            r=Double.parseDouble(radius.getText().toString());
            s_h=Double.parseDouble(slant_height.getText().toString());
            ans=(s_h*s_h)-(r*r);
            result.setText(String.valueOf(ans) + " unit");
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}