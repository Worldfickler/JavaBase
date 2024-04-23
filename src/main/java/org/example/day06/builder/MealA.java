package org.example.day06.builder;

/**
 * @author Fickler
 * @date 2024/4/22 14:28
 */
public class MealA extends MealBuilder{
    @Override
    public void buildFood() {
        meal.setFood("一盒薯条");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("一杯可乐");
    }
}
