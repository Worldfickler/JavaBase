package org.example.day06.iterator;

/**
 * @author Fickler
 * @date 2024/4/22 16:51
 */
public interface TelevisionMenu {

    public void addItem(int channel, String name, String description);

    public Iterator createIterator();

}
