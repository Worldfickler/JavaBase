package org.example.day06.builder;

/**
 * @author Fickler
 * @date 2024/4/22 14:26
 */
public abstract class MealBuilder {
    Meal meal = new Meal();
    public abstract void buildFood();
    public abstract void buildDrink();
    public Meal getMeal() {
        return meal;
    }
}
