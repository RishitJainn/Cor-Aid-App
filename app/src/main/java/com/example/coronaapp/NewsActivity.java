package com.example.coronaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class NewsActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        webView = findViewById(R.id.webviewid);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://news.google.com/topics/CAAqJggKIiBDQkFTRWdvSkwyMHZNREZqY0hsNUVnVmxiaTFIUWlnQVAB?hl=en-IN&gl=IN&ceid=IN%3Aen");
    }
}
