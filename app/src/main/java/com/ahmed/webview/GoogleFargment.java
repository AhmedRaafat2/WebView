package com.ahmed.webview;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

public class GoogleFargment  extends Fragment {

    WebView webView;
    String link = "https:/www.google.com/";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.google,container,false);
        webView = v.findViewById(R.id.web);
        webView.loadUrl(link);
        return v;
    }
}
