package com.www.mobileaddress;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;


public class MainActivity extends ActionBarActivity {
    private TextView txt;
    private TextView tv;
    private Button btn;
    private ToggleButton toggleBtn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.text);
        tv.setSelected(true);
        txt = (TextView) findViewById(R.id.txt);
        btn = (Button) findViewById(R.id.btn);
        OnClickListener btnClickListener = new OnClickListener() {
            public void onClick(View v) {
                txt.setText(R.string.display_btn_clicked);
            }
        };

        btn.setOnClickListener(btnClickListener);
        toggleBtn = (ToggleButton) findViewById(R.id.toggle_btn);
        OnClickListener toggleBtnClickListener = new OnClickListener() {
            public void onClick(View v) {
                if (toggleBtn.isChecked()) {
                    toggleBtn.setChecked(false);
                } else {
                    toggleBtn.setChecked(false);
                }
            }
        };
        toggleBtn.setOnClickListener(toggleBtnClickListener);
    }
}


