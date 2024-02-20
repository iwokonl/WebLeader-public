package Base.BaseType;

import Base.Beverage;

public class LightRoast extends Beverage {

    @Override
    public double getCost() {
        return 3.45;
    }

    @Override
    public String description() {
        return "Light Roast";
    }
}
