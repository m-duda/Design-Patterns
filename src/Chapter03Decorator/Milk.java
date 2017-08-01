package Chapter03Decorator;

/**
 * Created by Michał on 20.07.2017.
 */
public class Milk extends DecoratorElements {
    Drink drink;

    public Milk(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription()+" with milk ";
    }

    @Override
    public double cost() {
        return drink.cost()+0.1;
    }
}
