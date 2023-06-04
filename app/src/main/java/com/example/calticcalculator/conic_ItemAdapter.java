package com.example.calticcalculator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class conic_ItemAdapter extends BaseAdapter {
    Context conic_context;
    String[] conic_operation_name;
    int[] conic_operation_icon;

    public conic_ItemAdapter(Context conic_context, String[] conic_operation_name, int[] conic_operation_icon) {
        this.conic_context = conic_context;
        this.conic_operation_name = conic_operation_name;
        this.conic_operation_icon = conic_operation_icon;
    }

    @Override
    public int getCount() {
        return conic_operation_name.length;
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
        view = LayoutInflater.from(conic_context).inflate(R.layout.conic_layout,parent,false);
        ImageView imageView = view.findViewById(R.id.conic_icon_spin);
        TextView textView = view.findViewById(R.id.conic_text_spin);

        imageView.setImageResource(conic_operation_icon[position]);
        textView.setText(conic_operation_name[position]);

        return view;
    }
}
