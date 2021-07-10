package com.example.task02cgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class gpa extends AppCompatActivity {

    private EditText edtGpa_sub1,edtGpa_sub2,edtGpa_sub3,edtGpa_sub4,edtGpa_sub5,edtGpa_sub6,edtGpa_sub7,edtGpa_sub8;
    private EditText edtCHR_sub1,edtCHR_sub2,edtCHR_sub3,edtCHR_sub4,edtCHR_sub5,edtCHR_sub6,edtCHR_sub7,edtCHR_sub8;
    private Button submitButton, clearButton;
    private TextView resultText;
    private double totalGpaCrh,totalCr,result,gpa1,gpa2,gpa3,gpa4,gpa5,gpa6,gpa7,gpa8;
    private double credithour1,credithour2,credithour3,credithour4,credithour5,credithour6,credithour7,credithour8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpa);

        linkup();

            submitButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    String g1 = edtGpa_sub1.getText().toString();

                    String ch1 = edtCHR_sub1.getText().toString();

                    if (g1.equals("")){

                        Toast.makeText(gpa.this,"Enter Gpa and Credit",Toast.LENGTH_SHORT).show();
                        return;
                    }
                    if(g1.matches("0")){
                        Toast.makeText(gpa.this,"Enter Correct Gpa and Credit",Toast.LENGTH_SHORT).show();
                        return;
                    }

                    if (ch1.equals("")){

                        Toast.makeText(gpa.this,"Enter Gpa and Credit",Toast.LENGTH_SHORT).show();
                        return;
                    }
                    if(ch1.matches("0")){
                        Toast.makeText(gpa.this,"Enter Correct Gpa and Credit",Toast.LENGTH_SHORT).show();
                        return;
                    }

                    String g2 = edtGpa_sub2.getText().toString();
                    String ch2 = edtCHR_sub2.getText().toString();

                    if (g2.equals("")){

                        Toast.makeText(gpa.this,"Enter Gpa and Credit",Toast.LENGTH_SHORT).show();
                        return;
                    }
                    if(g2.matches("0")){
                        Toast.makeText(gpa.this,"Enter Correct Gpa and Credit",Toast.LENGTH_SHORT).show();
                        return;
                    }


                    if (ch2.equals("")){

                        Toast.makeText(gpa.this,"Enter Gpa and Credit",Toast.LENGTH_SHORT).show();
                        return;
                    }
                    if(ch2.matches("0")){
                        Toast.makeText(gpa.this,"Enter Correct Gpa and Credit",Toast.LENGTH_SHORT).show();
                        return;
                    }


                    String g3 = edtGpa_sub3.getText().toString();
                    String ch3 = edtCHR_sub3.getText().toString();

                    if (g3.equals("")){

                        Toast.makeText(gpa.this,"Enter Gpa and Credit",Toast.LENGTH_SHORT).show();
                        return;
                    }
                    if(g3.matches("0")){
                        Toast.makeText(gpa.this,"Enter Correct Gpa and Credit",Toast.LENGTH_SHORT).show();
                        return;
                    }

                    if (ch3.equals("")){

                        Toast.makeText(gpa.this,"Enter Gpa and Credit",Toast.LENGTH_SHORT).show();
                        return;
                    }
                    if(ch3.matches("0")){
                        Toast.makeText(gpa.this,"Enter Correct Gpa and Credit",Toast.LENGTH_SHORT).show();
                        return;
                    }


                    String g4 = edtGpa_sub4.getText().toString();
                    String ch4 = edtCHR_sub4.getText().toString();

                    if (g4.equals("")){

                        Toast.makeText(gpa.this,"Enter Gpa and Credit",Toast.LENGTH_SHORT).show();
                        return;
                    }
                    if(g4.matches("0")){
                        Toast.makeText(gpa.this,"Enter Correct Gpa and Credit",Toast.LENGTH_SHORT).show();
                        return;
                    }

                    if (ch4.equals("")){

                        Toast.makeText(gpa.this,"Enter Gpa and Credit",Toast.LENGTH_SHORT).show();
                        return;
                    }
                    if(ch4.matches("0")){
                        Toast.makeText(gpa.this,"Enter Correct Gpa and Credit",Toast.LENGTH_SHORT).show();
                        return;
                    }


                    String g5 = edtGpa_sub5.getText().toString();
                    String ch5 = edtCHR_sub5.getText().toString();

                    if (g5.equals("")){

                        Toast.makeText(gpa.this,"Enter Gpa and Credit",Toast.LENGTH_SHORT).show();
                        return;
                    }
                    if(g5.matches("0")){
                        Toast.makeText(gpa.this,"Enter Correct Gpa and Credit",Toast.LENGTH_SHORT).show();
                        return;
                    }

                    if (ch5.equals("")){

                        Toast.makeText(gpa.this,"Enter Gpa and Credit",Toast.LENGTH_SHORT).show();
                        return;
                    }
                    if(ch5.matches("0")){
                        Toast.makeText(gpa.this,"Enter Correct Gpa and Credit",Toast.LENGTH_SHORT).show();
                        return;
                    }


                    String g6 = edtGpa_sub6.getText().toString();
                    String ch6 = edtCHR_sub6.getText().toString();

                    if (g6.equals("")){

                        Toast.makeText(gpa.this,"Enter Gpa and Credit",Toast.LENGTH_SHORT).show();
                        return;
                    }
                    if(g6.matches("0")){
                        Toast.makeText(gpa.this,"Enter Correct Gpa and Credit",Toast.LENGTH_SHORT).show();
                        return;
                    }

                    if (ch6.equals("")){

                        Toast.makeText(gpa.this,"Enter Gpa and Credit",Toast.LENGTH_SHORT).show();
                        return;
                    }
                    if(ch5.matches("0")){
                        Toast.makeText(gpa.this,"Enter Correct Gpa and Credit",Toast.LENGTH_SHORT).show();
                        return;
                    }


                    String g7 = edtGpa_sub7.getText().toString();
                    String ch7 = edtCHR_sub7.getText().toString();

                    if (g7.equals("")){

                        Toast.makeText(gpa.this,"Enter Gpa and Credit",Toast.LENGTH_SHORT).show();
                        return;
                    }
                    if(g6.matches("0")){
                        Toast.makeText(gpa.this,"Enter Correct Gpa and Credit",Toast.LENGTH_SHORT).show();
                        return;
                    }

                    if (ch7.equals("")){

                        Toast.makeText(gpa.this,"Enter Gpa and Credit",Toast.LENGTH_SHORT).show();
                        return;
                    }
                    if(ch5.matches("0")){
                        Toast.makeText(gpa.this,"Enter Correct Gpa and Credit",Toast.LENGTH_SHORT).show();
                        return;
                    }

                    String g8 = edtGpa_sub8.getText().toString();
                    String ch8 = edtCHR_sub8.getText().toString();

                    if (g8.equals("")){

                        Toast.makeText(gpa.this,"Enter Gpa and Credit",Toast.LENGTH_SHORT).show();
                        return;
                    }
                    if(g6.matches("0")){
                        Toast.makeText(gpa.this,"Enter Correct Gpa and Credit",Toast.LENGTH_SHORT).show();
                        return;
                    }

                    if (ch8.equals("")){

                        Toast.makeText(gpa.this,"Enter Gpa and Credit",Toast.LENGTH_SHORT).show();
                        return;
                    }
                    if(ch5.matches("0")){
                        Toast.makeText(gpa.this,"Enter Correct Gpa and Credit",Toast.LENGTH_SHORT).show();
                        return;
                    }


                    gpa1 = Double.parseDouble(g1);
                    credithour1 = Double.parseDouble(ch1);

                    gpa2 = Double.parseDouble(g2);
                    credithour2 = Double.parseDouble(ch2);

                    gpa3 = Double.parseDouble(g3);
                    credithour3 = Double.parseDouble(ch3);

                    gpa4 = Double.parseDouble(g4);
                    credithour4 = Double.parseDouble(ch4);

                    gpa5 = Double.parseDouble(g5);
                    credithour5 = Double.parseDouble(ch5);

                    gpa6 = Double.parseDouble(g6);
                    credithour6 = Double.parseDouble(ch6);

                    gpa7 = Double.parseDouble(g7);
                    credithour7 = Double.parseDouble(ch7);

                    gpa8 = Double.parseDouble(g8);
                    credithour8 = Double.parseDouble(ch8);



                    if(gpa1>4.00){
                        Toast.makeText(gpa.this,"Enter less than or equal 4 grade",Toast.LENGTH_SHORT).show();
                        return;

                    }
                    if(gpa2>4){
                        Toast.makeText(gpa.this,"Enter less than or equal 4 grade",Toast.LENGTH_SHORT).show();
                        return;
                    }
                    if(gpa3>4){
                        Toast.makeText(gpa.this,"Enter less than or equal 4 grade",Toast.LENGTH_SHORT).show();
                        return;
                    }
                    if(gpa4>4){
                        Toast.makeText(gpa.this,"Enter less than or equal 4 grade",Toast.LENGTH_SHORT).show();
                        return;
                    }
                    if(gpa5>4){
                        Toast.makeText(gpa.this,"Enter less than or equal 4 grade",Toast.LENGTH_SHORT).show();
                        return;
                    }
                    if(gpa6>4){
                        Toast.makeText(gpa.this,"Enter less than or equal 4 grade",Toast.LENGTH_SHORT).show();
                        return;
                    }
                    if(gpa7>4){
                        Toast.makeText(gpa.this,"Enter less than or equal 4 grade",Toast.LENGTH_SHORT).show();
                        return;
                    }
                    if(gpa8>4){
                        Toast.makeText(gpa.this,"Enter less than or equal 4 grade",Toast.LENGTH_SHORT).show();
                        return;
                    }


                    if(credithour1>4.00){
                        Toast.makeText(gpa.this,"Enter less than or equal 4 grade",Toast.LENGTH_SHORT).show();
                        return;

                    }
                    if(credithour2>4.00){
                        Toast.makeText(gpa.this,"Enter less than or equal 4 grade",Toast.LENGTH_SHORT).show();
                        return;

                    }
                    if(credithour3>4.00){
                        Toast.makeText(gpa.this,"Enter less than or equal 4 grade",Toast.LENGTH_SHORT).show();
                        return;

                    }
                    if(credithour4>4.00){
                        Toast.makeText(gpa.this,"Enter less than or equal 4 grade",Toast.LENGTH_SHORT).show();
                        return;

                    }
                    if(credithour5>4.00){
                        Toast.makeText(gpa.this,"Enter less than or equal 4 grade",Toast.LENGTH_SHORT).show();
                        return;

                    }
                    if(credithour6>4.00){
                        Toast.makeText(gpa.this,"Enter less than or equal 4 grade",Toast.LENGTH_SHORT).show();
                        return;

                    }
                    if(credithour7>4.00){
                        Toast.makeText(gpa.this,"Enter less than or equal 4 grade",Toast.LENGTH_SHORT).show();
                        return;

                    }
                    if(credithour8>4.00){
                        Toast.makeText(gpa.this,"Enter less than or equal 4 grade",Toast.LENGTH_SHORT).show();
                        return;

                    }



                     totalGpaCrh = (gpa1*credithour1)+(gpa2*credithour2)+(gpa3*credithour3)+(gpa4*credithour4)+(gpa5*credithour5)+(gpa6*credithour6)+(gpa7*credithour7)+(gpa8*credithour8);
                     totalCr= credithour1+credithour2+credithour3+credithour4+credithour5+credithour6+credithour7+credithour8;
                     result = totalGpaCrh/totalCr;
                    resultText.setText("Your GPA is: "+String.format("%.2f",result));
                }
            });
            clearButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    resultText.setText("");
                    edtGpa_sub1.setText("");
                    edtGpa_sub2.setText("");
                    edtGpa_sub3.setText("");
                    edtGpa_sub4.setText("");
                    edtGpa_sub5.setText("");
                    edtGpa_sub6.setText("");
                    edtGpa_sub7.setText("");
                    edtGpa_sub8.setText("");

                    edtCHR_sub1.setText("");
                    edtCHR_sub2.setText("");
                    edtCHR_sub3.setText("");
                    edtCHR_sub4.setText("");
                    edtCHR_sub5.setText("");
                    edtCHR_sub6.setText("");
                    edtCHR_sub7.setText("");
                    edtCHR_sub8.setText("");

                }
            });
        }



    private void linkup(){
        edtGpa_sub1 = findViewById(R.id.edt_gpa1);
        edtCHR_sub1 = findViewById(R.id.edt_CRHour1);

        edtGpa_sub2 = findViewById(R.id.edt_gpa2);
        edtCHR_sub2 = findViewById(R.id.edt_CRHour2);

        edtGpa_sub3 = findViewById(R.id.edt_gpa3);
        edtCHR_sub3 = findViewById(R.id.edt_CRHour3);

        edtGpa_sub4 = findViewById(R.id.edt_gpa4);
        edtCHR_sub4 = findViewById(R.id.edt_CRHour4);

        edtGpa_sub5 = findViewById(R.id.edt_gpa5);
        edtCHR_sub5 = findViewById(R.id.edt_CRHour5);

        edtGpa_sub6 = findViewById(R.id.edt_gpa6);
        edtCHR_sub6 = findViewById(R.id.edt_CRHour6);

        edtGpa_sub7 = findViewById(R.id.edt_gpa7);
        edtCHR_sub7 = findViewById(R.id.edt_CRHour7);

        edtGpa_sub8 = findViewById(R.id.edt_gpa8);
        edtCHR_sub8 = findViewById(R.id.edt_CRHour8);

        resultText = findViewById(R.id.gpaResultTextViewID);

        submitButton = findViewById(R.id.submitButtonID);
        clearButton = findViewById(R.id.clearButtonID);

    }

}
