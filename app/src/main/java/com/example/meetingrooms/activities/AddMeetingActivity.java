package com.example.meetingrooms.activities;

import android.os.Bundle;

import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.meetingrooms.R;
import com.example.meetingrooms.baseActivity.BaseActivity;
import com.example.meetingrooms.model.Meeting;
import com.example.meetingrooms.model.Participant;
import com.example.meetingrooms.recyclerView.adapters.ParticipantsAdapter;
import com.example.meetingrooms.service.MeetingService;
import com.example.meetingrooms.utils.timePicker.TimePickerFragment;
import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;
import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class AddMeetingActivity extends BaseActivity {

    @Inject
    MeetingService meetingService;

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    @BindView(R.id.participants_meeting)
    TextInputEditText ParticipantTextInputEditText;

    final List<Participant> participantList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(getApplicationContext(), DividerItemDecoration.VERTICAL));
    }

    @Override
    protected int getLayoutContentViewID() {
        return R.layout.add_meeting_activity;
    }

    @OnClick(R.id.hour)
    void showDatePicker() {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(), "timePicker");
    }

    @OnClick(R.id.add_participant)
    void addParticipants() {
        String participantMails = Objects.requireNonNull(ParticipantTextInputEditText.getText()).toString();
        Participant participant = new Participant("Seddik", "Kamel", 34, "seddikKamel1@gmail.com");
        participant.setMails(participantMails);
        participantList.add(participant);
        recyclerView.setAdapter(new ParticipantsAdapter(participantList));
    }
}