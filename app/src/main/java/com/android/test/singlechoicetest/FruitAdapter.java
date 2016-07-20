package com.android.test.singlechoicetest;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public final class FruitAdapter extends ArrayAdapter<String> {

    private static final String[] FRUITS = {
        "Apple", "Banana", "Lemon", "Orange", "Grape"
    };

    private final LayoutInflater mInflater;

    FruitAdapter(Context context) {
        super(context, 0);
        addAll(FRUITS);

        mInflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = mInflater.inflate(R.layout.item_layout_checkable, parent, false);
        }

        TextView textView = (TextView) view.findViewById(R.id.text_view);

        String fruit = getItem(position);
        textView.setText(fruit);

        return view;
    }
}
