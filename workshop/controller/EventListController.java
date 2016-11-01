package com.example.chenchen.workshop.controller;

import android.content.Intent;
import android.view.View;

import com.example.chenchen.workshop.view.CreateEventActivity;

public class EventListController implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(v.getContext(), CreateEventActivity.class);                // 新建跳转到下一个页面的意图
        v.getContext().startActivity(intent);                                                  // 跳转到下一个页面（编辑页面）
    }
}
