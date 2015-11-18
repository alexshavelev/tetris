package com.shavelev.alexander;

import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by user on 18.11.15.
 */

/**
 * This program send welcome message to user considering local time
 **/

public class Main {
    public static void main(String[] args) {
        WelcomeMessage msg = new WelcomeMessage(new Date().getHours());
        msg.printMessage();
    }
}
