package com.concentricsky.android.webviewvideotest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class DetailFragment extends Fragment {

    public static final String TAG = "WebViewVideoTest";
    public static final String VIDEO_URL = "http://clips.vorwaerts-gmbh.de/VfE_html5.mp4";
    
    private WebView webView;

    public DetailFragment() { }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_detail, container, false);
        
        webView = (WebView) rootView.findViewById(R.id.webview);
        
        webView.setWebChromeClient(new WebChromeClient());
        
        webView.loadUrl("file:///android_asset/test.html");
        
        return rootView;
    }
    
    @Override
    public void onDestroy() {
    	super.onDestroy();
    	if (webView != null) {
	    	webView.destroy();
    	}
    }
}
