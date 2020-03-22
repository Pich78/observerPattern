package Observer1;

public class ConcreteObserverInteger implements IObserverInteger {

    String observerName;

    public ConcreteObserverInteger(String observerName) {
        this.observerName = observerName;
        System.out.println("  Observer: " + this.observerName + " - Build: ");
    }

    @Override
    public String getObserverName() {
        return observerName;
    }


    @Override
    public void update(int observedInteger) {
        System.out.println("  Observer: "  + this.observerName + " update value: " + observedInteger);
    }
}
