package com.example.flome.testdp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by flome on 3/6/2016.
 */
public class meAdapter extends BaseAdapter {

    List<String> list;
    Context context;

    public meAdapter(List list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        final int index = position;
        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.item, null);
        }
        final TextView textView = (TextView) view
                .findViewById(R.id.simple_item_1);
        textView.setText(list.get(position));
        final ImageView imageView = (ImageView) view
                .findViewById(R.id.simple_item_2);
        imageView.setBackgroundResource(android.R.drawable.ic_delete);
        imageView.setTag(position);
        imageView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
        // TODO Auto-generated method stub
                list.remove(index);
                notifyDataSetChanged();
                Toast.makeText(context, textView.getText().toString(),
                        Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

}
