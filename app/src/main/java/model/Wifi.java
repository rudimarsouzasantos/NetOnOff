package model;

import android.content.Context;
import android.net.wifi.WifiManager;

public class Wifi {

    String name;

    public Wifi(){}

    public void wifiOn(WifiManager wifi){
        wifi.setWifiEnabled(true);
    }


}
