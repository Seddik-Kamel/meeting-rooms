package com.example.meetingrooms.architecture.ui.activities.utils;

import android.view.View;

import androidx.test.espresso.UiController;
import androidx.test.espresso.ViewAction;

import com.example.meetingrooms.R;
import com.google.android.material.textfield.TextInputEditText;

import org.hamcrest.Matcher;

public class SetTextViewAction implements ViewAction {

    private final String value;

    public SetTextViewAction(String value) {
        this.value = value;
    }

    @Override
    public Matcher<View> getConstraints() {
        return null;
    }

    @Override
    public String getDescription() {
      return  "Set text";
    }

    @Override
    public void perform(UiController uiController, View view) {

        View textInput = view.findViewById(R.id.participants_meeting);
        ((TextInputEditText) view).setText(value);
    }
}
