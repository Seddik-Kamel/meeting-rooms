package com.example.meetingrooms.infrastructure.repository;

import com.example.meetingrooms.model.ParticipantModel;

import java.util.List;

public interface ParticipantRepositoryService {

    void create(ParticipantModel participantModel);
    List<ParticipantModel> getParticipants();
    void delete(ParticipantModel participantModel);
    void upgrade(ParticipantModel participantModel);
    void clearList();
}
