package Base.Decorator;

import Base.Beverage;

public abstract class BeverageDecorator extends Beverage {

    protected Beverage beverage;

    public BeverageDecorator(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double getCost(){
        return beverage.getCost();
    }

    @Override
    public String description(){
        return beverage.description();
    }
}
