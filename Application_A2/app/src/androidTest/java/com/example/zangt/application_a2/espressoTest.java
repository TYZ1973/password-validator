package com.example.zangt.application_a2;

/**
 * Created by zangt on 2018/2/9.
 */
import org.junit.Rule;
import org.junit.Test;
import android.support.test.rule.ActivityTestRule;
import static android.support.test.espresso.Espresso.onView;
//import static android.support.test.espresso.action.ViewActions.click;
//import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.*;
//import static android.support.test.espresso.matcher.ViewMatchers.withText;


public class espressoTest {
    private String pd;

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Test
    public void checkHigh() {
        pd = "QTah1234";
        onView(withId(R.id.editText))
                .perform(typeText(pd), closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView))
                .check(matches(withText("Password level - High")));
    }
    @Test
    public void checkMedium() {
        pd = "1260yuio";
        onView(withId(R.id.editText))
                .perform(typeText(pd), closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView))
                .check(matches(withText("Password level - Medium")));
    }
    @Test
    public void checkLow() {
        pd = "90299999";
        onView(withId(R.id.editText))
                .perform(typeText(pd), closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView))
                .check(matches(withText("Password level - Low")));
    }
    @Test
    public void checkIfPd() {
        pd = "password";
        onView(withId(R.id.editText))
                .perform(typeText(pd), closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView))
                .check(matches(withText("Your can not set password as password!!")));
    }
    @Test
    public void checkLength() {
        pd = "1w2e3";
        onView(withId(R.id.editText))
                .perform(typeText(pd), closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView))
                .check(matches(withText("Password should at least 8 digits")));
    }
}