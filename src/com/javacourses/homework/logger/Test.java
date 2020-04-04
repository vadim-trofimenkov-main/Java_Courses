package com.javacourses.homework.logger;
import java.io.IOException;
import java.io.OutputStream;

public class Test {
    public static void main(String[] args) {
        OutputStream[] out = new OutputStream[5];
        BaseLogger logger = new BaseLogger(out);
        String message = " This is the first log message ever";
       try {
           logger.log(LogType.INFO, message );
       }catch (IOException e){
           e.printStackTrace();
       }
    }
}
