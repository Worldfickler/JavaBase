package org.example.day08.chainofresponsibilitypattern;

/**
 * @author Fickler
 * @date 2024/4/24 13:27
 */
public class ErrorLogger extends AbstractLogger{

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("ErrorLogger = " + message);
    }
}
