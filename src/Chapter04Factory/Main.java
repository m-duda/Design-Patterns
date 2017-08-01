package Chapter04Factory;

/**
 * Created by Michał on 22.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Pizzeria italianPizzeria = new ItalianPizzeria();
        Pizzeria americanPizzeria = new AmericanPizzeria();

        Pizza pizza1 = italianPizzeria.orderPizza("serowa");
        Pizza pizza2 = italianPizzeria.orderPizza("hawajska");

        Pizza pizza3 = americanPizzeria.orderPizza("serowa");
    }
}
