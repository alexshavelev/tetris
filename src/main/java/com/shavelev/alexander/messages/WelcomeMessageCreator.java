package com.shavelev.alexander.messages;

import com.shavelev.alexander.messages.DayWelcomeMessage;
import com.shavelev.alexander.messages.EveningWelcomeMessage;
import com.shavelev.alexander.messages.MorningWelcomeMessage;
import com.shavelev.alexander.messages.NightWelcomeMessage;

import java.util.logging.Logger;

/**
 * Created by user on 23.11.15.
 */
public class WelcomeMessageCreator implements MessageCreator {
    private static final Logger LOG = Logger.getLogger(String.valueOf(WelcomeMessageCreator.class));

    @Override
    public Message getMessage(int hoursCount) {
        if ((hoursCount >= 6) && (hoursCount < 9)) {
            return new MorningWelcomeMessage();
        } else if ((hoursCount >= 9) && (hoursCount < 19)) {
            return new DayWelcomeMessage();
        } else if ((hoursCount >= 19) && (hoursCount < 23)) {
            return new EveningWelcomeMessage();
        } else if ((hoursCount == 23) || ((hoursCount < 6) && (hoursCount >= 0))) {
            return new NightWelcomeMessage();
        } else {
            // we user warning (not error) cause its user error, not system fail
            LOG.warning("invalid time " + hoursCount + ", app wont crash");
            return null;}
    }
}
