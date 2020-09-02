package com.aap.searchticket;

import android.app.Application;

import com.aap.searchticket.activity.BuildConfig;

import timber.log.Timber;



/**
 * Created by abha on 09/01/20.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) Timber.plant(new Timber.DebugTree());
    }
}
