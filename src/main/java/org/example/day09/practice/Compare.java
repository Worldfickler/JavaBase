package org.example.day09.practice;

import java.lang.reflect.Field;

/**
 * @author Fickler
 * @date 2024/4/24 14:16
 */
public class Compare {
    // todo 注释、传不同的类、方法重载
    public void compare(Student studentA, Student studentB, String type, Control control, Log log, Deal deal) throws InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<? extends Student> aClass = studentA.getClass();
        Class<? extends Student> bClass = studentB.getClass();
        Field aField = aClass.getField(type);
        Field bField = bClass.getField(type);
        Object a = aField.get(studentA);
        Object b = bField.get(studentB);
        if (a.equals(b)) {
            System.out.println("相同");
        } else {
            System.out.println("不同");
            if (deal != null) {
                deal = new DealStudent();
                deal.dealStudent(studentA, type);
                deal.dealStudent(studentB, type);
            }
        }
        if (control == null) {
            control = new DefaultPrintControl();
        }
        if (log == null) {
            log = new DefaultPrintLog();
        }
        control.printControl(studentA, type);
        log.printLog(studentA, type);

//        if (!studentA.getName().equals(studentB.getName())) {
//            if (deal != null) {
//                deal = new DealAgeStudent();
//                deal.dealStudent(studentA);
//                deal.dealStudent(studentB);
//            }
//            if (control == null) {
//                control = new DefaultPrintControl();
//            }
//            if (log == null) {
//                log = new DefaultPrintLog();
//            }
//            control.printControl(studentA);
//            log.printLog(studentA);
//        }
//        if (studentA.getAge() != studentB.getAge()) {
//
//        }
    }
}
