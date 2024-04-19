package org.example.day04;

/**
 * Runnable 创建线程
 * @author Fickler
 * @date 2024/4/18 9:18
 */
public class TestRunnable {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        // 底层使用了代理模式
        Thread thread = new Thread(tiger);
        thread.start();

//        Test1 test1 = new Test1();
//        Test2 test2 = new Test2();
//        Thread thread1 = new Thread(test1);

    }
}

class Tiger implements Runnable {
    int times = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println("我是老虎 " + (++times) + " 线程名 = " + java.lang.Thread.currentThread().getName());
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

//class Test1 implements Runnable {
//    int times = 0;
//    @Override
//    public void run(Runnable test) {
//        Thread thread = new Thread(test);
//        while (true) {
//            System.out.println("我是Test1 " + (++times) + " 线程名 = " + java.lang.Thread.currentThread().getName());
//            try {
//                java.lang.Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            if (times == 80) {
//                break;
//            }
//        }
//    }
//}
//
//class Test2 implements Runnable {
//    int times = 0;
//    @Override
//    public void run() {
//        while (true) {
//            System.out.println("我是Test2 " + (++times) + " 线程名 = " + java.lang.Thread.currentThread().getName());
//            try {
//                java.lang.Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            if (times == 80) {
//                break;
//            }
//        }
//    }
//}