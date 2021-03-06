package com.example.meetingrooms.architecture.ui.viewModel;

import com.example.meetingrooms.architecture.applicationservices.ParticipantService;
import com.example.meetingrooms.architecture.domainService.exceptions.InvalidEmailException;
import com.example.meetingrooms.architecture.infrastructure.repository.ParticipantRepositoryService;
import com.example.meetingrooms.architecture.model.ParticipantModel;

import java.util.List;

import javax.inject.Inject;

public class ParticipantListViewModel {

    public final ParticipantRepositoryService participantRepositoryService;
    public final ParticipantService participantService;

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
        }catch (InvalidEmailException e){

        }

    }
}
