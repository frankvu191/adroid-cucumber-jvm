package com.test.steps;

import io.appium.java_client.MobileBy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("cucumber-glue")
public class ActivityScreenSteps extends AbstractSteps {
    public void getSecureSurfaceScreen() {
        activityScreen.clickOnSecureSurfaceLable();
    }

    public boolean checkForSecureSurfaceScreen() {
        return activityScreen.isElementPresent(MobileBy.AccessibilityId("Secure Surfaces"));
    }
}
