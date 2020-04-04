package com.javacourses.homework.logger;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

class BaseLogger extends AbstractLogger {

    public BaseLogger(OutputStream[] out) {
        super();
    }

    @Override
    protected void writeLog(String message) {
        File logFile = new File("logFile");
        byte[] bytes;
        bytes = message.getBytes();
        try(FileOutputStream outputStream = new FileOutputStream(logFile)){
            outputStream.write(bytes);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    private String dataCreation(){
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        return date;
    }
    @Override
    protected String constructLogMessage(String message) {
        message = dataCreation() + " " + LogType.INFO + ": " + message;
        return message;
    }

    @Override
    protected String constructLogMessage(Throwable t) {
        String message = dataCreation() + " " + LogType.ERROR + ": " + t;
        return message;
    }

    @Override
    protected String constructLogMessage(LogType type, String message) {

        message = dataCreation() + " " + type + ": " + message;
        return message;
    }
}
