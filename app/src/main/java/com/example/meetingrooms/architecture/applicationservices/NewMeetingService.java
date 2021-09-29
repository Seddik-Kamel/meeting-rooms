package com.example.meetingrooms.architecture.applicationservices;

import com.example.meetingrooms.architecture.model.MeetingModel;

public interface NewMeetingService {

    void saveMeeting(MeetingModel meetingModel);
}
