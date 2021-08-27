package com.example.meetingrooms.service;

import com.example.meetingrooms.model.Meeting;

import java.util.List;

public interface MeetingService {


    /**
     * Get all my Meeting
     * @return {@link List}
     */
    List<Meeting> getMeeting();

    /**
     * Deletes a meeting
     * @param meeting
     */
    void DeleteMeeting(Meeting meeting);

    /**
     * Create a neighbour
     * @param meeting
     */
    void createMeeting(Meeting meeting);
}
