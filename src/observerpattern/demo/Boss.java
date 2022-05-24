package observerpattern.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther:shen7me
 * @Description:DesignPattern
 */
public class Boss implements Subject{
    private List<Observer> observers = new ArrayList<Observer>();
    private String state;

    @Override
    public void attach(Observer observer)
    {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    @Override
    public String getSubjectState() {
        return state;
    }

    @Override
    public void setSubjectState(String value) {
        this.state = value;
    }
}
