package com.example.task_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] inputCurrencyArray;
    String[] convertedCurrencyArray;
    private Spinner inputSpinner, convertedSpinner;
    private EditText inputEditText;
    private TextView resultTextView;
    private Button submitButton;
    private boolean selection1 = true;
    private boolean selection2 = true;
    String input, inputCountry, convertedCountry;
    private double inputDouble, result=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linkup();
        arrayAdapter();
        processing();

    }

    private void linkup(){
        inputCurrencyArray = getResources().getStringArray(R.array.arrayInputCurrency);
        convertedCurrencyArray = getResources().getStringArray(R.array.arrayConvertedCurrency);

        inputSpinner = findViewById(R.id.spinnerInputId);
        convertedSpinner = findViewById(R.id.spinnerConvertedId);

        inputEditText = findViewById(R.id.editTextId);

        resultTextView = findViewById(R.id.resultTextViewId);

        submitButton = findViewById(R.id.ShowButtonId);

    }

    private void arrayAdapter(){
        ArrayAdapter<String> adapterInputCurrency = new ArrayAdapter<String>(this, R.layout.sample_view, R.id.inputTextViewSampleId, inputCurrencyArray);
        inputSpinner.setAdapter(adapterInputCurrency);

        ArrayAdapter<String> adapterConvertedCurrency = new ArrayAdapter<String>(this, R.layout.sample_view_converted, R.id.convertedTextViewSampleId, convertedCurrencyArray);
        convertedSpinner.setAdapter(adapterConvertedCurrency);
    }

    private void processing(){

        inputSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(selection1==true){
                    selection1=false;
                }
                else{
                    inputEditText.setText("");
                    Toast.makeText(getApplicationContext(),inputCurrencyArray[position]+" is selected", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        convertedSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (selection2==true){
                    selection2=false;
                }
                else{
                    resultTextView.setText("");
                    Toast.makeText(getApplicationContext(), convertedCurrencyArray[position]+" is selected", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });




        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                input = inputEditText.getText().toString();
                inputDouble = Double.parseDouble(input);


                inputCountry = inputSpinner.getSelectedItem().toString();
                convertedCountry = convertedSpinner.getSelectedItem().toString();

                if(inputCountry.equals("Bangladeshi Taka") && convertedCountry.equals("Kuwaiti Dinar")){
                    result = inputDouble/279.83;
                    resultTextView.setText(String.format("%.2f",result));
                }

                if(inputCountry.equals("Kuwaiti Dinar") && convertedCountry.equals("Bangladeshi Taka")){
                    result = inputDouble*279.83;
                    resultTextView.setText(String.format("%.2f",result));
                }

                if(inputCountry.equals("Bangladeshi Taka") && convertedCountry.equals("United States Dollar")){
                    result = inputDouble/84.84;
                    resultTextView.setText(String.format("%.2f",result));
                }

                if(inputCountry.equals("United States Dollar") && convertedCountry.equals("Bangladeshi Taka")){
                    result = inputDouble*84.84;
                    resultTextView.setText(String.format("%.2f",result));
                }

                if(inputCountry.equals("Bangladeshi Taka") && convertedCountry.equals("Euro")){
                    result = inputDouble/104.51;
                    resultTextView.setText(String.format("%.2f",result));
                }

                if(inputCountry.equals("Euro") && convertedCountry.equals("Bangladeshi Taka")){
                    result = inputDouble*104.51;
                    resultTextView.setText(String.format("%.2f",result));
                }

                if(inputCountry.equals("Bangladeshi Taka") && convertedCountry.equals("Japanese Yen")){
                    result = inputDouble*1.22;
                    resultTextView.setText(String.format("%.2f",result));
                }

                if(inputCountry.equals("Japanese Yen") && convertedCountry.equals("Bangladeshi Taka")){
                    result = inputDouble/1.22;
                    resultTextView.setText(String.format("%.2f",result));
                }

                if(inputCountry.equals("Kuwaiti Dinar") && convertedCountry.equals("United States Dollar")){
                    result = inputDouble*3.30;
                    resultTextView.setText(String.format("%.2f",result));
                }

                if(inputCountry.equals("United States Dollar") && convertedCountry.equals("Kuwaiti Dinar")){
                    result = inputDouble/3.30;
                    resultTextView.setText(String.format("%.2f",result));
                }

                if(inputCountry.equals("Kuwaiti Dinar") && convertedCountry.equals("Euro")){
                    result = inputDouble*2.68;
                    resultTextView.setText(String.format("%.2f",result));
                }

                if(inputCountry.equals("Euro") && convertedCountry.equals("Kuwaiti Dinar")){
                    result = inputDouble/2.68;
                    resultTextView.setText(String.format("%.2f",result));
                }

                if(inputCountry.equals("Kuwaiti Dinar") && convertedCountry.equals("Japanese Yen")){
                    result = inputDouble*340.45;
                    resultTextView.setText(String.format("%.2f",result));
                }

                if(inputCountry.equals("Japanese Yen") && convertedCountry.equals("Kuwaiti Dinar")){
                    result = inputDouble/340.45;
                    resultTextView.setText(String.format("%.2f",result));
                }

                if(inputCountry.equals("United States Dollar") && convertedCountry.equals("Euro")){
                    result = inputDouble/1.23;
                    resultTextView.setText(String.format("%.2f",result));
                }

                if(inputCountry.equals("Euro") && convertedCountry.equals("United States Dollar")){
                    result = inputDouble*1.23;
                    resultTextView.setText(String.format("%.2f",result));
                }

                if(inputCountry.equals("United States Dollar") && convertedCountry.equals("Japanese Yen")){
                    result = inputDouble*103.22;
                    resultTextView.setText(String.format("%.2f",result));
                }

                if(inputCountry.equals("Japanese Yen") && convertedCountry.equals("United States Dollar")){
                    result = inputDouble/103.22;
                    resultTextView.setText(String.format("%.2f",result));
                }

                if(inputCountry.equals("Euro") && convertedCountry.equals("Japanese Yen")){
                    result = inputDouble*127.16;
                    resultTextView.setText(String.format("%.2f",result));
                }

                if(inputCountry.equals("Japanese Yen") && convertedCountry.equals("Euro")){
                    result = inputDouble/127.16;
                    resultTextView.setText(String.format("%.2f",result));
                }


            }
        });

    }
}