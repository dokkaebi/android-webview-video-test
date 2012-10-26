package com.concentricsky.android.webviewvideotest;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class TestActivity extends FragmentActivity
        implements ListFragment.Callbacks {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twopane);
    }
    
    @Override
    public void onStart() {
    	super.onStart();
    	
        DetailFragment fragment = new DetailFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.detail_container, fragment)
                .commit();
    }

    @Override
    public void onItemSelected(String id) {
    }
}
