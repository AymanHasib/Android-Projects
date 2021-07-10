package com.example.task02cgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private Button gpaButton, cgpaButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gpaButton = findViewById(R.id.gpa_buttonID);
        cgpaButton = findViewById(R.id.cgpa_buttonID);

        gpaButton.setOnClickListener(this);
        cgpaButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.gpa_buttonID){

            Intent intentGpa = new Intent(MainActivity.this, gpa.class);
            startActivity(intentGpa);
            Toast.makeText(getApplicationContext(),"Gpa Clicked",Toast.LENGTH_SHORT).show();
        }

        if(v.getId()==R.id.cgpa_buttonID){
            Intent intentCgpa = new Intent(MainActivity.this,cgpacalculator.class);
            startActivity(intentCgpa);
            Toast.makeText(getApplicationContext(),"Cgpa Clicked",Toast.LENGTH_SHORT).show();
        }



    }
}
