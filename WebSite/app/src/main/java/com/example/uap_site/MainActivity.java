package com.example.uap_site;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private WebView covidWeb;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        covidWeb=findViewById(R.id.covid_web);

        WebSettings webSettings=covidWeb.getSettings();
        webSettings.setJavaScriptEnabled(true);

        covidWeb.setWebViewClient(new WebViewClient());
        covidWeb.loadUrl("https://www.worldometers.info/coronavirus/");
    }

    @Override
    public void onBackPressed() {

        if(covidWeb.canGoBack()){
            covidWeb.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}
