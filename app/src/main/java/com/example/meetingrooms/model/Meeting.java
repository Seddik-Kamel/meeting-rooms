package com.example.meetingrooms.model;

import java.util.List;

public class Meeting {
    private long id;
    private String hour;
    private String place;
    private String subject;

    private List<Participant> participants;
    private int resource;

    public Meeting(long id, String hour, String place, String subject, List<Participant> participants, int resource) {
        this.id = id;
        this.hour = hour;
        this.place = place;
        this.subject = subject;
        this.participants = participants;
        this.resource = resource;
    }

// Getters and Setters.

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }


    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }
}
