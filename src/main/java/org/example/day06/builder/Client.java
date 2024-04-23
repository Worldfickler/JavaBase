package org.example.day06.builder;

/**
 * @author Fickler
 * @date 2024/4/22 14:34
 */
public class Client {
    public static void main(String[] args) {
        KFCWaiter kfcWaiter = new KFCWaiter();
        MealA mealA = new MealA();
        kfcWaiter.setMealBuilder(mealA);
        Meal construct = kfcWaiter.construct();
        System.out.println("mealA = " + construct.getFood() + " " + construct.getDrink());
    }
}
