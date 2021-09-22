package com.example.meetingrooms.architecture.ui.activities;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.replaceText;

import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.filters.LargeTest;
import androidx.test.runner.AndroidJUnit4;

import com.example.meetingrooms.R;
import com.example.meetingrooms.architecture.ui.activities.utils.RecyclerViewItemCountAssertion;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class AddMeetingActivityTest {

    @Before
    public void setUp() {
        ActivityScenario.launch(ListMeetingActivity.class);
        onView(ViewMatchers.withId(R.id.add_meeting)).perform(click());
    }


    @Test
    public void myAddActivity_setParticipant_shouldAddParticipant() {
        ViewInteraction materialAutoCompleteTextView = onView(ViewMatchers.withId(R.id.participants_meeting));
        materialAutoCompleteTextView.perform(replaceText("seddikkamel1@gmail.com"));
        onView(ViewMatchers.withId(R.id.add_participant)).perform(click());
        onView(ViewMatchers.withId(R.id.recyclerView_participant)).check(RecyclerViewItemCountAssertion.withItemCount(1));
    }

    @Test
    public void myAddActivity_setMeeting_shouldAddMeeting() {
        onView(ViewMatchers.withId(R.id.hour)).perform(replaceText("8 20"));
        onView(ViewMatchers.withId(R.id.autoComplete_place)).perform(replaceText("Ouranos"));
        onView(ViewMatchers.withId(R.id.participants_meeting)).perform(replaceText("seddikkamel1@gmail.com"));
        onView(ViewMatchers.withId(R.id.textInputEditText_subject)).perform(replaceText("Kotlin"));
        onView(ViewMatchers.withId(R.id.add_participant)).perform(click());
        onView(ViewMatchers.withId(R.id.recyclerView_participant)).check(RecyclerViewItemCountAssertion.withItemCount(1));
        onView(ViewMatchers.withId(R.id.save)).perform(click());
        onView(ViewMatchers.withId(R.id.list_meeting)).check(RecyclerViewItemCountAssertion.withItemCount(52));
    }
}

