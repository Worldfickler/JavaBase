package org.example.day06.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Fickler
 * @date 2024/4/22 15:56
 */
public class Folder extends File {
    private List<File> files;

    public Folder(String name) {
        super(name);
        files = new ArrayList<File>();
    }

    @Override
    public void display() {
        for (File file : files) {
            file.display();
        }
    }

    public void add(File file) {
        files.add(file);
    }

    public void remove(File file) {
        files.remove(file);
    }
}
