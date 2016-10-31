package com.example.chenchen.workshop.view.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.example.chenchen.workshop.R;
import com.example.chenchen.workshop.controller.EditButtonController;
import com.example.chenchen.workshop.model.SimpleEvent;

import java.util.List;


public class EventArrayAdapter extends ArrayAdapter<SimpleEvent> {
    public EventArrayAdapter(Context context, int textViewResourceId, List<SimpleEvent> objects)
    {
        super(context, textViewResourceId, objects);
    }

    @Override
    public View getView(int position, View inflatedView, ViewGroup parent) {
        if (inflatedView == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            inflatedView = inflater.inflate(R.layout.event_list_row, null);
        }

        SimpleEvent event = getItem(position);

        TextView nameText=(TextView)inflatedView.findViewById(R.id.eventName_tv);
        nameText.setText(event.name);
        Button editButton=(Button)inflatedView.findViewById(R.id.editButton);

        editButton.setOnClickListener(new EditButtonController(event.name));            // 为edit按钮添加一个单击监听器，

        return inflatedView;
    }
}
