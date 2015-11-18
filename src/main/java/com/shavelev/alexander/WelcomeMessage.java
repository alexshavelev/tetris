package com.shavelev.alexander;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by user on 18.11.15.
 */
public class WelcomeMessage extends Message {
    int currentLocalHours;

    public WelcomeMessage(int currentLocalHours) {
        this.currentLocalHours = currentLocalHours;
    }

    @Override
    void printMessage() {
        System.out.println(getWelcomeMessage(this));
    }



    @Override
    int getLocalHours() {
        return this.currentLocalHours;
    }

    public static String getWelcomeMessage(Message message) {
        int hoursCount = message.getLocalHours();
        if ((hoursCount >= 6) && (hoursCount < 9)) {
           return ResourceBundle.getBundle("messages", Locale.getDefault()).getString("morning");
        }
        else if ((hoursCount >= 9) && (hoursCount < 19)) {
           return ResourceBundle.getBundle("messages", Locale.getDefault()).getString("day");
        }
        else if ((hoursCount >= 19) && (hoursCount < 23)) {
            return ResourceBundle.getBundle("messages", Locale.getDefault()).getString("evening");
        }
        else if ((hoursCount >= 23) && (hoursCount < 6)) {
            return ResourceBundle.getBundle("messages", Locale.getDefault()).getString("night");
        }
        else { return "invalid time";}
    }
}
