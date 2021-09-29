package com.example.meetingrooms.architecture.ui.viewModel;

import com.example.meetingrooms.architecture.applicationservices.NewMeetingService;
import com.example.meetingrooms.architecture.domainService.exceptions.MeetingMissingMandatoryFieldsException;
import com.example.meetingrooms.architecture.infrastructure.repository.ParticipantRepositoryService;
import com.example.meetingrooms.architecture.model.MeetingModel;

import javax.inject.Inject;

public class NewMeetingViewModel {

    public final NewMeetingService newMeetingService;
    public final ParticipantRepositoryService participantRepositoryService;

    @Inject
    public NewMeetingViewModel(NewMeetingService newMeetingService,
                               ParticipantRepositoryService participantRepositoryService) {

        this.newMeetingService = newMeetingService;
        this.participantRepositoryService = participantRepositoryService;
    }

    public void saveMeeting(MeetingModel meetingModel) {
        try {
            newMeetingService.saveMeeting(meetingModel);
        } catch (MeetingMissingMandatoryFieldsException e) {

        }
    }

}
