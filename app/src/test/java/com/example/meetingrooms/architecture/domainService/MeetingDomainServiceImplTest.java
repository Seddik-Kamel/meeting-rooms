package com.example.meetingrooms.architecture.domainService;

import static org.junit.Assert.*;

import com.example.meetingrooms.R;
import com.example.meetingrooms.architecture.database.fakeData.FakeDataGeneratorTest;
import com.example.meetingrooms.architecture.model.MeetingModel;
import com.example.meetingrooms.exceptions.MeetingMissingMandatoryFieldsException;

import org.junit.Before;
import org.junit.Test;

public class MeetingDomainServiceImplTest {

   MeetingDomainService meetingDomainService;
   MeetingModel meetingModelWithEmptyField;
   MeetingModel meetingModel;

    @Before
    public void setup() {
        meetingDomainService = new MeetingDomainServiceImpl();
        meetingModelWithEmptyField = FakeDataGeneratorTest.meetingModelWithEmptyField;
        meetingModel = FakeDataGeneratorTest.meetingModel;
    }

    @Test
    public void myMeetingDomainService_missingMandatory_shouldThrowMeetingMissingMandatoryFieldsException() {
        assertThrows(MeetingMissingMandatoryFieldsException.class, () ->
                meetingDomainService.validMeeting(meetingModelWithEmptyField));
    }

    @Test
    public void myMeetingDomainService_validMeeting_shouldAddResource() {
        meetingDomainService.validMeeting(meetingModel);
        assertEquals(R.drawable.pink_circle, meetingModel.getResource());
    }
}