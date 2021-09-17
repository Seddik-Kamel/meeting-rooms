package com.example.meetingrooms.architecture.infrastructure.repository;

import com.example.meetingrooms.architecture.model.MeetingModel;

import java.util.List;

public interface MeetingRepositoryService {

    void create(MeetingModel meetingModel);
    List<MeetingModel> getMeeting();
    void delete(MeetingModel meetingModel);
    void upgrade(MeetingModel meetingModel);
}
