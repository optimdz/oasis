package com.touggourti.oasis;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

/**
 * Created by seddik on 15/12/2016.
 */

public abstract class oaActivity extends AppCompatActivity {
    public <T> T find(int id) {
        return (T) findViewById(id);
    }

    @Override
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(context));
    }
}
