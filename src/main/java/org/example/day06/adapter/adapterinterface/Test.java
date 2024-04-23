package org.example.day06.adapter.adapterinterface;

/**
 * @author Fickler
 * @date 2024/4/22 15:07
 */
public class Test {
    public static void main(String[] args) {
        SourceSub1 sourceSub1 = new SourceSub1();
        SourceSub2 sourceSub2 = new SourceSub2();
        sourceSub1.method1();
        sourceSub1.method2();
        sourceSub2.method1();
        sourceSub2.method2();
    }
}
