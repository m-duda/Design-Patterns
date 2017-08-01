package Chapter03Decorator;

/**
 * Created by Michał on 20.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Drink drink1 = new Espresso();
        System.out.println(drink1.getDescription() + " "+ drink1.cost());

        drink1 = new Chocolate(drink1);
        System.out.println(drink1.getDescription() + " "+ drink1.cost());

        drink1 = new WhispedCream(drink1);
        System.out.println(drink1.getDescription() + " "+ drink1.cost());

    }
}
