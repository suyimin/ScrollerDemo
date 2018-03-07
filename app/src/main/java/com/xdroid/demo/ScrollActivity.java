package com.xdroid.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class ScrollActivity extends Activity {

    private LinearLayout layout;

    private Button scrollToBtn;

    private Button scrollByBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll);
        layout = findViewById(R.id.layout);
        scrollToBtn = findViewById(R.id.scroll_to_btn);
        scrollByBtn = findViewById(R.id.scroll_by_btn);
        scrollToBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.scrollTo(-60, -100);
            }
        });
        scrollByBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.scrollBy(-60, -100);
            }
        });
    }
}
