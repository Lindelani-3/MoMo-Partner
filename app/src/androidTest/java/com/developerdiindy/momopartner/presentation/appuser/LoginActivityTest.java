package com.developerdiindy.momopartner.presentation.appuser;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withEffectiveVisibility;
import static androidx.test.espresso.matcher.ViewMatchers.withHint;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.developerdiindy.momopartner.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class LoginActivityTest {

    @Rule
    public ActivityScenarioRule<LoginActivity> rule = new ActivityScenarioRule<>(LoginActivity.class);

    @Test
    public void isActivityLaunched() {
        ActivityScenario<LoginActivity> scenario = rule.getScenario();
        onView(withId(R.id.activity_login)).check(matches(isDisplayed()));
    }

    @Test
    public void isActivityItemsShown() {
        onView(withId(R.id.et_username_login)).check(matches(withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE)));
        onView(withId(R.id.et_password_login)).check(matches(withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE)));
        onView(withId(R.id.btn_reg_login)).check(matches(isDisplayed()));
        onView(withId(R.id.btn_login)).check(matches(isDisplayed()));
    }

    @Test
    public void isItemsShowingCorrectText() {
        onView(withId(R.id.et_username_login)).check(matches(withHint(R.string.email)));
        onView(withId(R.id.et_password_login)).check(matches(withHint(R.string.password)));
        onView(withId(R.id.btn_reg_login)).check(matches(withText(R.string.register)));
        onView(withId(R.id.btn_login)).check(matches(withText(R.string.login)));
    }

    @Test
    public void isNavLoginToRegisterWorking() {
        //val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.btn_reg_login)).perform(click());
        onView(withId(R.id.activity_register)).check(matches(isDisplayed()));
    }

    /**
     * Test both ways to navigate from SecondaryActivity to MainActivity
     */

    @Test
    public void isNavLoginToRegisterToLoginWorking() {
        onView(withId(R.id.btn_reg_login)).perform(click());
        onView(withId(R.id.activity_register)).check(matches(isDisplayed()));
        onView(withId(R.id.btn_login_reg)).perform(click()); // method 1
        onView(withId(R.id.activity_login)).check(matches(isDisplayed()));
    }

}