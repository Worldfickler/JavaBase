package org.example.day08.chainofresponsibilitypattern;

/**
 * @author Fickler
 * @date 2024/4/24 11:59
 */
public class ConsoleLogger extends AbstractLogger{
    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("ConsoleLogger = " + message);
    }
}
