package com.android.test.singlechoicetest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listView = new ListView(this);
        listView.setChoiceMode(AbsListView.CHOICE_MODE_SINGLE);

        ListAdapter adapter = new FruitAdapter(this);

//        final SingleChoiceAdapter adapter = new SingleChoiceAdapter(this);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                adapter.setSelectedIndex(i);
//            }
//        });

        listView.setAdapter(adapter);
        setContentView(listView);
    }
}
