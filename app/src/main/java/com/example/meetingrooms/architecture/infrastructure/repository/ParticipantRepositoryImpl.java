package com.example.meetingrooms.architecture.infrastructure.repository;

import com.example.meetingrooms.architecture.model.ParticipantModel;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class ParticipantRepositoryImpl implements ParticipantRepositoryService {

    public static List<ParticipantModel> participantList = new ArrayList<>();

    @Inject
    public ParticipantRepositoryImpl(){

    }

    @Override
    public void create(ParticipantModel participantModel) {
        participantList.add(0,participantModel);
    }

    @Override
    public List<ParticipantModel> getParticipants() {
        return participantList;
    }

    @Override
    public void delete(ParticipantModel participantModel) {
        participantList.remove(participantModel);
    }

    @Override
    public void upgrade(ParticipantModel participantModel) {

    }

    @Override
    public void clearList() {
        participantList.clear();
    }
}
