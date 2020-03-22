package Observer3;

public class ConcreteObserver<T> implements IObserver<T> {

    String observerName;

    public ConcreteObserver(String observerName) {
        this.observerName = observerName;
        System.out.println("  Observer: " + this.observerName + " - Build: ");
    }

    @Override
    public String getObserverName() {
        return observerName;
    }


    @Override
    public void update(T observedValue) {
        System.out.println("  Observer: "  + this.observerName + " update value: " + observedValue);
    }
}
