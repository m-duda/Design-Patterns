package Chapter01Strategy.kaczki;

/**
 * Created by Michał on 18.07.2017.
 */
public class SymulatorKaczki {
    public static void main(String[] args) {
        Kaczka dzikaKaczka = new DzikaKaczka();

        dzikaKaczka.wyswietl();
        dzikaKaczka.wykonajKwacz();
        dzikaKaczka.wykonajLec();
    }
}
