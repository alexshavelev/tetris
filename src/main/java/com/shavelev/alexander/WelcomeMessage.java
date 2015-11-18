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
        int c = message.getLocalHours();
        if ((c >= 6) && (c < 9)) {
           return ResourceBundle.getBundle("messages", Locale.getDefault()).getString("morning");
        }
        else if ((c >= 9) && (c < 19)) {
           return ResourceBundle.getBundle("messages", Locale.getDefault()).getString("day");
        }
        else if ((c >= 19) && (c < 23)) {
            return ResourceBundle.getBundle("messages", Locale.getDefault()).getString("evening");
        }
        else if ((c >= 23) && (c < 6)) {
            return ResourceBundle.getBundle("messages", Locale.getDefault()).getString("night");
        }
        else { return "invalid time";}
    }
}
