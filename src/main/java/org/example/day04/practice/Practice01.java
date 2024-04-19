package org.example.day04.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Fickler
 * @date 2024/4/18 13:58
 */
public class Practice01 {
    public final static int MAX_NUM = 500000;

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        AtomicLong atomicLong = new AtomicLong(1);
        atomicLong.addAndGet(10); // CAS compare and swap

        // clickhouse
        ConcurrentSkipListMap<Object, Object> objectObjectConcurrentSkipListMap = new ConcurrentSkipListMap<>();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();

        /*
        int i = 0;
        int sum = 0;
        while (i <= MAX_NUM) {
            sum += i;
            i ++ ;
            System.out.println(sum);
//            if (sum <= 0) System.out.println("2222222");
        }
        System.out.println("sum:" + sum);
         */
        ExecutorService executorService = new ThreadPoolExecutor(2, 2, 0, TimeUnit.SECONDS, new LinkedBlockingQueue<>(), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        List<Future<Long>> futureList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            Num num = new Num(i);
            Future<Long> future = executorService.submit(num);
            futureList.add(future);
        }
        long sums = 0;
        for (Future<Long> future : futureList) {
            Long aLong = future.get();
            sums += aLong;
        }
        System.out.println("sum = " + sums);
        executorService.shutdown();
    }

    public static class Num implements Callable<Long> {
        private int x;

        public Num(int x) {
            this.x = x;
        }

        @Override
        public Long call() {
            long sums = 0;
            for (int i = 1; i <= MAX_NUM; i++) {
                if (i % 2 == x) {
                    sums += i;
//                    System.out.println(x + " " + i);
                }
            }
            System.out.println(Thread.currentThread().getName() + " " + sums);
            return sums;
        }
    }
}