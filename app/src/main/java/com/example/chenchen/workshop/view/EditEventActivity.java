package com.example.chenchen.workshop.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.chenchen.workshop.R;
import com.example.chenchen.workshop.controller.EditEventActivityController;

public class EditEventActivity extends Activity {
    private String name;                         // 活动名
    private Button update_btn;                  // 更新按钮

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_event);

        Intent intent = getIntent();                  // 得到之前传过来的意图
        name = intent.getStringExtra("name");       // 在这个意图中得到活动名

        update_btn = (Button) findViewById(R.id.update_btn);


        update_btn.setOnClickListener(new EditEventActivityController(name));        // 为更新活动按钮添加一个单击监听
    }
}
