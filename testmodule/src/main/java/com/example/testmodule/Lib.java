package com.example.testmodule;

import android.app.Activity;
import android.content.Intent;

public class Lib {
    private static Lib INSTANCE;
    public Activity activity;
    public LibListener listener;

    public static Lib getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Lib();
        }
        return INSTANCE;
    }


    public void init(Activity activity, LibListener listener) {
        this.activity = activity;
        this.listener = listener;
    }

    public void open(Activity activity, LibListener listener) {
        Intent intent = new Intent(activity, TestActivity.class);
        intent.putExtra("data", "'open test");
        activity.startActivity(intent);
    }

}

interface LibListener{
    public void onTest();
}
