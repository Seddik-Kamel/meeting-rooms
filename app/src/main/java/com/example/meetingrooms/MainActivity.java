package com.example.meetingrooms;

import android.os.Bundle;

import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.meetingrooms.baseActivity.BaseActivity;
import com.example.meetingrooms.di.DI;
import com.example.meetingrooms.fakeData.FakeDataGenerator;
import com.example.meetingrooms.recyclerView.MeetingAdapter;
import com.example.meetingrooms.service.DummyMeetingApiService;
import com.example.meetingrooms.service.MeetingService;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

    private MeetingService meetingService;

    @BindView(R.id.list_meeting)
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(getApplicationContext(), DividerItemDecoration.VERTICAL));

    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        recyclerView.setAdapter(new MeetingAdapter(FakeDataGenerator.DUMMY_MEETING));
    }
}