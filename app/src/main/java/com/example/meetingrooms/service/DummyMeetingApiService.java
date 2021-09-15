package com.example.meetingrooms.service;

import com.example.meetingrooms.fakeData.FakeDataGenerator;
import com.example.meetingrooms.model.Meeting;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

public class DummyMeetingApiService implements MeetingService{

    @Inject
    public DummyMeetingApiService(){

    }

    private List<Meeting> meetings = new ArrayList<>(FakeDataGenerator.DUMMY_MEETING);


    @Override
    public List<Meeting> getMeeting() {
        return meetings;
    }

    @Override
    public void DeleteMeeting(Meeting meeting) {
        meetings.remove(meeting);
    }

    @Override
    public void createMeeting(Meeting meeting) {
        meetings.add(0,meeting);
    }
}
