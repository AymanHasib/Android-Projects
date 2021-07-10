package com.example.task02cgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class cgpacalculator extends AppCompatActivity {

    private EditText semester1_Edittext, semester2_Edittext, semester3_Edittext, semester4_Edittext, semester5_Edittext, semester6_Edittext, semester7_Edittext, semester8_Edittext;
    private Button cgpa_SubmitButton, cgpa_ClearButton;
    private TextView cgpa_ResultTextView;

    private double cgpa_1stSemester, cgpa_2ndSemester, cgpa_3rdSemester, cgpa_4thSemester, cgpa_5thSemester, cgpa_6thSemester, cgpa_7thSemester, cgpa_8thSemester,total_cgpa, avg_cgpa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpacalculator);

        linkup();
        processing();

    }

    private void linkup(){

        semester1_Edittext = findViewById(R.id.edt_Cgpa_Semester1_ID);
        semester2_Edittext = findViewById(R.id.edt_Cgpa_Semester2_ID);
        semester3_Edittext = findViewById(R.id.edt_Cgpa_Semester3_ID);
        semester4_Edittext = findViewById(R.id.edt_Cgpa_Semester4_ID);
        semester5_Edittext = findViewById(R.id.edt_Cgpa_Semester5_ID);
        semester6_Edittext = findViewById(R.id.edt_Cgpa_Semester6_ID);
        semester7_Edittext = findViewById(R.id.edt_Cgpa_Semester7_ID);
        semester8_Edittext = findViewById(R.id.edt_Cgpa_Semester8_ID);

        cgpa_SubmitButton = findViewById(R.id.cgpaSubmitButtonID);
        cgpa_ClearButton = findViewById(R.id.cgpaClearButtonID);

        cgpa_ResultTextView = findViewById(R.id.cgpaResultTextViewID);


    }

    private void processing(){
        cgpa_SubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cgpa1 =  semester1_Edittext.getText().toString();
                if(cgpa1.matches("")){
                    Toast.makeText(cgpacalculator.this,"Enter CGPA",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(cgpa1.matches("0")){
                    Toast.makeText(cgpacalculator.this,"Enter correct CGPA",Toast.LENGTH_SHORT).show();
                    return;
                }


                String cgpa2 = semester2_Edittext.getText().toString();
                if(cgpa2.matches("")){
                    Toast.makeText(cgpacalculator.this,"Enter CGPA",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(cgpa1.matches("0")){
                    Toast.makeText(cgpacalculator.this,"Enter correct CGPA",Toast.LENGTH_SHORT).show();
                    return;
                }


                String cgpa3 =  semester3_Edittext.getText().toString();
                if(cgpa3.matches("")){
                    Toast.makeText(cgpacalculator.this,"Enter CGPA",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(cgpa1.matches("0")){
                    Toast.makeText(cgpacalculator.this,"Enter correct CGPA",Toast.LENGTH_SHORT).show();
                    return;
                }


                String cgpa4 =  semester4_Edittext.getText().toString();
                if(cgpa4.matches("")){
                    Toast.makeText(cgpacalculator.this,"Enter CGPA",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(cgpa1.matches("0")){
                    Toast.makeText(cgpacalculator.this,"Enter correct CGPA",Toast.LENGTH_SHORT).show();
                    return;
                }



                String cgpa5 =  semester5_Edittext.getText().toString();
                if(cgpa5.matches("")){
                    Toast.makeText(cgpacalculator.this,"Enter CGPA",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(cgpa1.matches("0")){
                    Toast.makeText(cgpacalculator.this,"Enter correct CGPA",Toast.LENGTH_SHORT).show();
                    return;
                }


                String cgpa6 =  semester6_Edittext.getText().toString();
                if(cgpa6.matches("")){
                    Toast.makeText(cgpacalculator.this,"Enter CGPA",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(cgpa1.matches("0")){
                    Toast.makeText(cgpacalculator.this,"Enter correct CGPA",Toast.LENGTH_SHORT).show();
                    return;
                }


                String cgpa7 =  semester7_Edittext.getText().toString();
                if(cgpa7.matches("")){
                    Toast.makeText(cgpacalculator.this,"Enter CGPA",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(cgpa1.matches("0")){
                    Toast.makeText(cgpacalculator.this,"Enter correct CGPA",Toast.LENGTH_SHORT).show();
                    return;
                }


                String cgpa8 =  semester8_Edittext.getText().toString();
                if(cgpa8.matches("")){
                    Toast.makeText(cgpacalculator.this,"Enter CGPA",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(cgpa1.matches("0")){
                    Toast.makeText(cgpacalculator.this,"Enter correct CGPA",Toast.LENGTH_SHORT).show();
                    return;
                }


                cgpa_1stSemester = Double.parseDouble(cgpa1);
                cgpa_2ndSemester = Double.parseDouble(cgpa2);
                cgpa_3rdSemester = Double.parseDouble(cgpa3);
                cgpa_4thSemester = Double.parseDouble(cgpa4);
                cgpa_5thSemester = Double.parseDouble(cgpa5);
                cgpa_6thSemester = Double.parseDouble(cgpa6);
                cgpa_7thSemester = Double.parseDouble(cgpa7);
                cgpa_8thSemester = Double.parseDouble(cgpa8);



                if(cgpa_1stSemester>4){
                    Toast.makeText(cgpacalculator.this,"Enter less than or equal 4 grade",Toast.LENGTH_SHORT).show();
                    return;
                }

                if(cgpa_2ndSemester>4){
                    Toast.makeText(cgpacalculator.this,"Enter less than or equal 4 grade",Toast.LENGTH_SHORT).show();
                    return;
                }

                if(cgpa_3rdSemester>4){
                    Toast.makeText(cgpacalculator.this,"Enter less than or equal 4 grade",Toast.LENGTH_SHORT).show();
                    return;
                }

                if(cgpa_4thSemester>4){
                    Toast.makeText(cgpacalculator.this,"Enter less than or equal 4 grade",Toast.LENGTH_SHORT).show();
                    return;
                }

                if(cgpa_5thSemester>4){
                    Toast.makeText(cgpacalculator.this,"Enter less than or equal 4 grade",Toast.LENGTH_SHORT).show();
                    return;
                }

                if(cgpa_6thSemester>4){
                    Toast.makeText(cgpacalculator.this,"Enter less than or equal 4 grade",Toast.LENGTH_SHORT).show();
                    return;
                }

                if(cgpa_7thSemester>4){
                    Toast.makeText(cgpacalculator.this,"Enter less than or equal 4 grade",Toast.LENGTH_SHORT).show();
                    return;
                }

                if(cgpa_8thSemester>4){
                    Toast.makeText(cgpacalculator.this,"Enter less than or equal 4 grade",Toast.LENGTH_SHORT).show();
                    return;
                }


                total_cgpa = cgpa_1stSemester + cgpa_2ndSemester + cgpa_3rdSemester + cgpa_4thSemester + cgpa_5thSemester + cgpa_6thSemester + cgpa_7thSemester + cgpa_8thSemester;
                avg_cgpa = total_cgpa/8;

                cgpa_ResultTextView.setText("Your CGPA is: "+String.format("%.2f",avg_cgpa));

            }
        });

        cgpa_ClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cgpa_ResultTextView.setText("");
                semester1_Edittext.setText("");
                semester2_Edittext.setText("");
                semester3_Edittext.setText("");
                semester4_Edittext.setText("");
                semester5_Edittext.setText("");
                semester6_Edittext.setText("");
                semester7_Edittext.setText("");
                semester8_Edittext.setText("");
            }
        });
    }
}
