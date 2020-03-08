package JavaCourses.Logger;

import java.io.*;

abstract class AbstractLogger implements Logger {

    abstract void writeLog(String message);
    abstract String constructLogMessage(String message);
    abstract String constructLogMessage(Throwable t);
    abstract String constructLogMessage(LogType type, String message);
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
