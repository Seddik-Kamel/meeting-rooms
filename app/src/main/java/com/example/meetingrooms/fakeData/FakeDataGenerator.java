package com.example.meetingrooms.fakeData;

import com.example.meetingrooms.model.Meeting;

import java.util.Arrays;
import java.util.List;

public class FakeDataGenerator {

    private static final List<String> LIST_PARTICIPANTS = Arrays.asList(
            "lolo@gmailcom","laurent@gmailcom","Charles@gmailcom","Marc@gmailcom","Eric@gmailcom","Idir@gmailcom");


    public static List<Meeting> DUMMY_MEETING = Arrays.asList(
            new Meeting(1, "8h00", "Ouranos", "Le pair programming",LIST_PARTICIPANTS ),
            new Meeting(2, "8h00", "Apollon", "TDD",LIST_PARTICIPANTS ),
            new Meeting(3, "8h00", "Arès", "Coroutine Kotlin",LIST_PARTICIPANTS ),
            new Meeting(4, "8h00", "Athena", "BDD",LIST_PARTICIPANTS ),
            new Meeting(5, "8h00", "Demeter", "DEV OPS",LIST_PARTICIPANTS ),
            new Meeting(6, "8h00", "Hera", "Le pair programming",LIST_PARTICIPANTS ),
            new Meeting(7, "8h00", "Hermes", "Le pair programming",LIST_PARTICIPANTS ),
            new Meeting(8, "8h00", "Hestia", "Le pair programming",LIST_PARTICIPANTS ),
            new Meeting(9, "8h00", "Rhea", "Le pair programming",LIST_PARTICIPANTS ),
            new Meeting(10, "8h00", "Poseidon", "Le pair programming",LIST_PARTICIPANTS )
    );

}
