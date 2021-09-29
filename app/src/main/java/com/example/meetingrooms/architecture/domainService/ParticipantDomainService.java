package com.example.meetingrooms.architecture.domainService;

import com.example.meetingrooms.architecture.model.ParticipantModel;

public interface ParticipantDomainService {

    void validateParticipantEmail(ParticipantModel participantModel);
}
