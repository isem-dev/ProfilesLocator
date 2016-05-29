package com.android.isem.profileslocator;

import android.app.Application;

import com.firebase.client.Firebase;

public class ProfilesLocatorApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
