package com.example.ahosanhabib.mycheckboxdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox milkchckbox, sugarcheckbox, watercheckbox;
    Button showbutton;
    TextView textshow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        milkchckbox = findViewById(R.id.milkCheckboxId);
        sugarcheckbox = findViewById(R.id.sugarCheckboxId);
        watercheckbox = findViewById(R.id.waterCheckboxId);

        showbutton = findViewById(R.id.buttonclickId);
        textshow = findViewById(R.id.textshowId);

        showbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer stringbuffer = new StringBuffer();

                if(milkchckbox.isChecked()){
                    String value = milkchckbox.getText().toString();
                    stringbuffer.append(value+" is ordered\n");
                }
                if(sugarcheckbox.isChecked()){
                    String value = sugarcheckbox.getText().toString();
                    stringbuffer.append(value+" is ordered\n");
                }
                if(watercheckbox.isChecked()){
                    String value = watercheckbox.getText().toString();
                    stringbuffer.append(value+" is ordered");
                }
                textshow.setText(stringbuffer);
            }
        });
    }
}
