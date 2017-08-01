package Chapter03Decorator;

/**
 * Created by Michał on 20.07.2017.
 */
public class StarCafeSpecial extends Drink {
    public StarCafeSpecial() {
        description="Coffe Star Cafe Special ";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
