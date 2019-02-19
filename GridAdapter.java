package com.example.ojas_25.myprojectthird;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdapter extends BaseAdapter {
    Context context;
   private final String[] values;
   private final  int[] images;

    public GridAdapter(Context context, String[] values, int[] images) {
        this.context = context;
        this.values = values;
        this.images = images;

    }

    @Override
    public int getCount() {
        return values.length;
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
    public View getView(int position, View view, ViewGroup viewGroup) {
         LayoutInflater layoutInflater=(LayoutInflater.from(context));
       view=layoutInflater.inflate(R.layout.single_item,null);
       ImageView imageView=(ImageView)view.findViewById(R.id.imageview);
       TextView textView=(TextView)view.findViewById(R.id.textview);
       imageView.setImageResource(images[position]);
       textView.setText(values[position]);
       return view;}}

