package com.example.meetingrooms.architecture.ui.activities;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.meetingrooms.R;
import com.example.meetingrooms.architecture.ui.activities.base.BaseActivity;
import com.example.meetingrooms.architecture.model.MeetingModel;
import com.example.meetingrooms.architecture.model.ParticipantModel;
import com.example.meetingrooms.architecture.ui.recyclerView.adapters.ParticipantsAdapter;
import com.example.meetingrooms.architecture.ui.viewModel.NewMeetingViewModel;
import com.example.meetingrooms.architecture.ui.viewModel.ParticipantListViewModel;
import com.example.meetingrooms.architecture.ui.components.watchers.EmailWatcher;
import com.example.meetingrooms.architecture.ui.components.timePicker.TimePickerFragment;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;
import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class NewMeetingActivity extends BaseActivity {

    @Inject
    NewMeetingViewModel newMeetingViewModel;

    @Inject
    ParticipantListViewModel participantListViewModel;

    @BindView(R.id.recyclerView_participant)
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initRecyclerView();
        initSpinner();
        initParticipantList();
        initTextChangedListener();
    }

    private void initTextChangedListener() {
        Objects.requireNonNull(textInputLayoutParticipants.getEditText()).addTextChangedListener(new EmailWatcher(textInputLayoutParticipants, addParticipant));
    }

    private void initParticipantList() {
        participantListViewModel.clearParticipant();
    }

    private void initRecyclerView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(getApplicationContext(), DividerItemDecoration.VERTICAL));
    }

    private void initSpinner(){
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
        participantListViewModel.saveParticipant( new ParticipantModel("Test", "Test", 34,  Objects.requireNonNull(participantTextInputEditText.getText()).toString()));
        initParticipantView();
    }

    @OnClick(R.id.save)
    void addMeeting() {
        String hourMeeting = Objects.requireNonNull(textInputEditTextHourMeeting.getText()).toString();
        String place = autoCompleteTextViewPlace.getText().toString();
        String subject = Objects.requireNonNull(textInputLayoutSubject.getEditText()).getText().toString();
        saveMeeting(hourMeeting, place, subject);

        finish();
    }

    private void saveMeeting(String hourMeeting, String place, String subject) {
        MeetingModel meeting = new MeetingModel(4, hourMeeting,
                place,
                subject, participantListViewModel.getParticipantsList());
        newMeetingViewModel.saveMeeting(meeting);
    }

    private void initParticipantView() {
        recyclerView.setAdapter(new ParticipantsAdapter(participantListViewModel.getParticipantsList()));
        Objects.requireNonNull(textInputLayoutParticipants.getEditText()).setText(null);
    }
}