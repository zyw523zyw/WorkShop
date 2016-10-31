package com.example.chenchen.workshop.controller;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

import com.example.chenchen.workshop.R;
import com.example.chenchen.workshop.view.EditEventActivity;
import com.example.chenchen.workshop.view.EventActivity;

public class EditButtonController implements View.OnClickListener, AdapterView.OnItemClickListener {

    private String name;                    // 活动的名字

    public EditButtonController () {

    }

    public EditButtonController(String name) {
        this.name = name;                                                             // 得到活动的名字
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(v.getContext(), EditEventActivity.class);         // 新建跳转到下一个页面的意图
        intent.putExtra("name", name);                                              // 将name放到这个意图中, ("key", value)
        v.getContext().startActivity(intent);                                        // 跳转到下一个页面(编辑页面)
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView eventName_tv = (TextView) view.findViewById(R.id.eventName_tv);          // 找到行里面的TextView
        String eventName = eventName_tv.getText().toString();                               // 提取TextView中的String

        Intent intent = new Intent(view.getContext(), EventActivity.class);                // 新建跳转到下一个页面的意图
        intent.putExtra("name", eventName);                                                // 将eventName放到这个意图中, ("key", value)
        view.getContext().startActivity(intent);                                            // 跳转到下一个页面(编辑页面)
    }
}
