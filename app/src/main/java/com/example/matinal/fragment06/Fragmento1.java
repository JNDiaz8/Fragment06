package com.example.matinal.fragment06;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewFragment;

public class Fragmento1 extends WebViewFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);
        WebView navegador = getWebView();
        navegador.loadUrl("https://www.google.com/");
        navegador.getSettings().setJavaScriptEnabled(true);
        navegador.getSettings().setBuiltInZoomControls(true);
        return view;
    }
}
