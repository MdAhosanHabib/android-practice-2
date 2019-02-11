package com.example.ahosanhabib.myradiobuttondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private Button showbutton;
    private RadioButton genderbutton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.radiogroupID);
        showbutton = (Button) findViewById(R.id.buttonID);
        resultTextView = (TextView) findViewById(R.id.textviewID);

        showbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selected =  radioGroup.getCheckedRadioButtonId();
                genderbutton = findViewById(selected);
                String value = genderbutton.getText().toString();
                resultTextView.setText("You have clicked: "+value);

            }
        });
    }
}
