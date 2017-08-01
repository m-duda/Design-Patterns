package Chapter01Strategy.kaczki;

/**
 * Created by Michał on 18.07.2017.
 */
public class NieLatam  implements LatanieInterface {
    @Override
    public void lec() {
        System.out.println("Nie potrafię latać");
    }
}
