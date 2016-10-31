package com.example.chenchen.workshop.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.example.chenchen.workshop.R;

public class EventActivity extends Activity {

    private TextView eventName_tv;                          // 一个TextView，内容是活动的名字

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        Intent intent = getIntent();                             // 得到之前传过来的意图
        String eventName = intent.getStringExtra("name");       // 在这个意图中得到活动名

        eventName_tv = (TextView) findViewById(R.id.eventName_tv);  // 找到TextView

        eventName_tv.setText(eventName);                       // 给这个TextView添加text
    }

}
