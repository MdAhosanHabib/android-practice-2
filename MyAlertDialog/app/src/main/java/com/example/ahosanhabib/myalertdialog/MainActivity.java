package com.example.ahosanhabib.myalertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button exitbutton;
    private AlertDialog.Builder alertdialogbuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exitbutton = findViewById(R.id.buttonID);

        exitbutton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        alertdialogbuilder = new AlertDialog.Builder(MainActivity.this);

        //set title
        alertdialogbuilder.setTitle(R.string.title_text);

        //set massege
        alertdialogbuilder.setMessage(R.string.massege_text);

        //set icon
        alertdialogbuilder.setIcon(R.drawable.question);

        alertdialogbuilder.setCancelable(false);

        alertdialogbuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //exit
                finish();
            }
        });
        alertdialogbuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //exit
                dialog.cancel();
            }
        });
        alertdialogbuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //exit
                Toast.makeText(MainActivity.this,"You clicked on Cancel button",Toast.LENGTH_SHORT).show();
            }
        });
        AlertDialog alertDialog = alertdialogbuilder.create();
        alertDialog.show();
    }
}
