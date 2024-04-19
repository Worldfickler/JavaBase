package org.example.day04.practice;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * @author Fickler
 * @date 2024/4/18 14:58
 */
public class Practice02 {
    public static ArrayList<Integer> arrayList = new ArrayList<>();
//    public static List<Integer> integers = Collections.synchronizedList(arrayList);

    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        ThreadLocal<String> threadLocal2 = new ThreadLocal<>();
        ThreadLocal<String> threadLocal3 = new ThreadLocal<>();
        new Thread(() -> {
            threadLocal.set("123");
            threadLocal2.set("456");
            //xxx
            try {
                Thread.sleep(100L);
                String s = threadLocal.get(); //123
                threadLocal2.get(); //456
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        new Thread(() -> {
            String s = threadLocal.get();
        });


        ExecutorService executorService = new ThreadPoolExecutor(3, 3, 0, TimeUnit.SECONDS, new LinkedBlockingQueue<>(), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        ShowNum showNum = new ShowNum();
        AddNum addNum = new AddNum();
        executorService.execute(showNum);
        for (int i = 0; i < 2; i++) {
            executorService.execute(addNum);
        }
    }

    public static class ShowNum implements Runnable {
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(2000);
                    System.out.println("showNum = " + arrayList);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static class AddNum implements Runnable {

        @Override
        public void run() {
            while (true) {
                synchronized (this) {
                    try {
                        Thread.sleep(1000);
                        if (!arrayList.isEmpty()) {
                            int len = arrayList.size();
                            int lastNum = arrayList.get(len - 1);
                            System.out.println("最后一个元素：" + lastNum);
                            arrayList.add(lastNum + 1);
                        } else {
                            arrayList.add(1);
                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}