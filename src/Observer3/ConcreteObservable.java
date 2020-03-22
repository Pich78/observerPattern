package Observer3;

import java.util.ArrayList;

public class ConcreteObservable<T> implements IObservable<T> {

    ArrayList<IObserver<T>> observerList = new ArrayList<>();
    String observableName;
    T observedValue;

    public ConcreteObservable(String observableName) {
        this.observableName = observableName;
        System.out.println("Observable: " + this.observableName + " - Build");
    }

    public void add(IObserver<T> observer) {
        observerList.add(observer);
        System.out.println("Observable: " + this.observableName + " - Add observer: " + observer.getObserverName());
    }

    public void remove(IObserver<T> observer) {
        observerList.remove(observer);
        System.out.println("Observable: " + this.observableName + " - Remove observer: " + observer.getObserverName());
    }

    @Override
    public void sendNotify() {
        System.out.println("Observable: " + this.observableName + " - Notify to all observers");
        for (IObserver<T> observer : observerList) {
            observer.update(this.observedValue);
        }
    }

    public String getObservableName() {
        return this.observableName;
    }

    public T getObservedValue() {
        System.out.println("Observable: getObservedValue");
        return this.observedValue;
    }

    public void setObservedValue(T observedValue) {
        System.out.println("Observable: setObservedValue: " + observedValue);
        this.observedValue = observedValue;
    }
}
