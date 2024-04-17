package org.example.day02;


import org.junit.Test;

import java.io.*;

/**
 * Stream 流
 * 泛型
 *
 * @author Fickler
 * @date 2024/4/16 9:35
 */
public class day02_IO {

    @Test
    public void TestFileInputStream1() throws IOException {
        // 从硬盘中读取一个文件 FileInputStream
        File file = new File("hello.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        int read;
        while ((read = fileInputStream.read()) != -1) {
            System.out.println(read);
        }
        fileInputStream.close();
    }

    @Test
    public void TestFileInputStream2() throws IOException {
        // 从硬盘中读取一个文件 FileInputStream
        File file = new File("hello.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bytes = new byte[20];
        int read;
        while ((read = fileInputStream.read(bytes)) != -1) {    // 返回值是读取的长度
            System.out.println(read);
            String s = new String(bytes, 0, read);
            System.out.println(s);
        }
        // 显式的关闭流
        fileInputStream.close();
    }

    @Test
    public void TestFileOutputStream() throws IOException {
        File file = new File("hello.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        // 覆盖之前的数据
        fileOutputStream.write(new String("FileOutputStream").getBytes());
        fileOutputStream.close();
    }

    @Test
    public void TestFileReader1() throws IOException {
        File file = new File("hello.txt");
        FileReader fileReader = new FileReader(file);
        int read;
        while ((read = fileReader.read()) != -1) {
            System.out.println((char) read);
        }
        fileReader.close();
    }

    @Test
    public void TestFileReader2() throws IOException {
        File file = new File("hello.txt");
        FileReader fileReader = new FileReader(file);
        int read;
        char[] chars = new char[8];
        while ((read = fileReader.read(chars)) != -1) {
            System.out.println(new String(chars, 0, read));
        }
        fileReader.close();
    }

    @Test
    public void TestFileWriter() throws IOException {
        File file = new File("hello.txt");
        FileWriter fileWriter = new FileWriter(file);
        char[] chars = {'a', 'b', 'c'};
        // 默认是覆盖写
        fileWriter.write(chars);
        fileWriter.close();
    }

    @Test
    public void TestBufferedReader() throws IOException {
        File file = new File("hello.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        // 关闭只需要关闭 BufferedReader，底层会自动关闭 FileReader
        bufferedReader.close();
    }

    @Test
    public void TestBufferWriter() throws IOException {
        File file = new File("hello.txt");
        // 覆盖写
        FileWriter fileWriter = new FileWriter(file);
        // 追加写
//        new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String line = "hello world";
        bufferedWriter.write(line);
        // 插入一个换行
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    @Test
    public void TestObjectOutputStream() throws IOException {
        File file = new File("data.dat");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeInt(100);
        objectOutputStream.writeBoolean(true);
        objectOutputStream.writeUTF("serializable string");
        objectOutputStream.writeObject(new Dog("1", 2, "3"));
        objectOutputStream.close();
    }

    @Test
    public void TestObjectInputStream() throws IOException, ClassNotFoundException {
        File file = new File("data.dat");
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        // 读取：要注意顺序
        System.out.println(objectInputStream.readInt());
        System.out.println(objectInputStream.readBoolean());
        System.out.println(objectInputStream.readUTF());
        System.out.println(objectInputStream.readObject());
        objectInputStream.close();
    }

    @Test
    public void TestInputStreamReader() throws IOException {
        File file = new File("hello.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "utf-8");
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String s;
        while ((s = bufferedReader.readLine()) != null) {
            System.out.println(s);
        }
        bufferedReader.close();
    }

    @Test
    public void TestOutputStreamWriter() throws IOException {
        File file = new File("hello.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "utf-8");
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        bufferedWriter.write("输入中文");
        bufferedWriter.close();
    }


    public static void main(String[] args) throws IOException {
    }

}

class Dog implements Serializable {
    String name;
    int age;
    String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
}
