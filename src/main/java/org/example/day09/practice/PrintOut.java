package org.example.day09.practice;

/**
 * @author Fickler
 * @date 2024/4/25 17:37
 */
public class PrintOut extends Student{
    Student student;

    public String printOut() {
        Class<? extends Student> studentClass = student.getClass();
        return null;
    }
}
