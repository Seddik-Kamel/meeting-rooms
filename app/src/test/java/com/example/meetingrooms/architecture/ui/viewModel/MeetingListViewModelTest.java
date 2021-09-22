package com.example.meetingrooms.architecture.ui.viewModel;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import com.example.meetingrooms.architecture.database.fakeData.FakeDataGenerator;
import com.example.meetingrooms.architecture.infrastructure.repository.MeetingRepositoryImpl;
import com.example.meetingrooms.architecture.infrastructure.repository.MeetingRepositoryService;
import com.example.meetingrooms.architecture.model.MeetingModel;

import org.hamcrest.collection.IsIterableContainingInAnyOrder;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class MeetingListViewModelTest {

    MeetingListViewModel meetingListViewModel;
    MeetingRepositoryService meetingRepositoryService;

    @Before
    public void setUp() {
        meetingRepositoryService = new MeetingRepositoryImpl();
        meetingListViewModel = new MeetingListViewModel(meetingRepositoryService);
    }

    @Test
    public void getMeetingWithSuccess() {
        List<MeetingModel> meetingListViewModelMeeting = meetingListViewModel.getMeeting();
        List<MeetingModel> dummyMeetingListViewModelMeeting = FakeDataGenerator.DUMMY_MEETING;

        assertThat(meetingListViewModelMeeting, IsIterableContainingInAnyOrder.containsInAnyOrder(dummyMeetingListViewModelMeeting.toArray()));
    }

    @Test
    public void deleteMeetingWithSuccess(){
        MeetingModel meetingModelToDelete = meetingListViewModel.getMeeting().get(0);
        meetingRepositoryService.create(meetingModelToDelete);
        assertTrue(meetingRepositoryService.getMeeting().contains(meetingModelToDelete));
    }


}