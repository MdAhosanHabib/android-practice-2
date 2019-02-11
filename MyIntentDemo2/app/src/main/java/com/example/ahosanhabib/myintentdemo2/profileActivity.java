package com.example.ahosanhabib.myintentdemo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class profileActivity extends AppCompatActivity {

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        textView = findViewById(R.id.textID);

        Bundle bundle = getIntent().getExtras();

        if(bundle!=null){

           String value =  bundle.getString("tag");
           textView.setText(value);
        }
    }
}
