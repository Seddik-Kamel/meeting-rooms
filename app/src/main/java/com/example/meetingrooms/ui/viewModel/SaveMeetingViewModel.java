package com.example.meetingrooms.ui.viewModel;

import com.example.meetingrooms.applicationservices.AddMeetingService;
import com.example.meetingrooms.exceptions.MeetingMissingMandatoryFieldsException;
import com.example.meetingrooms.infrastructure.repository.ParticipantRepositoryService;
import com.example.meetingrooms.model.MeetingModel;

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
