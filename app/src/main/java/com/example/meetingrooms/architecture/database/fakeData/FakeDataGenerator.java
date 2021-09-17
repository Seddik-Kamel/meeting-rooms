package com.example.meetingrooms.architecture.database.fakeData;

import com.example.meetingrooms.R;
import com.example.meetingrooms.architecture.model.MeetingModel;
import com.example.meetingrooms.architecture.model.ParticipantModel;

import java.util.Arrays;
import java.util.List;

public class FakeDataGenerator {

    public static final int OURANOS_COLOR = R.drawable.pink_circle;
    public static final int APOLLON_COLOR = R.drawable.blue_circle;
    public static final int ARES_COLOR = R.drawable.red_circle;
    public static final int ATHENA_COLOR = R.drawable.yellow_circle;
    public static final int DEMETER_COLOR = R.drawable.green_circle;
    public static final int HERA_COLOR = R.drawable.black_circle;
    public static final int HERMES_COLOR = R.drawable.brown_circle;
    public static final int HESTIA_COLOR = R.drawable.purple_circle;
    public static final int RHEA_COLOR = R.drawable.orange_circle;
    public static final int POSEIDON_COLOR = R.drawable.cyan_circle;


    private static final List<ParticipantModel> PARTICIPANT_LIST = Arrays.asList(
            new ParticipantModel("Seddik", "Kamel", 36, "seddikkamel1@gmail.com"),
            new ParticipantModel("Seddik", "Kamel", 36, "seddikkamel1@gmail.com"),
            new ParticipantModel("Seddik", "Kamel", 36, "seddikkamel1@gmail.com"),
            new ParticipantModel("Seddik", "Kamel", 36, "seddikkamel1@gmail.com"),
            new ParticipantModel("Seddik", "Kamel", 36, "seddikkamel1@gmail.com"),
            new ParticipantModel("Seddik", "Kamel", 36, "seddikkamel1@gmail.com"),
            new ParticipantModel("Seddik", "Kamel", 36, "seddikkamel1@gmail.com")
    );


