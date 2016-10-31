package com.example.chenchen.workshop.controller;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.example.chenchen.workshop.R;
import com.example.chenchen.workshop.model.EventModel;
import com.example.chenchen.workshop.model.SimpleEvent;
import com.example.chenchen.workshop.view.EventListActivity;

public class CreateEventActivityController implements View.OnClickListener {

    @Override
    public void onClick(View v) {
        LinearLayout  parentView = (LinearLayout) v.getParent();                            // 找到v控件（添加活动的按钮）的父控件（Linearlayout）
        EditText eventName_et = (EditText) parentView.findViewById(R.id.eventName_et);    // 通过这个父控件找到EditText（输入新的活动名字的输入框）

        String eventName = eventName_et.getText().toString();                               // 获取EditText中的文字

        EventModel eventModel = EventModel.getSingletonInstance();                          // 得到eventModel

        if (eventModel.getEventByName(eventName) == null) {                                 // 检查这个活动名字是否已经存在
            SimpleEvent newEvent = new SimpleEvent(eventName);                              // 新建一个活动
            eventModel.addEvent(newEvent);                                                  // 把这个活动添加到eventModel中
        }

        Intent intent = new Intent(v.getContext(), EventListActivity.class);       // 新建一个跳转回EventList页面的意图
        v.getContext().startActivity(intent);                                       // 执行意图
    }
}
