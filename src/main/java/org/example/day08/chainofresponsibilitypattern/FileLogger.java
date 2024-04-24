package org.example.day08.chainofresponsibilitypattern;

/**
 * @author Fickler
 * @date 2024/4/24 13:28
 */
public class FileLogger extends AbstractLogger{
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("FileLogger = " + message);
    }
}
