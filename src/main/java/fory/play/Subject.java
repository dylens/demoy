package fory.play;

public interface Subject {
    void addObserver(Observer o);
    void deleteObserver(Observer o);
    void notifyObservers(Subject s);
}