package com.example.meetingrooms.activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.meetingrooms.R;
import com.example.meetingrooms.baseActivity.BaseActivity;
import com.example.meetingrooms.events.DeleteMeetingEvent;
import com.example.meetingrooms.model.Meeting;
import com.example.meetingrooms.recyclerView.adapters.MeetingAdapter;
import com.example.meetingrooms.service.MeetingService;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;
import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends BaseActivity {

   @Inject
   MeetingService meetingService;

   private List<Meeting>meetings;

    @BindView(R.id.list_meeting)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initRecyclerView();

    }

    @Override
    public void onStart() {
        super.onStart();
        //EventBus.getDefault().register(this);
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
    protected void onResume() {
        super.onResume();
        meetings = meetingService.getMeeting();
        recyclerView.setAdapter(new MeetingAdapter(meetings));
    }


    @OnClick(R.id.add_meeting)
    void addNewMeeting() {
        Intent intent = new Intent(getApplicationContext(), AddMeetingActivity.class);
        startActivity(intent);
    }

    //@Subscribe
    public void onDeleteMeeting(DeleteMeetingEvent deleteMeetingEvent){
        Log.d("MainActivity", deleteMeetingEvent.meeting.getPlace());
    }
}