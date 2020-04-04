package com.javacourses.homework.logger;

import java.io.IOException;

public interface Logger {
    void log (String message) throws IOException;
    void log( Throwable t) throws IOException;
    void log ( LogType type, String message) throws IOException;
}
