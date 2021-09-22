package com.example.meetingrooms.architecture.infrastructure.repository;

import static org.junit.Assert.*;

import com.example.meetingrooms.architecture.database.fakeData.FakeDataGeneratorTest;
import com.example.meetingrooms.architecture.model.ParticipantModel;

import org.junit.Before;
import org.junit.Test;

public class ParticipantRepositoryImplTest {

    private ParticipantRepositoryService participantRepositoryService;
    private ParticipantModel participantModel;

    @Before
    public void setUp(){
        participantRepositoryService = new ParticipantRepositoryImpl();
        participantModel = FakeDataGeneratorTest.participantModel;
    }

    @Test
    public void create() {
        participantRepositoryService.create(participantModel);
        assertTrue(participantRepositoryService.getParticipants().contains(participantModel));
    }

    @Test
    public void getParticipants() {
        participantRepositoryService.create(participantModel);
        assertEquals(1, participantRepositoryService.getParticipants().size());
    }

    @Test
    public void delete() {
        participantRepositoryService.create(participantModel);
        participantRepositoryService.delete(participantModel);
        assertFalse(participantRepositoryService.getParticipants().contains(participantModel));
    }

    @Test
    public void clearList() {
        participantRepositoryService.create(participantModel);
        participantRepositoryService.create(participantModel);
        participantRepositoryService.create(participantModel);
        participantRepositoryService.clearList();
        assertEquals(0, participantRepositoryService.getParticipants().size());
    }
}