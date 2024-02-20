import Base.BaseType.DarkRoast;
import Base.BaseType.LightRoast;
import Base.Beverage;
import Base.Decorator.Decorators.CreamDecorator;
import Base.Decorator.Decorators.EspressoDecorator;
import Base.Decorator.Decorators.FoamDecorator;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new LightRoast();
        System.out.println(beverage.getCost());
        System.out.println(beverage.description());
        System.out.println();

        beverage = new FoamDecorator(beverage);
        System.out.println(beverage.getCost());
        System.out.println(beverage.description());
        System.out.println();

        beverage = new CreamDecorator(beverage);
        System.out.println(beverage.getCost());
        System.out.println(beverage.description());
        System.out.println();

        Beverage beverageShort = new EspressoDecorator(new FoamDecorator(new DarkRoast()));
        System.out.println(beverageShort.getCost());
        System.out.println(beverageShort.description());
    }
}
