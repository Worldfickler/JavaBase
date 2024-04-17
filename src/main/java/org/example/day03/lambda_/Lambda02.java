package org.example.day03.lambda_;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author Fickler
 * @date 2024/4/17 13:14
 */
public class Lambda02 {

    final static int i = 0;

    public Lambda02(){

    }

    public static void main(String[] args) {
        new Lambda02();
        new Lambda02();
        new Lambda02();
        new Lambda02();
        System.out.println(Lambda02.i);
    }

    public static void main2(String[] args) {

        System.out.println("Supplier：");
        String s1 = testSupplier(() -> "s1");
        String s2 = testSupplier(() -> "s2");
        System.out.println(s1 + s2);

        System.out.println("Consumer（accept）：");
        testConsumer1("abcdef", (str) -> {
            System.out.println("操作之前：" + str);
            System.out.println("操作之后：" + str.toUpperCase());
        });

        System.out.println("Consumer（andThen）：");
        testConsumer2("AbCdEf", (str) -> System.out.println(str.toUpperCase()), (str) -> System.out.println(str.toLowerCase()));

        System.out.println("Predicate：");
        boolean result = testPredicate("qqqqqqqq", (str) -> str.length() > 5);
        System.out.println(result);

        System.out.println("Function：");
        Integer integer = testFunction("30", num -> Integer.parseInt(num));
        System.out.println(integer);


    }

    // 生成一个数据
    public static String testSupplier(Supplier<String> supplier) {
        return supplier.get();
    }

    // 消费一个数据
    public static void testConsumer1(String str, Consumer<String> consumer) {
        consumer.accept(str);
    }

    // 先执行外面的再执行里面的
    public static void testConsumer2(String str, Consumer<String> consumer1, Consumer<String> consumer2) {
        consumer1.andThen(consumer2).accept(str);
    }

    // 对数据进行判断，返回 boolean 值
    public static boolean testPredicate(String str, Predicate<String> predicate) {
        return predicate.test(str);
    }

    public static Integer testFunction(String str, Function<String, Integer> function) {
        return function.apply(str) + 10;
    }

}
