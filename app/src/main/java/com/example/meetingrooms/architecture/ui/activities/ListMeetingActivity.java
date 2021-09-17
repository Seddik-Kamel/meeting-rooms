package com.example.meetingrooms.architecture.ui.activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.meetingrooms.R;
import com.example.meetingrooms.architecture.ui.baseActivity.BaseActivity;
import com.example.meetingrooms.architecture.ui.events.DeleteMeetingEvent;
import com.example.meetingrooms.architecture.ui.recyclerView.adapters.MeetingAdapter;
import com.example.meetingrooms.architecture.ui.viewModel.MeetingListViewModel;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;
import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class ListMeetingActivity extends BaseActivity {

    @Inject
    MeetingListViewModel listMeetingViewHolder;

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
    protected void onResume() {
        super.onResume();
        initList();
    }

    private void initList() {
        recyclerView.setAdapter(new MeetingAdapter(listMeetingViewHolder.getMeeting()));
    }

    @Override
    public void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    public void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }

    @OnClick(R.id.add_meeting)
    void addNewMeeting() {
        Intent intent = new Intent(getApplicationContext(), AddMeetingActivity.class);
        startActivity(intent);
    }

    @Subscribe
    public void onDeleteMeeting(DeleteMeetingEvent deleteMeetingEvent) {
        listMeetingViewHolder.deleteMeeting(deleteMeetingEvent.meeting);
        initList();
    }
}