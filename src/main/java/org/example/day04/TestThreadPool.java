package org.example.day04;

import com.sun.corba.se.spi.orbutil.threadpool.ThreadPool;

import java.util.concurrent.*;

/**
 * 线程池的创建
 * @author Fickler
 * @date 2024/4/18 11:06
 */
public class TestThreadPool {

    public static void main(String[] args) {
        // 这些方法最后都会调用 Executors 中的 ThreadPoolExecutor 方法创建线程池
        // 创建一个可缓存的线程池，这个线程池会不断创建线程，线程空闲时会被回收掉
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        // 创建定数量的线程池
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10);
        // 创建单例线程池
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        // 创建一个可执行定时任务的线程池
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(10);

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10, 60, TimeUnit.SECONDS, new LinkedBlockingQueue<>(100), Executors.defaultThreadFactory(), new ThreadPoolExecutor.CallerRunsPolicy());
        for (int i = 0; i < 3; i++) {
            final int index = i;
            threadPoolExecutor.execute(new RunnableTask(index));
        }

    }

}

class RunnableTask implements Runnable {
    private int i;

    public RunnableTask(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " " + i);
    }
}
