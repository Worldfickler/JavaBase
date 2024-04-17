package org.example.day03.interface_;

/**
 * @author Fickler
 * @date 2024/4/17 9:40
 */
public interface DBInterface {

    // 接口中的属性是 public static final 修饰的
    int connectCount = 0;

    void connect();
    void close();

    default void test() {
    }

}
