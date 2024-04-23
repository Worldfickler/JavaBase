package org.example.day06.prototype;

/**
 * @author Fickler
 * @date 2024/4/22 14:08
 */
public class Test {
    public static void main(String[] args) {
        ShallowClone shallowClone = new ShallowClone();
        ShallowClone clone = (ShallowClone) shallowClone.clone();
        clone.show();
        System.out.println(clone.list == shallowClone.list);
        DeepClone deepClone = new DeepClone();
        DeepClone clone1 = (DeepClone) deepClone.clone();
        clone1.show();
        System.out.println(clone1.list == deepClone.list);
    }
}
