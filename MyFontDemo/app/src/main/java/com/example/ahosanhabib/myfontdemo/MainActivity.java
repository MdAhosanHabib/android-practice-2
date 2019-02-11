package com.example.ahosanhabib.myfontdemo;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView1, textView2;
    private Typeface typeface1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.text1ID);
        textView2 = findViewById(R.id.text2ID);

        typeface1 = Typeface.createFromAsset(getAssets(),"font/AlexBrush_Regular.ttf");
        textView1.setTypeface(typeface1);

        typeface1 = Typeface.createFromAsset(getAssets(),"font/AlexBrush_Regular.ttf");
        textView2.setTypeface(typeface1);
    }
}
