package com.shavelev.alexander.messages;

import com.shavelev.alexander.messages.Message;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by user on 23.11.15.
 */
public class EveningWelcomeMessage extends Message {

    private static final String EVENING = "evening";

    @Override
    public String getRecipient() {
        return EVENING;
    }

    @Override
    public void printMessage() {
        System.out.println(getWelcomeMessage());
    }
}
