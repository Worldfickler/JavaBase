package org.example.day08.iteratorpattern;

/**
 * @author Fickler
 * @date 2024/4/24 9:38
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        for (Iterator iterator = nameRepository.getIterator(); iterator.hasNext();) {
            String name = (String) iterator.next();
            System.out.println("name = " + name);
        }
    }
}
