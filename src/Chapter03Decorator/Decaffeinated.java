package Chapter03Decorator;

/**
 * Created by Michał on 20.07.2017.
 */
public class Decaffeinated extends Drink {
    public Decaffeinated() {
        description="Decaffeinated Coffe";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
