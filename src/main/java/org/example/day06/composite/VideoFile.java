package org.example.day06.composite;

/**
 * @author Fickler
 * @date 2024/4/22 16:01
 */
public class VideoFile extends File{
    public VideoFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("这是音频文件，文件名 = " + super.getName());
    }
}
