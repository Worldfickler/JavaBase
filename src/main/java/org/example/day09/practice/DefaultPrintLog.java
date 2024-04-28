package org.example.day09.practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Fickler
 * @date 2024/4/25 13:23
 */
public class DefaultPrintLog<T> implements Log<T> {
    @Override
    public void printLog(T t, String type) throws NoSuchFieldException, IllegalAccessException {
        Class<?> aClass = t.getClass();
        Field declaredField = aClass.getDeclaredField(type);
        Object o = declaredField.get(t);
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = "比较时间 = " + simpleDateFormat.format(date) + " 字段类型 = " + declaredField.getType().getName() + " 字段名称 = " + declaredField.getName() + " 字段内容 = " + o + "\n";
        File file = null;
        FileWriter fileWriter = null;
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
