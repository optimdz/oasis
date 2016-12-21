package com.touggourti.oasis;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by seddik on 17/12/2016.
 */

public class oaApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/nat.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}

