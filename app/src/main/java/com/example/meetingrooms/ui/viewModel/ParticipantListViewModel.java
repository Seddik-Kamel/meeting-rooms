package com.example.meetingrooms.ui.viewModel;

import com.example.meetingrooms.applicationservices.ParticipantService;
import com.example.meetingrooms.exceptions.EmailNotValidException;
import com.example.meetingrooms.infrastructure.repository.ParticipantRepositoryService;
import com.example.meetingrooms.model.ParticipantModel;

import java.util.List;

import javax.inject.Inject;

public class ParticipantListViewModel {

    public ParticipantRepositoryService participantRepositoryService;
    public ParticipantService participantService;

    @Inject
    public ParticipantListViewModel(ParticipantRepositoryService participantRepositoryService,ParticipantService participantService ) {
        this.participantRepositoryService = participantRepositoryService;
        this.participantService = participantService;
    }

    public List<ParticipantModel> getParticipantsList() {
        return participantRepositoryService.getParticipants();
    }

    public void clearParticipant() {
        participantRepositoryService.clearList();
    }

    public void saveParticipant(ParticipantModel participantModel) {
        try {
            participantService.saveParticipant(participantModel);
        }catch (EmailNotValidException e){

        }

    }
}
