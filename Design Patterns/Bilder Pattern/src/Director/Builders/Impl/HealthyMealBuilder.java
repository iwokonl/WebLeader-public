package Director.Builders.Impl;

import Director.Builders.Builder;
import Director.Builders.Meal;
import Food.Dessert;
import Food.Drink;
import Food.MainCourse;
import Food.Starter;

public class HealthyMealBuilder implements Builder {

    private Meal meal;

    public HealthyMealBuilder(){
        this.meal = new Meal();
    }

    @Override
    public void addStarter() {
        meal.setStarter(Starter.SALAD);
    }

    @Override
    public void addMainCourse() {
        meal.setMainCourse(MainCourse.GRILLED_CHICKEN);
    }

    @Override
    public void addDesert() {
        meal.setDessert(Dessert.FRUIT_SALAD);
    }

    @Override
    public void addDrink() {
        meal.setDrink(Drink.WATER);
    }

    public Meal build(){
        return this.meal;
    }
}
