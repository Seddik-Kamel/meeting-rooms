package com.example.meetingrooms.applicationservices;

import com.example.meetingrooms.domainService.MeetingDomainService;
import com.example.meetingrooms.infrastructure.repository.MeetingRepositoryService;
import com.example.meetingrooms.model.MeetingModel;

import javax.inject.Inject;

public class AddMeetingServiceImpl implements AddMeetingService {

    private  final MeetingDomainService meetingService;
    private  final MeetingRepositoryService meetingRepositoryService;


    @Inject
    public AddMeetingServiceImpl(MeetingDomainService meetingService,
                                 MeetingRepositoryService meetingRepositoryService) {

        this.meetingService = meetingService;
        this.meetingRepositoryService = meetingRepositoryService;
    }

    @Override
    public void saveMeeting(MeetingModel meetingModel) {
        meetingService.validMeeting(meetingModel);
        meetingRepositoryService.create(meetingModel);
    }

}
