package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    WebView webViewT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = (WebView) findViewById(R.id.webView);
        webViewT = webView;
        webView.setWebViewClient(new MyWebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://tv.lordfilm.lu/");
//        myWebView.loadUrl("https://g4.zona.plus");
//        myg4.zona.plusWebView.loadUrl("https://www.tvigle.ru/");
//        myWebView.loadUrl("https://www.youtube.com/watch?v=vu7RS5cpXPQ");


//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O_MR1) {
//            WebView.startSafeBrowsing(appContext, callback);
//        }
    }

    @Override
    public void onBackPressed() {
        if (webViewT.canGoBack()) {
            webViewT.goBack();
        } else {
            super.onBackPressed();
        }
    }
}