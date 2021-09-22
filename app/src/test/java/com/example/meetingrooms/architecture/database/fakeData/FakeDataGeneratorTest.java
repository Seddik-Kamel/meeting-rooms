package com.example.meetingrooms.architecture.database.fakeData;

import com.example.meetingrooms.architecture.model.MeetingModel;
import com.example.meetingrooms.architecture.model.ParticipantModel;

import java.util.Collections;
import java.util.List;

public class FakeDataGeneratorTest {

    private static final List<ParticipantModel> PARTICIPANT_LIST = Collections.singletonList(
            new ParticipantModel("test", "test", 0, "test")

    );

    static public final MeetingModel meetingModel = new MeetingModel(1, "Test", "Ouranos", "Test", PARTICIPANT_LIST, 0);
    static public final MeetingModel meetingModelWithEmptyField = new MeetingModel(1, "", "Test", "Test", PARTICIPANT_LIST, 0);
    static public final ParticipantModel participantModel = new ParticipantModel("test", "test", 0, "test");
}