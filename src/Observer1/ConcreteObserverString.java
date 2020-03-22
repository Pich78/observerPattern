package Observer1;

public class ConcreteObserverString implements Observer {

    ConcreteObservableString observable;
    String observerName;

    public ConcreteObserverString(ConcreteObservableString observable, String observerName) {
        this.observerName = observerName;
        System.out.println("  Observer: " + this.observerName + " - Build: ");
        this.observable = observable;
        System.out.println("  Observer: " + this.observerName + " - " + observable.getObservableName() + " assigned in the constructor");
    }

    @Override
    public String getObserverName() {
        return observerName;
    }


    @Override
    public void update() {
        System.out.println("  Observer: "  + this.observerName + " update");
        System.out.println("  Observer: "  + this.observerName + " call internal reference of the observable: " + this.observable.getObservedValue());
    }
}
