package com.test.steps;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class NotificationSteps extends AbstractSteps {
    public void getIncomingMessageNotificationScreen() {
        notificationScreen.clickOnIncomingMessageLable();
    }
}
