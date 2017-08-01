package Chapter03Decorator;

/**
 * Created by Michał on 20.07.2017.
 */
public class Espresso extends Drink {
    public Espresso() {
        description="Kawa Espresso ";
    }

    @Override
    public double cost() {
        return 2;
    }
}
