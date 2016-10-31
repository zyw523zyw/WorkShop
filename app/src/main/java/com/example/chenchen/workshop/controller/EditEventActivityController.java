package com.example.chenchen.workshop.controller;


import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.example.chenchen.workshop.R;
import com.example.chenchen.workshop.model.EventModel;
import com.example.chenchen.workshop.view.EventListActivity;

public class EditEventActivityController implements View.OnClickListener {

    private EventModel eventModel = EventModel.getSingletonInstance();              // 新建eventModel
    private String oldName;                                                         // 原先的活动名

    public EditEventActivityController(String oldName) {
        this.oldName = oldName;                                                     // 得到原先的活动名
    }

    @Override
    public void onClick(View v) {
        LinearLayout layout = (LinearLayout) v.getParent();                           // 得到v这个控件（就是这个Button）的父元素（LinearLayout）
        EditText name_et = (EditText) layout.findViewById(R.id.name_et);             // 在这个LinearLayout中找到EditText

        String newName = name_et.getText().toString();                               // 得到新输入的新活动名
        eventModel.getEventByName(oldName).name = newName;                       // 先根据旧的活动名找到这个event，再把新的名字赋给那个event

        Intent intent = new Intent(v.getContext(), EventListActivity.class);       // 新建一个跳转回EventList页面的意图
        v.getContext().startActivity(intent);                                       // 执行意图
    }
}
