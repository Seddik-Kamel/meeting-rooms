package com.example.meetingrooms.architecture.infrastructure.repository;

import com.example.meetingrooms.architecture.database.fakeData.FakeDataGenerator;
import com.example.meetingrooms.architecture.model.MeetingModel;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;


public class MeetingRepositoryImpl implements MeetingRepositoryService {

    @Inject
    public MeetingRepositoryImpl() {
    }

    public static List<MeetingModel> meetingModelList = new ArrayList<>(FakeDataGenerator.DUMMY_MEETING);

    @Override
    public void create(MeetingModel meetingModel) {
        meetingModelList.add(0,meetingModel);
    }

    @Override
    public List<MeetingModel> getMeeting() {
        return meetingModelList;
    }

    @Override
    public void delete(MeetingModel meetingModel) {
        meetingModelList.remove(meetingModel);
    }

    @Override
    public void upgrade(MeetingModel meetingModel) {

    }
}
