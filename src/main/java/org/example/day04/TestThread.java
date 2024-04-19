package org.example.day04;

/**
 * Thread 创建线程
 * @author Fickler
 * @date 2024/4/18 8:48
 */
public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat();
        // 真正实现多线程的是 start() 方法【或者说是 start0()，start() 方法中调用了 start0() 方法】，而不是 run() 方法，run() 就仅仅是一个方法而已
        // start0() 是一个本地方法，JVM 调用
        // This method is not invoked for the main method thread or "system" group threads created/set up by the VM.
        cat.start();

        // 开启一个子线程的时候主线程不会阻塞，主线程和子线程交替执行
        System.out.println("主线程 = " + java.lang.Thread.currentThread().getName());
        for (int i = 0; i < 80; i++) {
            System.out.println("主线程 i = " + i);
            java.lang.Thread.sleep(1000);
        }
    }
}

/**
 * TestThread 类实现了 Runnable 接口中的 run
 */
class Cat extends Thread {
    int times = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println("喵喵，我是小猫咪 " + (++times) + " 线程名 = " + java.lang.Thread.currentThread().getName());
            try {
                java.lang.Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (times == 80) {
                break;
            }
        }
    }
}