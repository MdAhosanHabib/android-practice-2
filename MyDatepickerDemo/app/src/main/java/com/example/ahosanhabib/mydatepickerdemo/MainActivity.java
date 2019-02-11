package com.example.ahosanhabib.mydatepickerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;
    private DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textviewID);
        button = findViewById(R.id.buttonID);
        datePicker = findViewById(R.id.datepickerID);

        textView.setText("Currente Date: "+currentdate());
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Current Date: "+currentdate());
            }
        });
    }
    String currentdate(){
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append(datePicker.getDayOfMonth()+"/");
        stringBuffer.append((datePicker.getMonth()+1)+"/");
        stringBuffer.append(datePicker.getYear());

        return stringBuffer.toString();
    }
}
