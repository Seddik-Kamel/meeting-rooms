package com.example.meetingrooms.architecture.ui.activities.base;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.ButterKnife;

public abstract  class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(this.getLayoutContentViewID());
        configureToolbar();
        ButterKnife.bind(this);
    }

    protected abstract int getLayoutContentViewID();

    protected void configureToolbar(){
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }
}
