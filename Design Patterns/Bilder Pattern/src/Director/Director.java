package Director;

import Director.Builders.Impl.HealthyMealBuilder;
import Director.Builders.Impl.VeganMealBuilder;

public class Director {

    public void constructVeganMeal(VeganMealBuilder builder){
        builder.addStarter();
        builder.addMainCourse();
        builder.addDesert();
        builder.addDrink();
    }

    public void constructHealthyMeal(HealthyMealBuilder builder){
        builder.addStarter();
        builder.addMainCourse();
        builder.addDesert();
        builder.addDrink();
    }

}
