package com.javacourses.homework.logger;

import java.io.*;

abstract class AbstractLogger implements Logger {

    protected abstract void writeLog(String message);
    protected abstract String constructLogMessage(String message);
    protected abstract String constructLogMessage(Throwable t);
    protected abstract String constructLogMessage(LogType type, String message);
    @Override
    public void log(String message) throws IOException {
        String newMessage = constructLogMessage(message);
        writeLog(newMessage);
    }

    @Override
    public void log(Throwable t) throws IOException {
        String newMessage = constructLogMessage(t);
        writeLog(newMessage);
    }

    @Override
    public void log(LogType type, String message) throws IOException {
        String newMessage = constructLogMessage(type, message);
        writeLog(newMessage);
    }
}
