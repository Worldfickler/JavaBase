package org.example.day03.interface_;

/**
 * @author Fickler
 * @date 2024/4/17 9:20
 */
public class Camera implements UsbInterface{
    @Override
    public void start() {
        System.out.println("相机开始");
    }

    @Override
    public void stop() {
        System.out.println("相机结束");
    }
}
