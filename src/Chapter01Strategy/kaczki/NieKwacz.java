package Chapter01Strategy.kaczki;

/**
 * Created by Michał on 18.07.2017.
 */
public class NieKwacz implements KwakanieInterface {
    @Override
    public void kwacz() {
        System.out.println("... cisza...");
    }
}
