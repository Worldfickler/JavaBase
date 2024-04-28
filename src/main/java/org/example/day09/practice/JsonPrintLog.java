package org.example.day09.practice;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Fickler
 * @date 2024/4/25 14:18
 */
public class JsonPrintLog<T> implements Log<T>{

    Gson gson = new Gson();

    @Override
    public void printLog(T t, String type) throws NoSuchFieldException, IllegalAccessException {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        File file = null;
        FileWriter fileWriter = null;
        String str = "比较时间 = " + simpleDateFormat.format(date) + " JSON格式 = " + gson.toJson(t);
        try {
            file = new File("log.txt");
            fileWriter = new FileWriter(file, true);
            fileWriter.write(str);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
