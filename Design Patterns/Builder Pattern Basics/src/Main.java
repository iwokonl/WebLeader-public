public class Main {
    public static void main(String[] args){
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder
                    .addCost(15.99)
                    .addTakeOut(true)
                    .addMainCourse("Burger")
                    .addDrink("Coke")
                    .build();
        System.out.println(meal.getCost()); //15.99
        System.out.println(meal.isTakeOut()); //true
        System.out.println(meal.getMainCourse()); //Burger
        System.out.println(meal.getDrink()); //Coke
    }
}
