package org.example.day06.composite;

/**
 * @author Fickler
 * @date 2024/4/22 15:55
 */
public abstract class File {
    String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void display();
}
