package com.example.meetingrooms.events;

import com.example.meetingrooms.model.Meeting;

public class DeleteMeetingEvent {

    public Meeting meeting;

    public DeleteMeetingEvent() {
    }

    public DeleteMeetingEvent(Meeting meeting){
        this.meeting = meeting;
    }
}
