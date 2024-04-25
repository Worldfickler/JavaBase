package org.example.day09.practice;

import com.google.gson.Gson;

/**
 * @author Fickler
 * @date 2024/4/25 13:27
 */
public class JsonPrintControl implements Control{
    Gson gson = new Gson();
    @Override
    public void printControl(Student student, String type) {
        System.out.println("JSON 格式的控制台输出");
        String s = gson.toJson(student);
        System.out.println(s);
    }
}
