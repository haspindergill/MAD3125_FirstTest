package com.example.haspinder.c0728467_carservicereminder;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HistoryActivity extends Activity {

    ListView listView;
    String []employeeName = { "Service 1","Service 2"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
           listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, //Context
                android.R.layout.simple_list_item_1, //Layout
                employeeName); ///Item list
        //Set Adapter to list view
        listView.setAdapter(arrayAdapter);
    }
}
