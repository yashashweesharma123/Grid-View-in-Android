package com.example.ojas_25.myprojectthird;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    String[] values={
            "Java",
            "Css",
            "Android",
            "jquerry",
            "Php",
            "My space",
            "Html5",
            "Javascript",
            "Mysql",
            "Python",
            "Swift",
            "Wordpress",
            "Facebook",
            "Youtube",
            "Twitter"};

    int[] images={
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image5,
            R.drawable.image6,
            R.drawable.image7,
            R.drawable.image8,
            R.drawable.image9,
            R.drawable.image10,
            R.drawable.image11,
            R.drawable.image12,
            R.drawable.image13,
            R.drawable.image14,
            R.drawable.image15

    };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         gridView=(GridView) findViewById(R.id.gridview);
        GridAdapter gridAdapter=new GridAdapter(this ,values,images);
        gridView.setAdapter(gridAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("image",images[position]);
                Toast.makeText(MainActivity.this, "You Clicked at " +values[position], Toast.LENGTH_SHORT).show();

                intent.putExtra("value",values[position].toString());

                startActivity(intent);
            }
        });

    }
}
