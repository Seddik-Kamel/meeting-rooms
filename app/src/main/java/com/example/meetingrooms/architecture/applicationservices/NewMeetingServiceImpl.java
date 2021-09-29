package com.example.meetingrooms.architecture.applicationservices;

import com.example.meetingrooms.architecture.domainService.MeetingDomainService;
import com.example.meetingrooms.architecture.infrastructure.repository.MeetingRepositoryService;
import com.example.meetingrooms.architecture.model.MeetingModel;

import javax.inject.Inject;

public class NewMeetingServiceImpl implements NewMeetingService {

    private  final MeetingDomainService meetingService;
    private  final MeetingRepositoryService meetingRepositoryService;


    @Inject
    public NewMeetingServiceImpl(MeetingDomainService meetingService,
                                 MeetingRepositoryService meetingRepositoryService) {

        this.meetingService = meetingService;
        this.meetingRepositoryService = meetingRepositoryService;
    }

    @Override
    public void saveMeeting(MeetingModel meetingModel) {
        meetingService.validateMeeting(meetingModel);
        meetingRepositoryService.create(meetingModel);
    }

}
