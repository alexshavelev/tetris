package com.shavelev.alexander.creator;
import com.shavelev.alexander.messages.Message;

/**
 * Created by user on 23.11.15.
 */
public interface MessageCreator {
    /**
     *
     * @param currentHours
     * @return new object depends on input hours
     */
    Message getMessage(int currentHours);
}
