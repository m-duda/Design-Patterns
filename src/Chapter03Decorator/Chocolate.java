package Chapter03Decorator;

/**
 * Created by Michał on 20.07.2017.
 */
public class Chocolate extends DecoratorElements{
    Drink drink;

    public Chocolate(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription()+"z Czekoladą ";
    }

    @Override
    public double cost() {
        return drink.cost()+0.2;
    }
}
