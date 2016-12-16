package com.touggourti.oasis;

import android.app.Activity;
import android.app.Dialog;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.EditText;

/**
 * Created by seddik on 14/12/2016.
 */

public class Tools {
    public static String getCreators() {
        return "Abdelouahed + Mohammed Seddik";
    }

    /**
     * just a dumb method
     *
     * @return
     */
    public static String get2() {
        return "oa";
    }

    /**
     * Shows a dialog and retrieve a string from the textview
     * @param activity
     * @param title
     * @param default_value
     * @param callback
     */
    public static void getStringDialog(Activity activity, String title, String default_value, final oaCallBack callback) {
        final Dialog dialog = new Dialog(activity);
        dialog.setContentView(R.layout.text_dialog);
        DisplayMetrics metrics = activity.getResources().getDisplayMetrics();
        int width = metrics.widthPixels;
        dialog.getWindow().setLayout(width - 10, LinearLayoutCompat.LayoutParams.WRAP_CONTENT);
        dialog.setTitle(title);
        dialog.show();
        final EditText text = (EditText) dialog.findViewById(R.id.text_value);
        text.setText(default_value);
        dialog.findViewById(R.id.btn_done).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callback.returnString(text.getText().toString());
                dialog.dismiss();
            }
        });


    }
    public interface oaCallBack{
        void returnString(String str);
    }

}
