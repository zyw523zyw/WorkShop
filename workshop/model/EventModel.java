package com.example.chenchen.workshop.model;

import java.util.ArrayList;
import java.util.List;

public class EventModel {
    public List<SimpleEvent> events = new ArrayList<SimpleEvent>();         // 这个ArrayList用来存储所有的event

    private static EventModel singletonInstance;                            // 定义一个EventModel的单例对象

    public static EventModel getSingletonInstance() {
        if (singletonInstance == null)                                      // 如果这个对象为空则为他初始化
            singletonInstance = new EventModel();

        return singletonInstance;
    }


    private EventModel() {

        // 循环20次，新建20个event
        for (int i = 20; i >= 1; i--) {
            SimpleEvent event = new SimpleEvent("event" + i);       // 新建一个活动，活动的名字叫event1, event2, ..., event20
            addEvent(event);                                         // 把这个活动添加到ArrayList中
        }
    }

    // 根据名字找event对象
    public SimpleEvent getEventByName(String name) {
        for (SimpleEvent event : events)    // 遍历events的ArrayList
            if (event.name.equals(name))    // 如果符合条件
                return event;               // 返回这个event

        return null;                        // 遍历结束还没找到，返回空值
    }

    public boolean addEvent(SimpleEvent event) {
        return events.add(event);           // 向events的ArrayList中添加一个活动
    }
}
