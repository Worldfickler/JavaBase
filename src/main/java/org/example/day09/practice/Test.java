package org.example.day09.practice;

import java.util.ArrayList;

/**
 * @author Fickler
 * @date 2024/4/24 14:16
 */
public class Test {
    public static void main(String[] args) throws NoSuchFieldException, InstantiationException, IllegalAccessException {

        Student studentA = new Student("AAAA", 10);
        Student studentB = new Student("BBBB", 20);
        JsonPrintControl jsonPrintControl = new JsonPrintControl();
        JsonPrintLog jsonPrintLog = new JsonPrintLog();
        DealAgeStudent dealAgeStudent = new DealAgeStudent();
        DealNameStudent dealNameStudent = new DealNameStudent();
        Compare compare = new Compare();

        compare.compare(studentA, studentB, "name", null, null, null);

//        System.out.println("不传控制台打印策略 --- 不传日志打印策略");
//        compare.compare(studentA, studentB, null, null, null);
//        System.out.println("指定控制台打印策略 --- 不传日志打印策略");
//        compare.compare(studentA, studentB, jsonPrintControl, null, null);
//        System.out.println("不传控制台打印策略 --- 指定日志打印策略");
//        compare.compare(studentA, studentB, null, jsonPrintLog, null);
//        System.out.println("指定控制台打印策略 --- 指定日志打印策略");
//        compare.compare(studentA, studentB, jsonPrintControl, jsonPrintLog, null);

//        System.out.println("指定 Age 的处理cue了");
//        compare.compare(studentA, studentB, jsonPrintControl, null, dealAgeStudent);

//        compare.compare(studentA, studentB, null, jsonPrintLog, dealAgeStudent);
    }
}
