package Observer1;

public class ConcreteObserverString implements IObserverString {

    String observerName;

    public ConcreteObserverString(String observerName) {
        this.observerName = observerName;
        System.out.println("  Observer: " + this.observerName + " - Build: ");
    }

    @Override
    public String getObserverName() {
        return observerName;
    }


    @Override
    public void update(String observedString) {
        System.out.println("  Observer: "  + this.observerName + " update value: " + observedString);
    }
}
