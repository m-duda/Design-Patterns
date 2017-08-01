package Chapter04Factory;

import java.util.ArrayList;

/**
 * Created by Michał on 22.07.2017.
 */
public abstract class Pizza {
    String name;
    String cake;
    String sauce;
    ArrayList<String> additives = new ArrayList<String>();

    void preparation(){
        System.out.println("Przygotowanie: "+getName());
        System.out.println("Wyrabianie ciasta...");
        System.out.println("Dodawanie sosu");
        System.out.println("Układanie dodatków: ");
        for (String type: additives) {
            System.out.print( type+" ");
        }
        System.out.println("");
    }

    void baking(){
        System.out.println("Pieczenie w 350 stopniach przez 20 minut");
    }

    void cutting(){
        System.out.println("Krojenie na 8 kawałkow");
    }

    void packing(){
        System.out.println("Pakowanie do pudełka");
    }

    public String getName(){
        return name;
    }
}
