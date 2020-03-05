package com.web.expandablelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.BaseExpandableListAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> Headerlist;
    ArrayList<String> AndroidChildArraylist, webChildArraylist , designchildArraylist;
    HashMap<String, ArrayList<String>> listHashMap;
    BaseExpandableListAdapter baseExpandableListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prepareArraylists();

        baseExpandableListAdapter = new

    }

    private void prepareArraylists() {
        Headerlist = new ArrayList<>();
        Headerlist.add("Android");
        Headerlist.add("Web Developement");
        Headerlist.add("Design");

        AndroidChildArraylist = new ArrayList<>();
        AndroidChildArraylist.add("Java");
        AndroidChildArraylist.add("Kotlin");
        AndroidChildArraylist.add("Ionic");
        AndroidChildArraylist.add("React");

        webChildArraylist = new ArrayList<>();
        webChildArraylist.add("PHP");
        webChildArraylist.add("JSP");
        webChildArraylist.add("ASP");
        webChildArraylist.add("Laravel");

        designchildArraylist.add("Photoshop");
        designchildArraylist.add("Illustrator");
        designchildArraylist.add("InDesign");
        designchildArraylist.add("After Effect");
    }


}
