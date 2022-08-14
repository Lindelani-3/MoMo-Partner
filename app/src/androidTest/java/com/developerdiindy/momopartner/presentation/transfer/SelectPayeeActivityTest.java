package com.developerdiindy.momopartner.presentation.transfer;

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
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.developerdiindy.momopartner.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class SelectPayeeActivityTest {

    @Rule
    public ActivityScenarioRule<SelectPayeeActivity> rule = new ActivityScenarioRule<>(SelectPayeeActivity.class);

    @Test
    public void isActivityLaunched() {
        ActivityScenario<SelectPayeeActivity> scenario = rule.getScenario();
        Espresso.onView(ViewMatchers.withId(R.id.activity_selectPayee)).check(matches(isDisplayed()));
    }

    @Test
    public void isActivityItemsShown() {
        Espresso.onView(ViewMatchers.withId(R.id.btn_selectPayee)).check(matches(isDisplayed()));
        Espresso.onView(ViewMatchers.withId(R.id.lv_selectPayee)).check(matches(isDisplayed()));
    }

    @Test
    public void isItemsShowingCorrectText() {
        Espresso.onView(ViewMatchers.withId(R.id.btn_selectPayee)).check(matches(withText(R.string.select_payee)));
    }

    @Test
    public void isNavSelectPayeeToTransferDetailsWorking() {
        onView(withId(R.id.btn_selectPayee)).perform(click());
        onView(withId(R.id.activity_transfer_details)).check(matches(isDisplayed()));
    }
}