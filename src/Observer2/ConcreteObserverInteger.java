package Observer2;

public class ConcreteObserverInteger implements Observer {

    ConcreteObservableInteger observable;
    String observerName;

    public ConcreteObserverInteger(ConcreteObservableInteger observable, String observerName) {
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
