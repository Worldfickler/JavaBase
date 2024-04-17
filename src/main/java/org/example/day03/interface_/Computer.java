package org.example.day03.interface_;

/**
 * @author Fickler
 * @date 2024/4/17 9:34
 */
public class Computer {

    public void work(UsbInterface usbInterface) {
        usbInterface.start();
        usbInterface.stop();
    }

}
