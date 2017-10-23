package com.anybodycanc.iasbhu;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class AboutUsActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_us);
        WebView myWebView = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = myWebView.getSettings();
        setTitle("About Us");
        webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl("http://iagscbhu.in/about.php");
    }
}