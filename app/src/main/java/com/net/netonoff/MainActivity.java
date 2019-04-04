package com.net.netonoff;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import controller.ControllerBtnWifiOnOff;
import model.Wifi;

public class MainActivity extends AppCompatActivity {

    ControllerBtnWifiOnOff controllerBtnWifiOnOff = new ControllerBtnWifiOnOff();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        @SuppressLint("WifiManagerLeak")
        WifiManager wifi = (WifiManager) getSystemService(Context.WIFI_SERVICE);
        Wifi netWifi = new Wifi();

        Button btnWifiOnOff = (Button) findViewById(R.id.btnWifiOnOff);
        Context context = getApplicationContext();
        controllerBtnWifiOnOff.btn(btnWifiOnOff, context);
        controllerBtnWifiOnOff.wifiOn(btnWifiOnOff, wifi);




    }
}
