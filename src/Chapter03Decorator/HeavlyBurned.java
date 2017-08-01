package Chapter03Decorator;

/**
 * Created by Michał on 20.07.2017.
 */
public class HeavlyBurned extends Drink {
    public HeavlyBurned() {
        description="Coffe Heavly Burned";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
