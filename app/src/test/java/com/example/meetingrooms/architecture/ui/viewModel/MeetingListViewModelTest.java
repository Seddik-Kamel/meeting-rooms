package com.example.meetingrooms.architecture.ui.viewModel;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.example.meetingrooms.architecture.database.fakeData.FakeDataGenerator;
import com.example.meetingrooms.architecture.infrastructure.repository.MeetingRepositoryImpl;
import com.example.meetingrooms.architecture.infrastructure.repository.MeetingRepositoryService;
import com.example.meetingrooms.architecture.model.MeetingModel;

import org.junit.Before;
import org.junit.Test;

public class MeetingListViewModelTest {

    MeetingListViewModel meetingListViewModel;
    MeetingRepositoryService meetingRepositoryService;

    @Before
    public void setUp() {
        meetingRepositoryService = new MeetingRepositoryImpl();
        meetingListViewModel = new MeetingListViewModel(meetingRepositoryService);
    }

    @Test
    public void createMetingWithSuccess() {
        MeetingModel meetingModel = FakeDataGenerator.DUMMY_MEETING.get(0);
        meetingListViewModel.deleteMeeting(meetingModel);
        meetingListViewModel.createMeeting(meetingModel);
        assertTrue(meetingListViewModel.getMeeting().contains(meetingModel));
    }

    @Test
    public void deleteMeetingWithSuccess() {
        MeetingModel meetingModelToDelete = meetingListViewModel.getMeeting().get(0);
        assertTrue(meetingListViewModel.getMeeting().contains(meetingModelToDelete));
        meetingListViewModel.deleteMeeting(meetingModelToDelete);
        assertFalse(meetingListViewModel.getMeeting().contains(meetingModelToDelete));
    }
}