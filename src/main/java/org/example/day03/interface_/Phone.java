package org.example.day03.interface_;

/**
 * @author Fickler
 * @date 2024/4/17 9:21
 */
public class Phone implements UsbInterface{
    @Override
    public void start() {
        System.out.println("手机开始");
    }

    @Override
    public void stop() {
        System.out.println("手机结束");
    }
}
