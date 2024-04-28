package org.example.day09.practice;

import com.google.gson.Gson;

/**
 * @author Fickler
 * @date 2024/4/25 13:27
 */
public class JsonPrintControl<T> implements Control<T>{
    Gson gson = new Gson();

    @Override
    public void printControl(T t, String type) throws NoSuchFieldException, IllegalAccessException {
        String s = gson.toJson(t);
        System.out.println("JSON 格式 = " + s);
    }
}
