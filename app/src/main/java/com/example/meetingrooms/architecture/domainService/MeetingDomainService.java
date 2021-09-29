package com.example.meetingrooms.architecture.domainService;

import com.example.meetingrooms.architecture.model.MeetingModel;

public interface MeetingDomainService {

    void validateMeeting(MeetingModel meetingModel);
}
