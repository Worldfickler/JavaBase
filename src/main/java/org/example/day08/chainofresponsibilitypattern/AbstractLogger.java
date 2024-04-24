package org.example.day08.chainofresponsibilitypattern;

/**
 * @author Fickler
 * @date 2024/4/24 11:56
 */
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;
    protected int level;
    protected AbstractLogger abstractLogger;

    public void setAbstractLogger(AbstractLogger abstractLogger) {
        this.abstractLogger = abstractLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (abstractLogger != null) {
            abstractLogger.logMessage(level, message);
        }
    }

    abstract protected void write(String message);
}
