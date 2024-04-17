package org.example.day03.interface_;

/**
 * @author Fickler
 * @date 2024/4/17 10:18
 */
public class InterfacePoly {

    public static void main(String[] args) {

        // 接口类型的数组
        Usb[] usbs = new Usb[2];
        usbs[0] = new Phone_();
        usbs[1] = new Camera_();
        for (Usb usb : usbs) {
            usb.work();
            if (usb instanceof Phone_) {
                ((Phone_) usb).call();
            }
        }

    }

}

interface Usb {
    void work();
}

class Phone_ implements Usb {

    public void call() {
        System.out.println("手机可以打电话");
    }

    @Override
    public void work() {
        System.out.println("手机工作ing");
    }
}

class Camera_ implements Usb {

    @Override
    public void work() {
        System.out.println("相机工作ing");
    }
}
