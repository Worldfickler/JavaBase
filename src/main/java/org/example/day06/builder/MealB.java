package org.example.day06.builder;

/**
 * @author Fickler
 * @date 2024/4/22 14:28
 */
public class MealB extends MealBuilder{
    @Override
    public void buildFood() {
        meal.setFood("三个鸡翅");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("一杯柠檬水");
    }
}
