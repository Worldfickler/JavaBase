package org.example.day06.composite;

/**
 * @author Fickler
 * @date 2024/4/22 16:05
 */
public class Client {
    public static void main(String[] args) {
        Folder folder = new Folder("总文件夹");
        ImagerFile imagerFile = new ImagerFile("a.jpg");
        TextFile textFile = new TextFile("b.txt");
        Folder folder1 = new Folder("c文件夹");
        folder.add(imagerFile);
        folder.add(textFile);
        folder.add(folder1);

        TextFile textFile1 = new TextFile("c_1.txt");
        ImagerFile imagerFile1 = new ImagerFile("c_2.jpg");
        folder1.add(textFile1);
        folder1.add(imagerFile1);

        folder.display();
        System.out.println("---------------------------");
        folder1.display();
        folder1.remove(textFile1);
        System.out.println("---------------------------");
        folder1.display();
    }
}
