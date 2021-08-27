package com.example.meetingrooms.di;

import com.example.meetingrooms.service.DummyMeetingApiService;
import com.example.meetingrooms.service.MeetingService;

public class DI {

    private static final MeetingService meetingApiService = new DummyMeetingApiService();

    public static MeetingService getMeetingApiService(){
        return meetingApiService;
    }

}
