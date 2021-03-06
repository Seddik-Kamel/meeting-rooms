package com.example.meetingrooms.architecture.domainService;

import com.example.meetingrooms.architecture.domainService.exceptions.InvalidEmailException;
import com.example.meetingrooms.architecture.model.ParticipantModel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.inject.Inject;

public class ParticipantDomainServiceImpl implements ParticipantDomainService {

    @Inject
    public ParticipantDomainServiceImpl() {
    }

    public static final String REGEX_EMAIL = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
    public final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile(REGEX_EMAIL, Pattern.CASE_INSENSITIVE);

    @Override
    public void validateParticipantEmail(ParticipantModel participantModel) {

        if (isEmailInvalid(participantModel)){
            throw new InvalidEmailException();
        }
    }

    private boolean isEmailInvalid(ParticipantModel participantModel) {
        String emailStr = participantModel.getMails();
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);

        return !matcher.find();
    }
}
