package com.contect.mycontect;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.contect.mycontect.Config.ContactVolley;

public class ContactApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        inti();
    }

    private void inti() {
        ContactVolley.init(this);
    }
}
