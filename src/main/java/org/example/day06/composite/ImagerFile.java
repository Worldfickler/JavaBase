package org.example.day06.composite;

/**
 * @author Fickler
 * @date 2024/4/22 16:01
 */
public class ImagerFile extends File{

    public ImagerFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("这是图像文件，文件名 = " + super.getName());
    }
}
