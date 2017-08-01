package Chapter02Observer;

/**
 * Created by Michał on 19.07.2017.
 */
public interface Subject {
    public void registerObjectObserver(Observer observer);
    public void deleteObjectObserver(Observer observer);
    public void notifyObserver();
}
