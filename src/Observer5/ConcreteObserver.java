package Observer5;

public class ConcreteObserver<T> implements IObserver<T> {

    String observerName;
    IDataManager<T> observerDataManager;

    public ConcreteObserver(String observerName, IDataManager<T> observerDataManager) {
        this.observerName = observerName;
        this.observerDataManager = observerDataManager;
        System.out.println("  Observer: " + this.observerName + " - Build: ");
        System.out.println("    ObservedDataManager: " + this.observerDataManager.getName());
    }

    @Override
    public String getObserverName() {
        return observerName;
    }


    @Override
    public void update(T observedValue) {
        System.out.println("  Observer: "  + this.observerName + " update value.");
        this.observerDataManager.manage(observedValue);
    }
}
