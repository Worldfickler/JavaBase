package org.example.day04;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author Fickler
 * @date 2024/4/18 11:15
 */
public class TestCallableAndFuture {
    public static void main(String[] args) throws Exception {
        Callable01 callable01 = new Callable01();
        FutureTask<Integer> integerFutureTask = new FutureTask<>(callable01);
        new Thread(integerFutureTask).start();
        // Callable 产生结果    Future 拿到结果
        Integer integer = integerFutureTask.get();
        System.out.println("返回值：" + integer);
    }
}

class Callable01 implements Callable<Integer> {
    Random random = new Random();
    @Override
    public Integer call() throws Exception {
        int x = random.nextInt(10);
        int y = random.nextInt(10);
        int sum = x + y;
        System.out.println("子进程在计算：" + x + " + " + y + " = " + sum);
        return sum;
    }
}