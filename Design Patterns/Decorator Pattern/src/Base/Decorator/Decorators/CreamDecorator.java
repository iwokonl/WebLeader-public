package Base.Decorator.Decorators;

import Base.Beverage;
import Base.Decorator.BeverageDecorator;

public class CreamDecorator extends BeverageDecorator {

    public CreamDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double getCost(){
        return 0.3 + super.getCost();
    }

    @Override
    public String description() {
        return super.description() + ", Cream";
    }
}