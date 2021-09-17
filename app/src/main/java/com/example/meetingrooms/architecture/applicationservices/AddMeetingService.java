package com.example.meetingrooms.architecture.applicationservices;

import com.example.meetingrooms.architecture.model.MeetingModel;

public interface AddMeetingService {

    void saveMeeting(MeetingModel meetingModel);
}
