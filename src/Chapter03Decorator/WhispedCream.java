package Chapter03Decorator;

/**
 * Created by Michał on 20.07.2017.
 */
public class WhispedCream extends DecoratorElements {
    Drink drink;

    public WhispedCream(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription()+" with Whisped Cream ";
    }

    @Override
    public double cost() {
        return drink.cost()+0.1;
    }
}
