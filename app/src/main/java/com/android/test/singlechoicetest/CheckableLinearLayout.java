package com.android.test.singlechoicetest;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.LinearLayout;
import android.widget.RadioButton;

public class CheckableLinearLayout extends LinearLayout implements Checkable {

    private RadioButton mRadioButton;

    public CheckableLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        mRadioButton = (RadioButton) findViewById(R.id.radio_button);
    }

    @Override
    public void setChecked(boolean b) {
        mRadioButton.setChecked(b);
    }

    @Override
    public boolean isChecked() {
        return mRadioButton.isChecked();
    }

    @Override
    public void toggle() {
        mRadioButton.toggle();
    }
}
