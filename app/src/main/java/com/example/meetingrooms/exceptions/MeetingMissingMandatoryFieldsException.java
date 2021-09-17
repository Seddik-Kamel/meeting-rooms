package com.example.meetingrooms.exceptions;

import java.util.List;

public class MeetingMissingMandatoryFieldsException extends RuntimeException {


    private final List<String> fields;

    public MeetingMissingMandatoryFieldsException(List<String> fields){
        this.fields = fields;
    }

    public List<String> getFields() {
        return fields;
    }
}
