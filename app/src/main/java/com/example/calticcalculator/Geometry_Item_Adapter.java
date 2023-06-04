package com.example.calticcalculator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Geometry_Item_Adapter extends BaseAdapter {

    Context context;
    String[] filename;
    int[] figuration;

    public Geometry_Item_Adapter(Context context, String[] filename, int[] figuration) {
        this.context = context;
        this.filename = filename;
        this.figuration = figuration;
    }

    @Override
    public int getCount() {
        return filename.length;
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
        view= LayoutInflater.from(context).inflate(R.layout.geometry_layout,parent,false);
        ImageView imageView = view.findViewById(R.id.geo_icon);
        TextView textView = view.findViewById(R.id.geo_text);

        imageView.setImageResource(figuration[position]);
        textView.setText(filename[position]);



        return view;
    }
}
