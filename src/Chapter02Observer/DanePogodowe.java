package Chapter02Observer;

import java.util.ArrayList;

/**
 * Created by Michał on 19.07.2017.
 */
public class DanePogodowe implements Subject {
    private ArrayList observers;
    private float temp;
    private float humidity;
    private float preasure;

    public DanePogodowe() {
        this.observers = new ArrayList();
    }

    @Override
    public void registerObjectObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObjectObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i>=0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i=0; i<observers.size(); i++){
            Observer obs = (Observer)observers.get(i);
            obs.update(temp, humidity,preasure);
        }
    }

    public void setMeasurement ( float temp, float humidity,float preasure){
        this.temp=temp;
        this.humidity=humidity;
        this.preasure=preasure;
    }

    public void measurmentChange (){
        notifyObserver();
    }
}
