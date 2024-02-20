package Base.Decorator.Decorators;

import Base.Beverage;
import Base.Decorator.BeverageDecorator;

public class FoamDecorator extends BeverageDecorator {

    public FoamDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double getCost(){
        return 0.2 + super.getCost();
    }

    @Override
    public String description() {
        return super.description() + ", Foam";
    }
}