package org.example.day08.chainofresponsibilitypattern;

/**
 * @author Fickler
 * @date 2024/4/24 13:29
 */
public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers() {

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setAbstractLogger(fileLogger);
        fileLogger.setAbstractLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger chainOfLoggers = getChainOfLoggers();
        chainOfLoggers.logMessage(AbstractLogger.INFO, "This is an information.");

        chainOfLoggers.logMessage(AbstractLogger.DEBUG, "This is a debug level information.");

        chainOfLoggers.logMessage(AbstractLogger.ERROR, "This is an error information.");
    }
}
