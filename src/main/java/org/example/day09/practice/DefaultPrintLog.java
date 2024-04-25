package org.example.day09.practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

/**
 * @author Fickler
 * @date 2024/4/25 13:23
 */
public class DefaultPrintLog implements Log{
    @Override
    public void printLog(Student student, String type) {
        System.out.println("默认格式的日志");
        Date date = new Date();
        File file = null;
        FileWriter fileWriter = null;
        try {
            file = new File("log.txt");
            fileWriter = new FileWriter(file, true);
            fileWriter.write("默认格式\n");
            fileWriter.write("比较时间 = " + date + "\n");
            fileWriter.write(student + "\n");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
