package com.example.meetingrooms.ui.events;

import com.example.meetingrooms.model.MeetingModel;

public class DeleteMeetingEvent {

    public MeetingModel meeting;

    public DeleteMeetingEvent() {
    }

    public DeleteMeetingEvent(MeetingModel meeting){
        this.meeting = meeting;
    }
}
