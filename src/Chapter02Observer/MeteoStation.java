package Chapter02Observer;

/**
 * Created by Michał on 19.07.2017.
 */
public class MeteoStation {
    public static void main(String[] args) {
        DanePogodowe danePogodowe = new DanePogodowe();

        WheatherCondition wheatherCondition = new WheatherCondition(danePogodowe);
        wheatherCondition.update(10,30,50);
        wheatherCondition.update(12,30,54);
    }
}
