public class MealBuilder {
    private Meal meal;

    public MealBuilder() {
        this.meal = new Meal();
    }

    public MealBuilder addCost(double cost) {
        this.meal.setCost(cost);
        return this;
    }

    public MealBuilder addTakeOut(boolean takeOut) {
        this.meal.setTakeOut(takeOut);
        return this;
    }

    public MealBuilder addMainCourse(String mainCourse) {
        this.meal.setMainCourse(mainCourse);
        return this;
    }

    public MealBuilder addDrink(String drink) {
        this.meal.setDrink(drink);
        return this;
    }

    public Meal build() {
        return this.meal;
    }
}
