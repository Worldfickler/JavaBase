package org.example.day04;

/**
 * 多线程问题：Thread 和 Runnable
 * @author Fickler
 * @date 2024/4/18 9:45
 */
public class TestSellTicket {
    public static void main(String[] args) {
//        SellTicket03 sellTicket01 = new SellTicket01();
//        SellTicket03 sellTicket02 = new SellTicket01();
//        SellTicket03 sellTicket03 = new SellTicket01();
//        sellTicket01.start();
//        sellTicket02.start();
//        sellTicket03.start();

        SellTicket02 sellTicket02 = new SellTicket02();
        new Thread(sellTicket02).start();
        new Thread(sellTicket02).start();
        new Thread(sellTicket02).start();
    }
}

class SellTicket01 extends Thread {
    private static int ticketNum = 100;

    @Override
    public void run() {
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("售票结束");
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("窗口 " + Thread.currentThread().getName() + " 售出一张票，还剩 " + (--ticketNum) + " 张票");
        }
    }
}

class SellTicket02 implements Runnable {
    private int ticketNum = 100;

    @Override
    public void run() {
        while (true) {
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
        }
    }
}