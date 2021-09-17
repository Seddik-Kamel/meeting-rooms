package com.example.meetingrooms.architecture.ui.viewModel;

import com.example.meetingrooms.architecture.applicationservices.AddMeetingService;
import com.example.meetingrooms.exceptions.MeetingMissingMandatoryFieldsException;
import com.example.meetingrooms.architecture.infrastructure.repository.ParticipantRepositoryService;
import com.example.meetingrooms.architecture.model.MeetingModel;

import javax.inject.Inject;

public class SaveMeetingViewModel {

    public AddMeetingService addMeetingService;
    public ParticipantRepositoryService participantRepositoryService;

    @Inject
    public SaveMeetingViewModel(AddMeetingService addMeetingService,
                                ParticipantRepositoryService participantRepositoryService) {

        this.addMeetingService = addMeetingService;
        this.participantRepositoryService = participantRepositoryService;
    }

    public void saveMeeting(MeetingModel meetingModel) {
        try {
            addMeetingService.saveMeeting(meetingModel);
        } catch (MeetingMissingMandatoryFieldsException e) {
            //on fait quelque chose
            int jk =0;
        }

    }

}