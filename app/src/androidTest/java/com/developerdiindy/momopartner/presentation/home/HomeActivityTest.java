package com.developerdiindy.momopartner.presentation.home;

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
import com.developerdiindy.momopartner.presentation.transfer.TransferDetailsActivity;

import org.junit.Rule;
import org.junit.Test;

public class HomeActivityTest {

    @Rule
    public ActivityScenarioRule<HomeActivity> rule = new ActivityScenarioRule<>(HomeActivity.class);

    @Test
    public void isActivityLaunched() {
        ActivityScenario<HomeActivity> scenario = rule.getScenario();
        Espresso.onView(ViewMatchers.withId(R.id.activity_home)).check(matches(isDisplayed()));
    }

    @Test
    public void isActivityItemsShown() {
        Espresso.onView(ViewMatchers.withId(R.id.lyt_home)).check(matches(isDisplayed()));
        Espresso.onView(ViewMatchers.withId(R.id.imageView_home)).check(matches(isDisplayed()));
        Espresso.onView(ViewMatchers.withId(R.id.lyt_home_accBalance)).check(matches(isDisplayed()));
        Espresso.onView(ViewMatchers.withId(R.id.tv_home_accountBalance)).check(matches(isDisplayed()));
        Espresso.onView(ViewMatchers.withId(R.id.fragment_cont_home)).check(matches(isDisplayed()));
        Espresso.onView(ViewMatchers.withId(R.id.bottom_nav_home)).check(matches(isDisplayed()));
    }

    @Test
    public void isItemsShowingCorrectText() {
        //Espresso.onView(ViewMatchers.withId(R.id.imageView_home)).check(matches(withText(R.drawable.mtn_logo)));
    }

    @Test
    public void isNavigationMenuWorking() {
        // ToDo
    }
}