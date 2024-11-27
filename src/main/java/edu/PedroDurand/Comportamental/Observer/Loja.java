package edu.PedroDurand.Comportamental.Observer;

import java.util.ArrayList;
import java.util.List;

public class Loja implements Observable{

    private List<Observer> observers = new ArrayList<>();
    private String product;

    public void setProduct(String product){
        this.product = product;
        notificarObservers();
    }
    @Override
    public void adicionarObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notificarObservers() {
        for(Observer observer: observers){
            observer.update(product);
        }
    }
}
