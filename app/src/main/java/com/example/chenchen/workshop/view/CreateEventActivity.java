package com.example.chenchen.workshop.view;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

import com.example.chenchen.workshop.R;
import com.example.chenchen.workshop.controller.CreateEventActivityController;

public class CreateEventActivity extends Activity {
    private Button addEvent_btn;                            // 添加活动的按钮

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_event);

        addEvent_btn = (Button) findViewById(R.id.add_btn);     // 找到这个按钮

        addEvent_btn.setOnClickListener(new CreateEventActivityController());   // 给这个按钮添加监听器
    }
}
