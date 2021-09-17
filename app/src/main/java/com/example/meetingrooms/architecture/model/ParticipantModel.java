package com.example.meetingrooms.architecture.model;

public class ParticipantModel {

    private String name;
    private String lastName;
    private int age;
    private String mails;


    public ParticipantModel(String name, String lastName, int age, String mails) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.mails = mails;
    }

    // Getters and Setters.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMails() {
        return mails;
    }

    public void setMails(String mails) {
        this.mails = mails;
    }
}
