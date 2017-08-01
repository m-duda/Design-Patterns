package Chapter03Decorator;

/**
 * Created by Michał on 20.07.2017.
 */
public class SoyaMilk extends DecoratorElements {
    Drink drink;

    public SoyaMilk(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription()+"z mlekiem sojowym ";
    }

    @Override
    public double cost() {
        return drink.cost()+0.15;
    }
}
