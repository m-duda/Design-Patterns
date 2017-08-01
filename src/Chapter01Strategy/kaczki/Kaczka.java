package Chapter01Strategy.kaczki;

/**
 * Created by Michał on 18.07.2017.
 */
public abstract class Kaczka {
    LatanieInterface latanieInterface;
    KwakanieInterface kwakanieInterface;

    public Kaczka() {
    }

    public abstract void wyswietl();

    public void wykonajKwacz(){
        kwakanieInterface.kwacz();
    }

    public void wykonajLec(){
        latanieInterface.lec();
    }

    public void plywaj(){
        System.out.println("Wszytkie kaczki potrafią pływać");
    }
}
