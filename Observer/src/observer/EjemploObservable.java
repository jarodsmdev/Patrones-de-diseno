package observer;

import java.util.HashSet;
import java.util.Set;

/**
 * EjemploObservable
 *
 * Description:
 *
 * @author Jarod
 * @version 1.0
 * @since 13.aug.2026
 */
public class EjemploObservable implements Observable{
    Set<Observer> observerSet = new HashSet<>();

    @Override
    public void addObserver(Observer o) {
        observerSet.add(o);
    }

    @Override
    public void deleteObserver(Observer o) {
        observerSet.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer: observerSet){
            observer.update();
        }
    }
}
