package com.example.meetingrooms.service;

import com.example.meetingrooms.fakeData.FakeDataGenerator;
import com.example.meetingrooms.model.Meeting;

import java.util.List;

public class DummyMeetingApiService implements MeetingService{

    private List<Meeting> meetings = FakeDataGenerator.DUMMY_MEETING;

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
        meetings.add(meeting);
    }
}
