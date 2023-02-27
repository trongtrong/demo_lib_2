package com.example.testjitpack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.npsdk.LibListener;
import com.npsdk.module.NPayLibrary;
import com.npsdk.module.model.SdkConfig;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SdkConfig sdkConfig = new SdkConfig.Builder().merchantCode("sdk_test").uid("uid").env(NPayLibrary.SANDBOX).brandColor(0xff15AE62).build();
        initSdk(sdkConfig);

    }

    private void initSdk(SdkConfig sdkConfig) {
        NPayLibrary.getInstance().init(MainActivity.this, sdkConfig, new LibListener() {

            @Override
            public void onLoginSuccessful() {

            }

            @Override
            public void onPaySuccessful() {

            }

            @Override
            public void getInfoSuccess(String phone, String balance, String ekycStatus) {

            }

            @Override
            public void onError(int errorCode, String message) {

            }

            @Override
            public void getActionMerchantSuccess() {

            }

            @Override
            public void onLogoutSuccessful() {

            }
        });

        NPayLibrary.getInstance().getInfoAccount();
    }

}