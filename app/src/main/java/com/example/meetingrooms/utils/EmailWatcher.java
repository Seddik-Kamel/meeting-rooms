package com.example.meetingrooms.utils;

import android.text.Editable;
import android.text.TextWatcher;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailWatcher implements TextWatcher {
    public static final String REGEX_EMAIL = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
    private final TextInputLayout textInputLayoutParticipants;
    private final MaterialButton addParticipant;

    public final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile(REGEX_EMAIL, Pattern.CASE_INSENSITIVE);

    public boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }

    public EmailWatcher(TextInputLayout textInputLayoutParticipants, MaterialButton addParticipant) {
        this.textInputLayoutParticipants = textInputLayoutParticipants;
        this.addParticipant = addParticipant;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable editable) {
        if (!validate(editable.toString()) && !editable.toString().isEmpty()) {
            textInputLayoutParticipants.setError("l'email n'est pas valide");
            addParticipant.setEnabled(false);
        } else {
            textInputLayoutParticipants.setError(null);
            addParticipant.setEnabled(true);
        }
    }
}
