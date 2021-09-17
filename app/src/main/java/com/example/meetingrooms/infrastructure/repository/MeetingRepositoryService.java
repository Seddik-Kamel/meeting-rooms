package com.example.meetingrooms.infrastructure.repository;

import com.example.meetingrooms.model.MeetingModel;

import java.util.List;

public interface MeetingRepositoryService {

    void create(MeetingModel meetingModel);
    List<MeetingModel> getMeeting();
    void delete(MeetingModel meetingModel);
    void upgrade(MeetingModel meetingModel);
}
