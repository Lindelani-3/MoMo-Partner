package com.developerdiindy.momopartner.presentation.appuser;

import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withEffectiveVisibility;
import static androidx.test.espresso.matcher.ViewMatchers.withHint;
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
public class RegisterActivityTest {

    @Rule
    public ActivityScenarioRule<RegisterActivity> rule = new ActivityScenarioRule<>(RegisterActivity.class);

    @Test
    public void isActivityLaunched() {
        ActivityScenario scenario = rule.getScenario();
        Espresso.onView(ViewMatchers.withId(R.id.activity_register)).check(matches(isDisplayed()));
    }

    @Test
    public void isActivityItemsShown() {
        Espresso.onView(ViewMatchers.withId(R.id.et_username_register)).check(matches(withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE)));
        Espresso.onView(ViewMatchers.withId(R.id.et_password_register)).check(matches(withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE)));
        Espresso.onView(ViewMatchers.withId(R.id.et_confirm_password_register)).check(matches(withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE)));
        Espresso.onView(ViewMatchers.withId(R.id.btn_login_reg)).check(matches(isDisplayed()));
        Espresso.onView(ViewMatchers.withId(R.id.btn_reg)).check(matches(isDisplayed()));
    }

    @Test
    public void isItemsShowingCorrectText() {
        Espresso.onView(ViewMatchers.withId(R.id.et_username_register)).check(matches(withHint(R.string.username_login)));
        Espresso.onView(ViewMatchers.withId(R.id.et_password_register)).check(matches(withHint(R.string.password)));
        Espresso.onView(ViewMatchers.withId(R.id.et_confirm_password_register)).check(matches(withHint(R.string.confirm_password)));
        Espresso.onView(ViewMatchers.withId(R.id.btn_login_reg)).check(matches(withText(R.string.back_to_login)));
        Espresso.onView(ViewMatchers.withId(R.id.btn_reg)).check(matches(withText(R.string.register)));
    }

}