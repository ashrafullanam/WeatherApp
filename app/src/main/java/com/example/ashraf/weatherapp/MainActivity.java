package com.example.ashraf.weatherapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    ArrayList<ViewClass> viewClasses;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.listview);
        viewClasses=new ArrayList<>();
        viewClasses.add(new ViewClass("Mon","80","50"));
        viewClasses.add(new ViewClass("Sun","70","45"));
        viewClasses.add(new ViewClass("Mon","80","50"));
        viewClasses.add(new ViewClass("Sun","70","45"));

        viewClasses.add(new ViewClass("Mon","80","50"));
        viewClasses.add(new ViewClass("Sun","70","45"));
        viewClasses.add(new ViewClass("Mon","80","50"));
        viewClasses.add(new ViewClass("Sun","70","45"));

        viewClasses.add(new ViewClass("Mon","80","50"));
        viewClasses.add(new ViewClass("Sun","70","45"));
        viewClasses.add(new ViewClass("Mon","80","50"));
        viewClasses.add(new ViewClass("Sun","70","45"));
        AdapterClass adapterClass = new AdapterClass(this,viewClasses);
    }
}
