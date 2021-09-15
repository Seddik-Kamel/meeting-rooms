package com.example.meetingrooms.activities;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.meetingrooms.R;
import com.example.meetingrooms.baseActivity.BaseActivity;
import com.example.meetingrooms.fakeData.FakeDataGenerator;
import com.example.meetingrooms.model.Meeting;
import com.example.meetingrooms.model.Participant;
import com.example.meetingrooms.recyclerView.adapters.ParticipantsAdapter;
import com.example.meetingrooms.service.MeetingService;
import com.example.meetingrooms.utils.EmailWatcher;
import com.example.meetingrooms.utils.timePicker.TimePickerFragment;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

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
    TextInputEditText participantTextInputEditText;

    @BindView(R.id.hour)
    TextInputEditText textInputEditTextHourMeeting;

    @BindView(R.id.text_input_layout_participants)
    TextInputLayout textInputLayoutParticipants;

    @BindView(R.id.add_participant)
    MaterialButton addParticipant;

    @BindView(R.id.autoComplete_place)
    AutoCompleteTextView autoCompleteTextViewPlace;

    @BindView(R.id.text_input_layout_subject)
    TextInputLayout textInputLayoutSubject;

    final List<Participant> participantList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(getApplicationContext(), DividerItemDecoration.VERTICAL));

        Objects.requireNonNull(textInputLayoutParticipants.getEditText()).addTextChangedListener(new EmailWatcher(textInputLayoutParticipants, addParticipant));

        String[] stringList = getResources().getStringArray(R.array.place_meeting);
        autoCompleteTextViewPlace.setAdapter(new ArrayAdapter<>(getApplicationContext(), R.layout.spinner_participants, stringList));
    }

    @Override
    protected int getLayoutContentViewID() {
        return R.layout.add_meeting_activity;
    }

    @OnClick(R.id.hour)
    void showDatePicker() {
        DialogFragment newFragment = new TimePickerFragment(textInputEditTextHourMeeting);
        newFragment.show(getSupportFragmentManager(), "timePicker");
    }

    @OnClick(R.id.add_participant)
    void addParticipants() {
        String participantMails = Objects.requireNonNull(participantTextInputEditText.getText()).toString();
        Participant participant = new Participant("Seddik", "Kamel", 34, "");
        participant.setMails(participantMails);
        participantList.add(participant);
        recyclerView.setAdapter(new ParticipantsAdapter(participantList));

        Objects.requireNonNull(textInputLayoutParticipants.getEditText()).setText(null);
    }

    @OnClick(R.id.save)
    void saveMeeting() {

        String hourMeeting = Objects.requireNonNull(textInputEditTextHourMeeting.getText()).toString();
        String place = autoCompleteTextViewPlace.getText().toString();
        String subject = Objects.requireNonNull(textInputLayoutSubject.getEditText()).getText().toString();
        int resource = 0;

        resource = getResource(place, resource);

        Meeting meeting = new Meeting(4, hourMeeting,
                place,
                subject, participantList, resource);
        meetingService.createMeeting(meeting);


        finish();
    }

    private int getResource(String place, int resource) {
        switch (place) {
            case "Ouranos":
                resource = FakeDataGenerator.OURANOS_COLOR;
                break;
            case "Apollon":
                resource = FakeDataGenerator.APOLLON_COLOR;
                break;
            case "Arès":
                resource = FakeDataGenerator.ARES_COLOR;
                break;
            case "Poseidon":
                resource = FakeDataGenerator.POSEIDON_COLOR;
                break;
            case "Rhea":
                resource = FakeDataGenerator.RHEA_COLOR;
                break;
        }
        return resource;
    }
}