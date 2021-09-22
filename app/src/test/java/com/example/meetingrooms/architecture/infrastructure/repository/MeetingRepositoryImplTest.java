package com.example.meetingrooms.architecture.infrastructure.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.example.meetingrooms.architecture.database.fakeData.FakeDataGeneratorTest;
import com.example.meetingrooms.architecture.model.MeetingModel;

import org.junit.Before;
import org.junit.Test;

public class MeetingRepositoryImplTest {

    private MeetingRepositoryService meetingRepositoryService;
    private final MeetingModel meetingModel = FakeDataGeneratorTest.meetingModel;

    @Before
    public void setUp(){
        meetingRepositoryService = new MeetingRepositoryImpl();
    }

    @Test
    public void myMeetingRepository_createMeeting_shouldContainsMeetingModel() {
       meetingRepositoryService.create(meetingModel);
       assertTrue(meetingRepositoryService.getMeeting().contains(meetingModel));
    }

    @Test
    public void myMeetingRepository_getMeeting_shouldItemCountEQUAL51() {
        assertEquals(51, meetingRepositoryService.getMeeting().size());
    }

    @Test
    public void myMeetingRepository_deleteMeeting_shouldNoContainsMeetingModelAdded() {
        meetingRepositoryService.delete(meetingModel);
        assertFalse(meetingRepositoryService.getMeeting().contains(meetingModel));
    }

}