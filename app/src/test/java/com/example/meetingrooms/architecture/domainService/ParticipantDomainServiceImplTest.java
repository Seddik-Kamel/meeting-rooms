package com.example.meetingrooms.architecture.domainService;

import static org.junit.Assert.*;

import com.example.meetingrooms.architecture.database.fakeData.FakeDataGeneratorTest;
import com.example.meetingrooms.architecture.model.ParticipantModel;
import com.example.meetingrooms.architecture.domainService.exceptions.InvalidEmailException;

import org.junit.Before;
import org.junit.Test;

public class ParticipantDomainServiceImplTest {

    ParticipantDomainService participantDomainService;
    private ParticipantModel participantModel;

    @Before
    public void setup() {
     participantDomainService = new ParticipantDomainServiceImpl();
     participantModel = FakeDataGeneratorTest.participantModel;
    }

    @Test
    public void myParticipantDomainService_invalidEmail_shouldThrowInvalidEmailException() {
        assertThrows(InvalidEmailException.class, () ->
                participantDomainService.validateParticipantEmail(participantModel));
    }
}