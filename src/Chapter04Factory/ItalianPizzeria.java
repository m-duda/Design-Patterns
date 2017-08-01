package Chapter04Factory;

/**
 * Created by Michał on 22.07.2017.
 */
public class ItalianPizzeria extends Pizzeria {
    @Override
    protected Pizza makePizza(String type) {
        if (type.equals("serowa")){
            return new ItalianChessePizza();
        }
        if (type.equals("wegetarianska")){
            return new ItalianVegetarianPizza();
        }
        if (type.equals("hawajska")){
            return new ItalianHavaiPizza();
        }
        else return null;
    }
}
