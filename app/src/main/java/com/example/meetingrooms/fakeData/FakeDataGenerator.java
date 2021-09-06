package com.example.meetingrooms.fakeData;

import com.example.meetingrooms.model.Meeting;
import com.example.meetingrooms.model.Participant;

import java.util.Arrays;
import java.util.List;

public class FakeDataGenerator {

    private static final List<String> LIST_PARTICIPANTS = Arrays.asList(
            "lolo@gmailcom","laurent@gmailcom","Charles@gmailcom","Marc@gmailcom","Eric@gmailcom","Idir@gmailcom");

    private static final Participant participant = new Participant("Seddik", "Kamel", 36,"seddikkamel1@gmail.com" );

    public static final List<Meeting> DUMMY_MEETING = Arrays.asList(
            new Meeting(1, "8h00", "Ouranos", "Le pair programming",participant ),
            new Meeting(2, "8h00", "Apollon", "TDD",participant ),
            new Meeting(3, "8h00", "Arès", "Coroutine Kotlin",participant ),
            new Meeting(4, "8h00", "Athena", "BDD",participant ),
            new Meeting(5, "8h00", "Demeter", "DEV OPS",participant ),
            new Meeting(6, "8h00", "Hera", "Le pair programming",participant ),
            new Meeting(7, "8h00", "Hermes", "Le pair programming",participant ),
            new Meeting(8, "8h00", "Hestia", "Le pair programming",participant ),
            new Meeting(9, "8h00", "Rhea", "Le pair programming",participant ),
            new Meeting(10, "8h00", "Poseidon", "Le pair programming",participant ),
            new Meeting(10, "8h00", "Poseidon", "Le pair programming",participant ),
            new Meeting(10, "8h00", "Poseidon", "Le pair programming",participant ),
            new Meeting(10, "8h00", "Poseidon", "Le pair programming",participant ),
            new Meeting(10, "8h00", "Poseidon", "Le pair programming",participant ),
            new Meeting(10, "8h00", "Poseidon", "Le pair programming",participant ),
            new Meeting(10, "8h00", "Poseidon", "Le pair programming",participant ),
            new Meeting(10, "8h00", "Poseidon", "Le pair programming",participant ),
            new Meeting(10, "8h00", "Poseidon", "Le pair programming",participant ),
            new Meeting(10, "8h00", "Poseidon", "Le pair programming",participant ),
            new Meeting(10, "8h00", "Poseidon", "Le pair programming",participant ),
            new Meeting(10, "8h00", "Poseidon", "Le pair programming",participant ),
            new Meeting(10, "8h00", "Poseidon", "Le pair programming",participant ),
            new Meeting(10, "8h00", "Poseidon", "Le pair programming",participant ),
            new Meeting(10, "8h00", "Poseidon", "Le pair programming",participant ),
            new Meeting(10, "8h00", "Poseidon", "Le pair programming",participant ),
            new Meeting(10, "8h00", "Poseidon", "Le pair programming",participant ),
            new Meeting(10, "8h00", "Poseidon", "Le pair programming",participant ),
            new Meeting(10, "8h00", "Poseidon", "Le pair programming",participant ),
            new Meeting(10, "8h00", "Poseidon", "Le pair programming",participant ),
            new Meeting(10, "8h00", "Poseidon", "Le pair programming",participant ),
            new Meeting(10, "8h00", "Poseidon", "Le pair programming",participant ),
            new Meeting(10, "8h00", "Poseidon", "Le pair programming",participant ),
            new Meeting(10, "8h00", "Poseidon", "Le pair programming",participant ),
            new Meeting(10, "8h00", "Poseidon", "Le pair programming",participant ),
            new Meeting(10, "8h00", "Poseidon", "Le pair programming",participant ),
            new Meeting(10, "8h00", "Poseidon", "Le pair programming",participant ),
            new Meeting(10, "8h00", "Poseidon", "Le pair programming",participant ),
            new Meeting(10, "8h00", "Poseidon", "Le pair programming",participant ),
            new Meeting(10, "8h00", "Poseidon", "Le pair programming",participant ),
            new Meeting(10, "8h00", "Poseidon", "Le pair programming",participant ),
            new Meeting(10, "8h00", "Poseidon", "Le pair programming",participant ),
            new Meeting(10, "8h00", "Poseidon", "Le pair programming",participant ),
            new Meeting(10, "8h00", "Poseidon", "Le pair programming",participant ),
            new Meeting(10, "8h00", "Poseidon", "Le pair programming",participant ),
            new Meeting(10, "8h00", "Poseidon", "Le pair programming",participant ),
            new Meeting(10, "8h00", "Poseidon", "Le pair programming",participant ),
            new Meeting(10, "8h00", "Poseidon", "Le pair programming",participant ),
            new Meeting(10, "8h00", "Poseidon", "Le pair programming",participant ),
            new Meeting(10, "8h00", "Poseidon", "Le pair programming",participant ),
            new Meeting(10, "8h00", "Poseidon", "Le pair programming",participant )
    );

}
