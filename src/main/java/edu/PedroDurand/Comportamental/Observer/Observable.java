package edu.PedroDurand.Comportamental.Observer;

public interface Observable {
    void adicionarObserver(Observer observer);
    void removerObserver(Observer observer);
    void notificarObservers();

}
