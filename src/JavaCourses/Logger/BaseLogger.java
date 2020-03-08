package JavaCourses.Logger;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

class BaseLogger extends AbstractLogger {
    BaseLogger(OutputStream[] out) {
    }

    @Override
    void writeLog(String message) {
        File logFile = new File("logFile");
        byte[] bytes;
        bytes = message.getBytes();
        try(FileOutputStream outputStream = new FileOutputStream(logFile)){
            outputStream.write(bytes);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    String constructLogMessage(String message) {
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        message = date + " " + LogType.INFO + ": " + message;
        return message;
    }

    @Override
    String constructLogMessage(Throwable t) {
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        String message = date + " " + LogType.ERROR + ": " + t;
        return message;
    }

    @Override
    String constructLogMessage(LogType type, String message) {
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        message = date + " " + type + ": " + message;
        return message;
    }
}
