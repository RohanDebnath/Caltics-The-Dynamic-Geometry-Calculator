package com.example.calticcalculator;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Rombus extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    EditText diag1_rom,diag2_rom,area_rom,peri_rom,side_rom;
    Spinner choice_rombus;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rombus);

        diag1_rom=findViewById(R.id.diagonal1_rom_inp);
        diag2_rom=findViewById(R.id.diagonal2_rom_inp);
        area_rom=findViewById(R.id.Area_rom_inp);
        peri_rom=findViewById(R.id.Perimeter_rom_inp);
        side_rom=findViewById(R.id.diagonal_side_inp);

        choice_rombus=findViewById(R.id.Choice_rombus);

        result=findViewById(R.id.Answer_Rombus);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Rombus_Parameter,android.R.layout.simple_spinner_item);
        choice_rombus.setAdapter(adapter);
        choice_rombus.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if(parent.getItemAtPosition(position).equals("Diagonal to Area"))
        {
            double d1,d2,ans;
            d1=Double.parseDouble(diag1_rom.getText().toString());
            d2=Double.parseDouble(diag2_rom.getText().toString());
            ans=(d1*d2)/2;
            result.setText(String.valueOf(ans)+" unit");

        }
        if(parent.getItemAtPosition(position).equals("Side to Perimeter"))
        {
            double s,ans;
            s=Double.parseDouble(side_rom.getText().toString());
            ans=s*4;
            result.setText(String.valueOf(ans)+" unit");
        }
        if(parent.getItemAtPosition(position).equals("Perimeter to Side"))
        {
            double p,ans;
            p=Double.parseDouble(peri_rom.getText().toString());
            ans=p/4;
            result.setText(String.valueOf(ans));
        }
        if(parent.getItemAtPosition(position).equals("Area to Diagonal1"))
        {
            double d2,A,ans;
            d2=Double.parseDouble(diag2_rom.getText().toString());
            A=Double.parseDouble((area_rom.getText().toString()));
            ans=(2*A)/d2;
            result.setText(String.valueOf(ans)+" unit");
        }
        if(parent.getItemAtPosition(position).equals("Area to Diagonal2"))
        {
            double d1,A,ans;
            d1=Double.parseDouble(diag1_rom.getText().toString());
            A=Double.parseDouble((area_rom.getText().toString()));
            ans=(2*A)/d1;
            result.setText(String.valueOf(ans)+" unit");
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}