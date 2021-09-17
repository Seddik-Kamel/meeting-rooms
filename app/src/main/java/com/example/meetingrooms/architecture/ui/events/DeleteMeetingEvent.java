package com.example.meetingrooms.architecture.ui.events;

import com.example.meetingrooms.architecture.model.MeetingModel;

public class DeleteMeetingEvent {

    public MeetingModel meeting;

    public DeleteMeetingEvent() {
    }

    public DeleteMeetingEvent(MeetingModel meeting){
        this.meeting = meeting;
    }
}
