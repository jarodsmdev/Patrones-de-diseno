package observer;

/**
 * Observable
 *
 * Description:
 *
 * @author Jarod
 * @version 1.0
 * @since 13.aug.2026
 */
public interface Observable {
    void addObserver(Observer o);
    
    void deleteObserver(Observer o);
    
    void notifyObserver();
}
