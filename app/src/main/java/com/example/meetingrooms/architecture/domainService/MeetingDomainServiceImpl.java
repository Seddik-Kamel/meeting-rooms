package com.example.meetingrooms.architecture.domainService;

import com.example.meetingrooms.architecture.database.fakeData.FakeDataGenerator;
import com.example.meetingrooms.architecture.model.MeetingModel;
import com.example.meetingrooms.architecture.domainService.exceptions.MeetingMissingMandatoryFieldsException;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class MeetingDomainServiceImpl implements MeetingDomainService {

    @Inject
    public MeetingDomainServiceImpl() {
    }

    @Override
    public void validateMeeting(MeetingModel meetingModel) {
        if (areMandatoryFieldMissing(meetingModel)) {
            throw new MeetingMissingMandatoryFieldsException(getUserMissingFields(meetingModel));
        }

        meetingModel.setResource(getResource(meetingModel.getPlace()));
    }

    private boolean areMandatoryFieldMissing(MeetingModel meetingModel) {
        return meetingModel.getHour().isEmpty() || meetingModel.getPlace().isEmpty() || meetingModel.getParticipants().isEmpty();
    }

    private List<String> getUserMissingFields(MeetingModel meetingModel) {
        List<String> fields = new ArrayList<>();

        if (meetingModel.getHour().isEmpty())
            fields.add("hour");
        if (meetingModel.getPlace().isEmpty())
            fields.add("place");
        if (meetingModel.getParticipants().isEmpty())
            fields.add("participants");

        return fields;

    }

    private int getResource(String place) {
        int resource = 0;
        switch (place) {
            case "Ouranos":
                resource = FakeDataGenerator.OURANOS_COLOR;
                break;
            case "Apollon":
                resource = FakeDataGenerator.APOLLON_COLOR;
                break;
            case "Arès":
                resource = FakeDataGenerator.ARES_COLOR;
                break;
            case "Poseidon":
                resource = FakeDataGenerator.POSEIDON_COLOR;
                break;
            case "Rhea":
                resource = FakeDataGenerator.RHEA_COLOR;
                break;
        }
        return resource;
    }
}
