package org.example.day09.practice;

/**
 * @author Fickler
 * @date 2024/4/25 14:46
 */
public class DealStudent implements Deal{
    @Override
    public void dealStudent(Student student, String type) {
        System.out.println("处理 " + student);
        StringBuilder stringBuilder = new StringBuilder(student.getDealMessage());
        stringBuilder.append("Age 处理完成");
        student.setDealMessage(String.valueOf(stringBuilder));
    }
}
