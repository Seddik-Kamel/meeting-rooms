package com.example.meetingrooms.architecture.applicationservices;

import com.example.meetingrooms.architecture.domainService.MeetingDomainService;
import com.example.meetingrooms.architecture.infrastructure.repository.MeetingRepositoryService;
import com.example.meetingrooms.architecture.model.MeetingModel;

import javax.inject.Inject;

public class NewMeetingServiceImpl implements NewMeetingService {

    private  final MeetingDomainService meetingDomainService;
    private  final MeetingRepositoryService meetingRepositoryService;


    @Inject
    public NewMeetingServiceImpl(MeetingDomainService meetingDomainService,
                                 MeetingRepositoryService meetingRepositoryService) {

        this.meetingDomainService = meetingDomainService;
        this.meetingRepositoryService = meetingRepositoryService;
    }

    @Override
    public void saveMeeting(MeetingModel meetingModel) {
        meetingDomainService.validateMeeting(meetingModel);
        meetingRepositoryService.create(meetingModel);
    }

}
