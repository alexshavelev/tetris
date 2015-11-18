package com.shavelev.alexander;

/**
 * Created by user on 18.11.15.
 */
public abstract class Message {
    int currentLocalHours;

    abstract void printMessage();
    abstract int getLocalHours();
}
