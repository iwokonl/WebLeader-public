package Base.BaseType;

import Base.Beverage;

public class DarkRoast extends Beverage {

    @Override
    public double getCost() {
        return 3.45;
    }

    @Override
    public String description() {
        return "Dark Roast";
    }
}
