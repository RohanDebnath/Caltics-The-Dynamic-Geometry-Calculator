package com.example.calticcalculator;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Bank_Formula extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String[] bank_operation ={"Select","Simple Interest","Compound Interest"};
    int [] bank_operation_icon= {R.drawable.select,R.drawable.simpleinterest,R.drawable.compoundinterest};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_formula);

        Spinner Bank_operation_spinner =findViewById(R.id.bank_spin);
        Bank_operation_spinner.setOnItemSelectedListener(this);

        bank_itemAdapter adapter = new bank_itemAdapter(this,bank_operation,bank_operation_icon);
        Bank_operation_spinner.setAdapter(adapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this,bank_operation[position],Toast.LENGTH_SHORT).show();

        switch (position)
        {
            case 1:
                Intent intent_si = new Intent(Bank_Formula.this,Simple_Interest.class);
                startActivity(intent_si);
                break;

            case 2:
                Intent intent_ci = new Intent(Bank_Formula.this,Compound_Interest.class)
                        ;
                startActivity(intent_ci);
        }



    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}