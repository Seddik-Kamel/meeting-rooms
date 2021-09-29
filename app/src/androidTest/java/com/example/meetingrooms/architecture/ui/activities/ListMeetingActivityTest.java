package com.example.meetingrooms.architecture.ui.activities;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.hasMinimumChildCount;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.filters.LargeTest;
import androidx.test.runner.AndroidJUnit4;

import com.example.meetingrooms.R;
import com.example.meetingrooms.architecture.ui.activities.utils.DeleteViewAction;
import com.example.meetingrooms.architecture.ui.activities.utils.RecyclerViewItemCountAssertion;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class ListMeetingActivityTest {

    private static final int ITEMS_COUNT = 51;

    @Before
    public void setUp() {
        ActivityScenario.launch(ListMeetingActivity.class);
    }

    @Test
    public void myMeetingList_shouldNotBeEmpty() {
        onView(ViewMatchers.withId(R.id.list_meeting))
                .check(matches(hasMinimumChildCount(1)));
    }

    @Test
    public void myMeetingList_deleteAction_shouldRemoveItem(){
        onView(ViewMatchers.withId(R.id.list_meeting)).check(RecyclerViewItemCountAssertion.withItemCount(ITEMS_COUNT));
        onView(ViewMatchers.withId(R.id.list_meeting))
                .perform(RecyclerViewActions.actionOnItemAtPosition(1, new DeleteViewAction()));
        onView(ViewMatchers.withId(R.id.list_meeting)).check(RecyclerViewItemCountAssertion.withItemCount(ITEMS_COUNT -1));
    }

    @Test
    public void myMeetingList_clickFloatingButtonAction_shouldStartNewMeetingActivity(){
        onView(ViewMatchers.withId(R.id.add_meeting)).perform(click());
        onView(withId(R.id.view_add_activity)).check(matches(isDisplayed()));
    }


    @Test
    public void myMeetingList_searchPlace_shouldDisplayMeetingWithPlaceAthena(){
        onView(ViewMatchers.withId(R.id.action_search)).perform(click());
        onView(ViewMatchers.withId(R.id.search_src_text)).perform(replaceText("athena"));
        onView(ViewMatchers.withId(R.id.list_meeting)).check(RecyclerViewItemCountAssertion.withItemCount(1));
    }

}
