package org.example.day09.practice;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author Fickler
 * @date 2024/4/24 14:16
 */
public class Test {
    public static void main(String[] args) throws NoSuchFieldException, InstantiationException, IllegalAccessException {

        Student studentA = new Student("AAAA", 10);
        Student studentB = new Student("BBBB", 20);
        Compare<Student> compare = new Compare<>();
        compare.compare(studentA, studentB, "name", new Compare.ConsoleLogPrintResolveAdapter<Student>() {
            @Override
            public void resolve(Student s, Student student) {
                System.out.println(toJson(s));
                System.out.println(toJson(student));
            }

            }, new Compare.LogFilePrintResolveAdapter<Student>(new File("log.txt")) {
            @Override
            public void resolve(Student s, Student student, BufferedOutputStream bufferedOutputStream) {
                try {
                    bufferedOutputStream.write(s.toString().getBytes(StandardCharsets.UTF_8));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }, (a, b) -> {
            System.out.println(a.getName() + " ---- " + b.getName());
        });
//
    }
}
