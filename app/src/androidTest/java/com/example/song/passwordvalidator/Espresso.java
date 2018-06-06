package com.example.song.passwordvalidator;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.rule.ActivityTestRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
@RunWith(AndroidJUnit4.class)
@LargeTest
public class Espresso {
    @Rule
    public ActivityTestRule<MainActivity> mARule=new ActivityTestRule<>(MainActivity.class);

    @Test
    public void checkValidate0(){
            onView(withId(R.id.editText)).perform(typeText("apple"),closeSoftKeyboard());
            onView(withId(R.id.button)).perform(click());
            onView(withId(R.id.textView)).check(matches(withText("Not Strong")));
    }
   @Test
    public void checkValidate2(){
            onView(withId(R.id.editText)).perform(typeText("password"),closeSoftKeyboard());
            onView(withId(R.id.button)).perform(click());
            onView(withId(R.id.textView)).check(matches(withText("Not Strong")));
    }
    @Test
    public void checkValidate3(){
            onView(withId(R.id.editText)).perform(typeText("computer"),closeSoftKeyboard());
            onView(withId(R.id.button)).perform(click());
            onView(withId(R.id.textView)).check(matches(withText("Not Strong")));
    }
    @Test
    public void checkValidate4(){
            onView(withId(R.id.editText)).perform(typeText("students1"),closeSoftKeyboard());
            onView(withId(R.id.button)).perform(click());
            onView(withId(R.id.textView)).check(matches(withText("Not Strong")));
    }
    @Test
    public void checkValidate5(){
            onView(withId(R.id.editText)).perform(typeText("Students1"),closeSoftKeyboard());
            onView(withId(R.id.button)).perform(click());
            onView(withId(R.id.textView)).check(matches(withText("Valiate")));
    }

}


