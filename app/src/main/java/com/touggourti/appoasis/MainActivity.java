package com.touggourti.appoasis;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.touggourti.oasis.Tools;
import com.touggourti.oasis.oaActivity;
import com.touggourti.oasis.oaDialog;

public class MainActivity extends oaActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = find(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = find(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MainActivity.this.getStringDialog("hello", "You message", "#18BC9C",
                        R.mipmap.ic_launcher, new Tools.oaCallBack() {
                            @Override
                            public void returnString(String str) {
                                Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
                            }
                        });

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
