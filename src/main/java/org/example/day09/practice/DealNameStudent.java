package org.example.day09.practice;

/**
 * @author Fickler
 * @date 2024/4/25 14:36
 */
public class DealNameStudent implements Deal{

    @Override
    public void dealStudent(Student student) {
        System.out.println(student.getClass().getName() + "Name 处理逻辑");
        StringBuilder stringBuilder = new StringBuilder(student.getDealMessage());
        stringBuilder.append("Name 处理完成");
        student.setDealMessage(String.valueOf(stringBuilder));
    }
}