    public static final List<MeetingModel> DUMMY_MEETING = Arrays.asList(
            new MeetingModel(1, "8h00", "Ouranos", "Le pair programming", PARTICIPANT_LIST, OURANOS_COLOR),
            new MeetingModel(2, "8h00", "Apollon", "TDD", PARTICIPANT_LIST, APOLLON_COLOR),
            new MeetingModel(3, "8h00", "Arès", "Coroutine Kotlin", PARTICIPANT_LIST, ARES_COLOR),
            new MeetingModel(4, "8h00", "Athena", "BDD", PARTICIPANT_LIST, ATHENA_COLOR),
            new MeetingModel(5, "8h00", "Demeter", "DEV OPS", PARTICIPANT_LIST, DEMETER_COLOR),
            new MeetingModel(6, "8h00", "Hera", "Le pair programming", PARTICIPANT_LIST, HERA_COLOR),
            new MeetingModel(7, "8h00", "Hermes", "Le pair programming", PARTICIPANT_LIST, HERMES_COLOR),
            new MeetingModel(8, "8h00", "Hestia", "Le pair programming", PARTICIPANT_LIST, HESTIA_COLOR),
            new MeetingModel(9, "8h00", "Rhea", "Le pair programming", PARTICIPANT_LIST, RHEA_COLOR),
            new MeetingModel(10, "8h00", "Poseidon", "Le pair programming", PARTICIPANT_LIST, POSEIDON_COLOR),
            new MeetingModel(10, "8h00", "Poseidon", "Le pair programming", PARTICIPANT_LIST, POSEIDON_COLOR),
            new MeetingModel(10, "8h00", "Poseidon", "Le pair programming", PARTICIPANT_LIST, POSEIDON_COLOR),
            new MeetingModel(10, "8h00", "Poseidon", "Le pair programming", PARTICIPANT_LIST, POSEIDON_COLOR),
            new MeetingModel(10, "8h00", "Poseidon", "Le pair programming", PARTICIPANT_LIST, POSEIDON_COLOR),
            new MeetingModel(10, "8h00", "Poseidon", "Le pair programming", PARTICIPANT_LIST, POSEIDON_COLOR),
            new MeetingModel(10, "8h00", "Poseidon", "Le pair programming", PARTICIPANT_LIST, POSEIDON_COLOR),
            new MeetingModel(10, "8h00", "Poseidon", "Le pair programming", PARTICIPANT_LIST, POSEIDON_COLOR),
            new MeetingModel(10, "8h00", "Poseidon", "Le pair programming", PARTICIPANT_LIST, POSEIDON_COLOR),
            new MeetingModel(10, "8h00", "Poseidon", "Le pair programming", PARTICIPANT_LIST, POSEIDON_COLOR),
            new MeetingModel(10, "8h00", "Poseidon", "Le pair programming", PARTICIPANT_LIST, POSEIDON_COLOR),
            new MeetingModel(10, "8h00", "Poseidon", "Le pair programming", PARTICIPANT_LIST, POSEIDON_COLOR),
            new MeetingModel(10, "8h00", "Poseidon", "Le pair programming", PARTICIPANT_LIST, POSEIDON_COLOR),
            new MeetingModel(10, "8h00", "Poseidon", "Le pair programming", PARTICIPANT_LIST, POSEIDON_COLOR),
            new MeetingModel(10, "8h00", "Poseidon", "Le pair programming", PARTICIPANT_LIST, POSEIDON_COLOR),
            new MeetingModel(10, "8h00", "Poseidon", "Le pair programming", PARTICIPANT_LIST, POSEIDON_COLOR),
            new MeetingModel(10, "8h00", "Poseidon", "Le pair programming", PARTICIPANT_LIST, POSEIDON_COLOR),
            new MeetingModel(10, "8h00", "Poseidon", "Le pair programming", PARTICIPANT_LIST, POSEIDON_COLOR),
            new MeetingModel(10, "8h00", "Poseidon", "Le pair programming", PARTICIPANT_LIST, POSEIDON_COLOR),
            new MeetingModel(10, "8h00", "Poseidon", "Le pair programming", PARTICIPANT_LIST, POSEIDON_COLOR),
            new MeetingModel(10, "8h00", "Poseidon", "Le pair programming", PARTICIPANT_LIST, POSEIDON_COLOR),
            new MeetingModel(10, "8h00", "Poseidon", "Le pair programming", PARTICIPANT_LIST, POSEIDON_COLOR),
            new MeetingModel(10, "8h00", "Poseidon", "Le pair programming", PARTICIPANT_LIST, POSEIDON_COLOR),
            new MeetingModel(10, "8h00", "Poseidon", "Le pair programming", PARTICIPANT_LIST, POSEIDON_COLOR),
            new MeetingModel(10, "8h00", "Poseidon", "Le pair programming", PARTICIPANT_LIST, POSEIDON_COLOR),
            new MeetingModel(10, "8h00", "Poseidon", "Le pair programming", PARTICIPANT_LIST, POSEIDON_COLOR),
            new MeetingModel(10, "8h00", "Poseidon", "Le pair programming", PARTICIPANT_LIST, POSEIDON_COLOR),
            new MeetingModel(10, "8h00", "Poseidon", "Le pair programming", PARTICIPANT_LIST, POSEIDON_COLOR),
            new MeetingModel(10, "8h00", "Poseidon", "Le pair programming", PARTICIPANT_LIST, POSEIDON_COLOR),
            new MeetingModel(10, "8h00", "Poseidon", "Le pair programming", PARTICIPANT_LIST, POSEIDON_COLOR),
            new MeetingModel(10, "8h00", "Poseidon", "Le pair programming", PARTICIPANT_LIST, POSEIDON_COLOR),
            new MeetingModel(10, "8h00", "Poseidon", "Le pair programming", PARTICIPANT_LIST, POSEIDON_COLOR),
            new MeetingModel(10, "8h00", "Poseidon", "Le pair programming", PARTICIPANT_LIST, POSEIDON_COLOR),
            new MeetingModel(10, "8h00", "Poseidon", "Le pair programming", PARTICIPANT_LIST, POSEIDON_COLOR),
            new MeetingModel(10, "8h00", "Poseidon", "Le pair programming", PARTICIPANT_LIST, POSEIDON_COLOR),
            new MeetingModel(10, "8h00", "Poseidon", "Le pair programming", PARTICIPANT_LIST, POSEIDON_COLOR),
            new MeetingModel(10, "8h00", "Poseidon", "Le pair programming", PARTICIPANT_LIST, POSEIDON_COLOR),
            new MeetingModel(10, "8h00", "Poseidon", "Le pair programming", PARTICIPANT_LIST, POSEIDON_COLOR),
            new MeetingModel(10, "8h00", "Poseidon", "Le pair programming", PARTICIPANT_LIST, POSEIDON_COLOR),
            new MeetingModel(10, "8h00", "Poseidon", "Le pair programming", PARTICIPANT_LIST, POSEIDON_COLOR),
            new MeetingModel(10, "8h00", "Poseidon", "Le pair programming", PARTICIPANT_LIST, POSEIDON_COLOR),
            new MeetingModel(10, "8h00", "Poseidon", "Le pair programming", PARTICIPANT_LIST, POSEIDON_COLOR)
    );

}
