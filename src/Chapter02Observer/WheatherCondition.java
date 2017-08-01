package Chapter02Observer;

/**
 * Created by Michał on 19.07.2017.
 */
public class WheatherCondition implements Observer, ShowElement {
    private float temp;
    private float humidity;
    private float preasure;
    private Subject danePogodowe;

    public WheatherCondition(Subject danePogodowe) {
        this.danePogodowe = danePogodowe;
        danePogodowe.registerObjectObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float preasure) {
        this.temp=temp;
        this.humidity=humidity;
        show();
    }

    @Override
    public void show() {
        System.out.println("Warunki bieżące "+temp+" stopni C oraz "+ humidity+"% wilgotnosci.");
    }
}
