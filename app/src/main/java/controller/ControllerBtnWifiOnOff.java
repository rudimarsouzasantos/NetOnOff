package controller;

import android.app.Activity;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import model.Wifi;


public class ControllerBtnWifiOnOff {

    final Wifi wifiOn = new Wifi();

    public ControllerBtnWifiOnOff(){}

    public void btn(final Button btnWifiOnOff, final Context context){

        btnWifiOnOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context contexto = null;
                String texto = "exemplo toast";
                int duracao = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, texto,duracao);
                toast.show();

            }
    });}

    public void wifiOn(final Button btnWifiOnOff, final WifiManager wifi){

        btnWifiOnOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wifiOn.wifiOn(wifi);
            }
        });}
}
