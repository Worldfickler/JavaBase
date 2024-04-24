package org.example.day08.test;

import org.example.day07.builderpattern.Coke;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Fickler
 * @date 2024/4/24 16:54
 */
public class Test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        HashMap<Integer, Constructor<?>> cache = new HashMap<>();
        cache.put(1, CoffeAdd.class.getConstructor());
        cache.put(2, CoffeeAdd2.class.getConstructor());
        cache.put(3, Milk.class.getConstructor(Coffe.class));
        cache.put(4, Suger.class.getConstructor(Coffe.class));

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        Coffe coffe = null;
        while(i != 0){
            if(coffe == null){
                coffe = (Coffe)Coffe.getMap().get(i).newInstance();
            }else{
                coffe = (Coffe)cache.get(i).newInstance(coffe);
            }
            i = scanner.nextInt();
        }
        System.out.println(coffe.getPrice());
    }
}
