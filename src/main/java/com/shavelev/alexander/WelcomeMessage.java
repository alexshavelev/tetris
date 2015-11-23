package com.shavelev.alexander;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Logger;

/**
 * Created by user on 18.11.15.
 */
public class WelcomeMessage {
//    private static final Logger LOG = Logger.getLogger(String.valueOf(WelcomeMessage.class));
//    private static final String MESSAGES_FILE = "messages";
//    private static final String MORNING = "morning";
//    private static final String DAY = "day";
//    private static final String EVENING = "evening";
//    private static final String NIGHT = "night";
//    private static final String ERROR_MESSAGE = "invalid time";
//    int currentLocalHours;
//
//    public WelcomeMessage(int currentLocalHours) {
//        this.currentLocalHours = currentLocalHours;
//    }
//
//    @Override
//    void printMessage() {
//        System.out.println(getWelcomeMessage(this));
//    }
//
//    @Override
//    int getLocalHours() {
//        return this.currentLocalHours;
//    }
//
//    public static String getWelcomeMessage(Message message) {
//        int hoursCount = message.getLocalHours();
//        if ((hoursCount >= 6) && (hoursCount < 9)) {
//           return ResourceBundle.getBundle(MESSAGES_FILE, Locale.getDefault()).getString(MORNING);
//        } else if ((hoursCount >= 9) && (hoursCount < 19)) {
//           return ResourceBundle.getBundle(MESSAGES_FILE, Locale.getDefault()).getString(DAY);
//        } else if ((hoursCount >= 19) && (hoursCount < 23)) {
//            return ResourceBundle.getBundle(MESSAGES_FILE, Locale.getDefault()).getString(EVENING);
//        } else if ((hoursCount == 23) || ((hoursCount < 6) && (hoursCount >= 0))) {
//            return ResourceBundle.getBundle(MESSAGES_FILE, Locale.getDefault()).getString(NIGHT);
//        } else {
//            // we user warning (not error) cause its user error, not system fail
//            LOG.warning("invalid time " + hoursCount + ", app wont crash");
//            return ERROR_MESSAGE;}
//    }
}
