package com.touggourti.oasis;

import android.app.Dialog;
import android.content.Context;
import android.support.design.widget.TextInputLayout;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * Created by geek on 12/20/16.
 */

public class MyDialog extends Dialog {
    private ImageView imageTitle;
    private EditText text;
    private TextInputLayout inputlayout;
    private RelativeLayout relativeLayout;

    public MyDialog(Context context, final myCallBack callBack) {
        super(context);
        super.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.setContentView(R.layout.custom_dialog);
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        int width = metrics.widthPixels;
        super.getWindow().setLayout(width - 10, LinearLayoutCompat.LayoutParams.WRAP_CONTENT);

        relativeLayout = (RelativeLayout) super.findViewById(R.id.layout_actionbar);
        imageTitle = (ImageView) super.findViewById(R.id.imagetitle);
        text = (EditText) super.findViewById(R.id.contenttext);
        inputlayout = (TextInputLayout) super.findViewById(R.id.textinputlayout);
        super.findViewById(R.id.button_ok).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callBack.returnString(text.getText().toString());
                MyDialog.super.dismiss();
            }
        });

    }

    public void setBackgroundTitleBar(int color) {
        relativeLayout.setBackgroundColor(color);
    }

    public void setImageTitleBar(int image) {
        imageTitle.setImageResource(image);
    }

    public void setHint(String hint) {
        inputlayout.setHint(hint);
    }


    public interface myCallBack {
        void returnString(String result);
    }
}
