package com.example.meetingrooms.architecture.ui.viewModel;

import com.example.meetingrooms.architecture.infrastructure.repository.MeetingRepositoryService;
import com.example.meetingrooms.architecture.model.MeetingModel;

import java.util.List;

import javax.inject.Inject;

public class MeetingListViewModel {

    private final MeetingRepositoryService meetingRepositoryService;

    @Inject
    public MeetingListViewModel(MeetingRepositoryService meetingRepositoryService) {
        this.meetingRepositoryService = meetingRepositoryService;
    }

    public List<MeetingModel> getMeeting(){
        return meetingRepositoryService.getMeeting();
    }

    public void  deleteMeeting(MeetingModel meetingModel){
        meetingRepositoryService.delete(meetingModel);
    }

    public void createMeeting(MeetingModel meetingModel){
        meetingRepositoryService.create(meetingModel);
    }
}
