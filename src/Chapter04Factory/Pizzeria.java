package Chapter04Factory;

/**
 * Created by Michał on 22.07.2017.
 */
public abstract class Pizzeria {
    public Pizza orderPizza (String type){
        Pizza pizza;
        pizza = makePizza (type);

        pizza.preparation();
        pizza.baking();
        pizza.cutting();
        pizza.packing();

        return pizza;

    }
    protected abstract Pizza makePizza(String type);
}
