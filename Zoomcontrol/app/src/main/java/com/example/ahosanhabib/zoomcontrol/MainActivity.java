package com.example.ahosanhabib.zoomcontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ZoomControls;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private ZoomControls zoomControls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageviewID);
        zoomControls = findViewById(R.id.zoomID);

        zoomControls.setOnZoomInClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"zoom in",Toast.LENGTH_SHORT).show();
               float x = imageView.getScaleX();
               float y = imageView.getScaleY();

               imageView.setScaleX(x+1);
               imageView.setScaleY(y+1);
            }
        });
        zoomControls.setOnZoomOutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"zoom out",Toast.LENGTH_SHORT).show();
               float x = imageView.getScaleX();
               float y = imageView.getScaleY();

               if(x>1 && y>1){
                   imageView.setScaleX(x-1);
                   imageView.setScaleY(y-1);
               }

            }
        });
    }
}
