package org.example.day09.practice;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

/**
 * @author Fickler
 * @date 2024/4/25 14:18
 */
public class JsonPrintLog implements Log{

    Gson gson = new Gson();
    @Override
    public void printLog(Student student, String type) {
        System.out.println("JSON 格式的日志输出");
        Date date = new Date();
        File file = null;
        FileWriter fileWriter = null;
        try {
            file = new File("log.txt");
            fileWriter = new FileWriter(file, true);
            fileWriter.write("JSON 格式\n");
            fileWriter.write("比较时间 = " + date + "\n");
            String s = gson.toJson(student);
            fileWriter.write(s + "\n");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
