package org.example.day03.interface_;

/**
 * @author Fickler
 * @date 2024/4/17 9:15
 */
public class Interface01 {

    public static void main(String[] args) {

        Camera camera = new Camera();
        Phone phone = new Phone();
        Computer computer = new Computer();
        computer.work(camera);
        computer.work(phone);

    }

}
