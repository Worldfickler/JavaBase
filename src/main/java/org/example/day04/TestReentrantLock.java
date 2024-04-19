package org.example.day04;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Fickler
 * @date 2024/4/18 16:25
 */
public class TestReentrantLock {

    public static void main(String[] args) {

    }

}

class SellTicket05 implements Runnable {
    private int ticketNum = 100;

    private final ReentrantLock reentrantLock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            reentrantLock.lock();
            try {
                if (ticketNum <= 0) {
                    System.out.println("售票结束");
                    break;
                }
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                reentrantLock.unlock();
            }
            System.out.println("窗口 " + Thread.currentThread().getName() + " 售出一张票，还剩 " + (--ticketNum) + " 张票");
        }
    }
}
