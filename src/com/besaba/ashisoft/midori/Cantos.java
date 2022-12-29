package com.besaba.ashisoft.midori;

import org.apache.cordova.DroidGap;
import android.os.Bundle;
import android.view.WindowManager;

public class Cantos extends DroidGap
{
	@Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_principal);
        //super.setIntegerProperty("loadUrlTimeoutValue", 7000);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        super.loadUrl("file:///android_asset/www/index.html");
        
    }
}
