package com.example.meetingrooms.applicationservices;

import com.example.meetingrooms.domainService.ParticipantDomainService;
import com.example.meetingrooms.infrastructure.repository.ParticipantRepositoryService;
import com.example.meetingrooms.model.ParticipantModel;

import javax.inject.Inject;

public class ParticipantServiceImpl implements ParticipantService {

    private final ParticipantDomainService participantDomainService;
    private final ParticipantRepositoryService participantRepositoryService;

    @Inject
    public ParticipantServiceImpl(ParticipantDomainService participantDomainService, ParticipantRepositoryService participantRepositoryService) {
        this.participantDomainService = participantDomainService;
        this.participantRepositoryService = participantRepositoryService;
    }

    @Override
    public void saveParticipant(ParticipantModel participantModel) {
        participantDomainService.validParticipantMail(participantModel);
        participantRepositoryService.create(participantModel);
    }
}
