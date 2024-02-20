package Base.Decorator.Decorators;

import Base.Beverage;
import Base.Decorator.BeverageDecorator;

public class EspressoDecorator extends BeverageDecorator {

    public EspressoDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double getCost(){
        return 0.5 + super.getCost();
    }

    @Override
    public String description() {
        return super.description() + ", Espresso";
    }
}
