package com.example.chenchen.workshop.view;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import com.example.chenchen.workshop.R;
import com.example.chenchen.workshop.controller.EventListController;
import com.example.chenchen.workshop.controller.EditButtonController;
import com.example.chenchen.workshop.model.EventModel;
import com.example.chenchen.workshop.view.model.EventArrayAdapter;

import static com.example.chenchen.workshop.model.EventModel.getSingletonInstance;

public class EventListActivity extends ListActivity {
    private ListView listView;                      //  声明一个ListView
    private Button createEvent_btn;                // 声明一个Button（单击之后跳到创建活动的页面）

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_list);

        EventModel eventModel = getSingletonInstance();                       // 给eventModel赋值

        listView = (ListView) findViewById(android.R.id.list);              // 在layout中找到这个ListView
        createEvent_btn = (Button) findViewById(R.id.add_btn);            // 找到这个Button

        EventArrayAdapter eventsListAdapter = new EventArrayAdapter(this, R.layout.event_list_row, eventModel.events);      // 新建一个Adapter
        listView.setAdapter(eventsListAdapter);                             // 把刚才新建的Adapter适配给ListView

        listView.setOnItemClickListener(new EditButtonController());        // 给ListView中的每一行添加监听器


        createEvent_btn.setOnClickListener(new EventListController());   // 给这个Button添加监听器
    }
}
