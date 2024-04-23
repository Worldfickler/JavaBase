package org.example.day06.composite;

/**
 * @author Fickler
 * @date 2024/4/22 16:00
 */
public class TextFile extends File {
    public TextFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("这是文本文件，文件名 = " + super.getName());
    }
}
