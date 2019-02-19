package com.example.ojas_25.myprojectthird;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {
    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ImageView imageView=(ImageView) findViewById(R.id.imageview);


        Intent intent=getIntent();
        imageView.setImageResource(intent.getIntExtra("image",0));
        String values=intent.getExtras().getString("value");
        TextView textView=(TextView) findViewById(R.id.textview);
        textView.setText(values);







}}
