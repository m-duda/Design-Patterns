package Chapter04Factory;

/**
 * Created by Michał on 22.07.2017.
 */
public class AmericanPizzeria extends Pizzeria {
    @Override
    protected Pizza makePizza(String type) {
        if (type.equals("serowa")){
            return new AmericanChessePizza();
        }
        if (type.equals("wegetarianska")){
            return new AmericanVegetarianPizza();
        }
        if (type.equals("hawajska")){
            return new AmericanHavaiPizza();
        }
        else return null;
    }
}
