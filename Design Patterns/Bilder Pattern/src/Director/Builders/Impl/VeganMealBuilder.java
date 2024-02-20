package Director.Builders.Impl;

import Director.Builders.Builder;
import Director.Builders.Meal;
import Food.Dessert;
import Food.Drink;
import Food.MainCourse;
import Food.Starter;

public class VeganMealBuilder implements Builder {

    private Meal meal;

    public VeganMealBuilder(){
        this.meal = new Meal();
    }

    @Override
    public void addStarter() {
        meal.setStarter(Starter.SALAD);
    }

    @Override
    public void addMainCourse() {
        meal.setMainCourse(MainCourse.VEGGIE_STIR_FRY);
    }

    @Override
    public void addDesert() {
        meal.setDessert(Dessert.VEGAN_PUDDING);
    }

    @Override
    public void addDrink() {
        meal.setDrink(Drink.VEGAN_SHAKE);
    }

    public Meal build(){
        return this.meal;
    }
}
