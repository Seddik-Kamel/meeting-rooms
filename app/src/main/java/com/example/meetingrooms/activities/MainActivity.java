package com.example.meetingrooms.activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.meetingrooms.R;
import com.example.meetingrooms.baseActivity.BaseActivity;
import com.example.meetingrooms.fakeData.FakeDataGenerator;
import com.example.meetingrooms.recyclerView.adapters.MeetingAdapter;
import com.example.meetingrooms.service.MeetingService;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    private MeetingService meetingService;

    @BindView(R.id.list_meeting)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initRecyclerView();
    }

    private void initRecyclerView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(getApplicationContext(), DividerItemDecoration.VERTICAL));
    }

    @Override
    public int getLayoutContentViewID() {
        return R.layout.activity_main;
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        recyclerView.setAdapter(new MeetingAdapter(FakeDataGenerator.DUMMY_MEETING));
    }

    @OnClick(R.id.add_meeting)
    void addNewMeeting() {
        Intent intent = new Intent(getApplicationContext(), AddMeetingActivity.class);
        startActivity(intent);
    }
}