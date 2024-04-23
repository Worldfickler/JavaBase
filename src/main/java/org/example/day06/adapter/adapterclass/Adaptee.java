package org.example.day06.adapter.adapterclass;

/**
 * 已存在的、具有特殊功能、但不符合我们既有的标准接口的类
 * @author Fickler
 * @date 2024/4/22 14:47
 */
public class Adaptee {
    public void specificRequest() {
        System.out.println("被适配类具有特殊功能");
    }
}
