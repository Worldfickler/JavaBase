package org.example.day03.interface_;

/**
 * 继承是满足 is - a 的关系，接口是满足 like - a 的关系
 * @author Fickler
 * @date 2024/4/17 9:45
 */
public class Interface02 {

    public static void main(String[] args) {

        MysqlDB mysqlDB = new MysqlDB();
        OracleDB oracleDB = new OracleDB();
        DB(mysqlDB);
        DB(oracleDB);

        // 接口中属性的方法形式
        int a = TestInterface.a;
        System.out.println(a);

    }

    public static void DB(DBInterface dbInterface) {
        dbInterface.connect();
        dbInterface.close();
    }

}

/**
 * 普通类实现接口必须要实现接口中的所有抽象方法
 */
class NormalClass implements DBInterface {

    @Override
    public void connect() {

    }

    @Override
    public void close() {

    }
}

/**
 * 抽象类实现接口可以不用实现接口中的抽象方法
 */
abstract class AbstractClass implements DBInterface { }

/**
 * 一个类可以实现多个接口
 */
class MoreInterface implements DBInterface, UsbInterface {

    @Override
    public void connect() {

    }

    @Override
    public void close() {

    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
}

/**
 * 接口不能继承别的类，但可以继承多个接口
 */
interface TestInterface extends UsbInterface, DBInterface{
    // 接口中的属性只能是 final，且是 public static final 修饰符
    int a = 1;  // 等价于 public static final int a = 1;

    // 默认方法
    default void test() {
        System.out.println("ssss");
    }

    // 静态方法
    static void test1() {
        System.out.println("ssss");
    }
}

