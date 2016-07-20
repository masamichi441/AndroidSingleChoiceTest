package com.android.test.singlechoicetest;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.TextView;

public final class SingleChoiceAdapter extends ArrayAdapter<String> {

    private static final String[] FRUITS = {
        "Apple", "Banana", "Lemon", "Orange", "Grape"
    };

    private final LayoutInflater mInflater;

    private int mSelectedIndex = -1;

    SingleChoiceAdapter(Context context) {
        super(context, 0);
        addAll(FRUITS);

        mInflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = mInflater.inflate(R.layout.item_layout, parent, false);
        }

        // 本当はここで ViewHolder パターンを使うべきだが省略
        TextView textView       = (TextView)    view.findViewById(R.id.text_view);
        RadioButton radioButton = (RadioButton) view.findViewById(R.id.radio_button);

        String fruit = getItem(position);
        textView.setText(fruit);

        radioButton.setChecked(position == mSelectedIndex);


        return view;
    }

    void setSelectedIndex(int index) {
        mSelectedIndex = index;
        notifyDataSetChanged();
    }
}
