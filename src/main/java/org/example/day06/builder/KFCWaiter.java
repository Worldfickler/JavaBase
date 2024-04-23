package org.example.day06.builder;

/**
 * @author Fickler
 * @date 2024/4/22 14:33
 */
public class KFCWaiter {

    private MealBuilder mealBuilder;
    public void setMealBuilder(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public Meal construct() {
        mealBuilder.buildFood();
        mealBuilder.buildDrink();
        return mealBuilder.getMeal();
    }

}
