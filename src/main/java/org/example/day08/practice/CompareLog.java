package org.example.day08.practice;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Fickler
 * @date 2024/4/24 14:23
 */
public class CompareLog implements Log {
    FileWriter fileWriter = null;

    @Override
    public void log1(Student student) {
        try {
            fileWriter = new FileWriter("comparelog.txt", true);
            fileWriter.write("");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void log2(Student student) {
        try {
            fileWriter = new FileWriter("comparelog.txt", true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void log3(Student student) {
        try {
            fileWriter = new FileWriter("comparelog.txt", true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
