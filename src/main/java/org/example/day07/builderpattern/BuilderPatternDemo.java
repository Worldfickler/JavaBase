package org.example.day07.builderpattern;

/**
 * @author Fickler
 * @date 2024/4/23 15:20
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.prepareVegMeal();
        meal.showItems();
        System.out.println("VegMeal cost = " + meal.getCost());

        Meal meal1 = mealBuilder.prepareNoVegMeal();
        meal1.showItems();
        System.out.println("NoVegMeal cost = " + meal1.getCost());
    }
}
