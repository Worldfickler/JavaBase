package org.example.day03.interface_;

/**
 * @author Fickler
 * @date 2024/4/17 9:42
 */
public class OracleDB implements DBInterface{
    @Override
    public void connect() {
        System.out.println("Oracle 连接");
    }

    @Override
    public void close() {
        System.out.println("Oracle 关闭");
    }
}
