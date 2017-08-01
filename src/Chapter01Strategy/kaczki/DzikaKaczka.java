package Chapter01Strategy.kaczki;

/**
 * Created by Michał on 18.07.2017.
 */
public class DzikaKaczka extends Kaczka {

    public DzikaKaczka(){
        kwakanieInterface = new Kwacz();
        latanieInterface = new LatamBoMamSkrzydła();
    }

    @Override
    public void wyswietl() {
        System.out.println("jestem dziką kaczką");
    }
}
