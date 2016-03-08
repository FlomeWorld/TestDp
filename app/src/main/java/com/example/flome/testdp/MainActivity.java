package com.example.flome.testdp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    private List<String> list;
    private meAdapter meAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.me_list);

        list = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            list.add(""+i);
        }

        meAdapter = new meAdapter(list, this);

        listView.setAdapter(meAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                View viewById = view.findViewById(R.id.simple_item_2);
                viewById.setVisibility(View.GONE);
            }
        });

    }

    public void click(View view) {
        /*list.add("10000");
        meAdapter.notifyDataSetChanged();*/
        View inflate = LayoutInflater.from(this).inflate(R.layout.item, null);

        View viewById = inflate.findViewById(R.id.simple_item_2);
        viewById.setVisibility(View.GONE);
        meAdapter.notifyDataSetChanged();


    }
}
