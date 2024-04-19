package org.example.day04;

/**
 * Synchronized 关键字
 * @author Fickler
 * @date 2024/4/18 10:46
 */
public class TestSynchronized {
    public static void main(String[] args) {
        SellTicket03 sellTicket03 = new SellTicket03();
        new Thread(sellTicket03).start();
        new Thread(sellTicket03).start();
        new Thread(sellTicket03).start();

        SellTicket04 sellTicket04 = new SellTicket04();
        new Thread(sellTicket04).start();
        new Thread(sellTicket04).start();
        new Thread(sellTicket04).start();
    }
}

/**
 * 同步方法
 */
class SellTicket03 implements Runnable {
    private int ticketNum = 100;
    private boolean flag = true;

    public synchronized void sell() {
        if (ticketNum <= 0) {
            System.out.println("售票结束");
            flag = false;
            return;
        }
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("窗口 " + Thread.currentThread().getName() + " 售出一张票，还剩 " + (--ticketNum) + " 张票");
    }

    @Override
    public void run() {
        while (flag) {
            sell();
        }
    }
}

/**
 * 同步代码块
 */
class SellTicket04 implements Runnable {
    private int ticketNum = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
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
}