package org.example.day04.communication;

/**
 * @author Fickler
 * @date 2024/4/18 16:45
 */
public class TestVolatile {

    public static volatile int flag = 0;

    public static void main(String[] args) {
        SellTicket01 sellTicket01 = new SellTicket01();
        SellTicket02 sellTicket02 = new SellTicket02();

        new Thread(sellTicket02).start();
        new Thread(sellTicket01).start();
    }

    public static class SellTicket01 implements Runnable {
        private int ticketNum = 100;
        @Override
        public void run() {
            while (true) {
                if (flag <= 50) {
                    if (ticketNum <= 0) {
                        System.out.println("售票结束");
                        break;
                    }
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("窗口 " + Thread.currentThread().getName() + " 售出一张票，还剩 " + (--ticketNum) + " 张票 " + "flag = " + (++ flag));
                }
            }
        }
    }

    public static class SellTicket02 implements Runnable {
        private int ticketNum = 100;

        @Override
        public void run() {
            while (true) {
                if (flag >= 30) {
                    if (ticketNum <= 0) {
                        System.out.println("售票结束");
                        break;
                    }
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("窗口 " + Thread.currentThread().getName() + " 售出一张票，还剩 " + (--ticketNum) + " 张票");
                    flag ++ ;
                }
            }
        }
    }

}