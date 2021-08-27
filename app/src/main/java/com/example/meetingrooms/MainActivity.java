package com.example.meetingrooms;

import android.os.Bundle;

import com.example.meetingrooms.baseActivity.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}