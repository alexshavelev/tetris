package com.shavelev.alexander;

/**
 * Created by user on 23.11.15.
 */
public interface Message {
    /**
     * @return welcome message to user depends on time and lang
     */
    String getWelcomeMessage();

    /**
     * print welcome message to user in console
     */
    void printMessage();
}
