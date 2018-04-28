package com.example.aditi.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class listroom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listroom);

        String [] classrooms = {"TP901","TP902","TP805","TP806", "TP801","TP1002"};
        ListAdapter myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, classrooms);
        ListView myListView = findViewById(R.id.myListView);
        myListView.setAdapter(myAdapter);
    }
}
