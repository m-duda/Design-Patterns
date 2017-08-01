package Chapter03Decorator;

/**
 * Created by Michał on 20.07.2017.
 */
public abstract class Drink {
    String description = "Unkown drink";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
