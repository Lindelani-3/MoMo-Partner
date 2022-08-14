package com.developerdiindy.momopartner.presentation.requesttopay;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import com.developerdiindy.momopartner.R;
import com.developerdiindy.momopartner.presentation.transfer.SelectPayeeActivity;

import org.junit.Rule;
import org.junit.Test;

public class SelectPayerActivityTest {

    @Rule
    public ActivityScenarioRule<SelectPayerActivity> rule = new ActivityScenarioRule<>(SelectPayerActivity.class);

    @Test
    public void isActivityLaunched() {
        ActivityScenario<SelectPayerActivity> scenario = rule.getScenario();
        Espresso.onView(ViewMatchers.withId(R.id.activity_selectPayer)).check(matches(isDisplayed()));
    }

    @Test
    public void isActivityItemsShown() {
        Espresso.onView(ViewMatchers.withId(R.id.btn_selectPayer)).check(matches(isDisplayed()));
        Espresso.onView(ViewMatchers.withId(R.id.lv_selectPayer)).check(matches(isDisplayed()));
    }

    @Test
    public void isItemsShowingCorrectText() {
        Espresso.onView(ViewMatchers.withId(R.id.btn_selectPayer)).check(matches(withText(R.string.select_payer)));
    }

    @Test
    public void isNavSelectPayeeToRequestDetailsWorking() {
        onView(withId(R.id.btn_selectPayer)).perform(click());
        onView(withId(R.id.activity_request_details)).check(matches(isDisplayed()));
    }
}