package org.example.day03.interface_;

/**
 * @author Fickler
 * @date 2024/4/17 9:41
 */
public class MysqlDB implements DBInterface{
    @Override
    public void connect() {
        System.out.println("Mysql 连接");
    }

    @Override
    public void close() {
        System.out.println("Mysql 关闭");
    }
}
