import Director.Builders.Impl.HealthyMealBuilder;
import Director.Builders.Impl.VeganMealBuilder;
import Director.Builders.Meal;
import Director.Director;

public class Main {
    public static void main(String[] args){
        Director director = new Director();

        HealthyMealBuilder healthyMealBuilder = new HealthyMealBuilder();
        director.constructHealthyMeal(healthyMealBuilder);
        Meal healthyMeal = healthyMealBuilder.build();

        System.out.println("Healthy Meal:");
        System.out.println("Starter: " + healthyMeal.getStarter());
        System.out.println("Main Course: " + healthyMeal.getMainCourse());
        System.out.println("Dessert: " + healthyMeal.getDessert());
        System.out.println("Drink: " + healthyMeal.getDrink());
        System.out.println();

        VeganMealBuilder veganMealBuilder = new VeganMealBuilder();
        director.constructVeganMeal(veganMealBuilder);
        Meal veganMeal = veganMealBuilder.build();

        System.out.println("Vegan Meal:");
        System.out.println("Starter: " + veganMeal.getStarter());
        System.out.println("Main Course: " + veganMeal.getMainCourse());
        System.out.println("Dessert: " + veganMeal.getDessert());
        System.out.println("Drink: " + veganMeal.getDrink());
        System.out.println();
    }
}
