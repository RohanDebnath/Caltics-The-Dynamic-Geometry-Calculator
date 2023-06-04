package com.example.calticcalculator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class bank_itemAdapter extends BaseAdapter {

    Context bank_context;
    String[] bank_cal_name;
    int[] bank_cal_icon;

    public bank_itemAdapter(Context bank_context, String[] bank_cal_name, int[] bank_cal_icon) {
        this.bank_context = bank_context;
        this.bank_cal_name = bank_cal_name;
        this.bank_cal_icon = bank_cal_icon;
    }

    @Override
    public int getCount() {
        return bank_cal_name.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view = LayoutInflater.from(bank_context).inflate(R.layout.bank_layout,parent,false);
        ImageView imageView =view.findViewById(R.id.bank_icon_spin);
        TextView textView = view.findViewById(R.id.bank_text_spin);

        imageView.setImageResource(bank_cal_icon[position]);
        textView.setText(bank_cal_name[position]);

        return view;
    }
}
