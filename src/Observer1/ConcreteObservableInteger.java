package Observer1;
import java.util.ArrayList;

public class ConcreteObservableInteger implements IObservableInteger {

    ArrayList<IObserverInteger> observerList = new ArrayList<>();
    String observableName;
    int observedValue;

    public ConcreteObservableInteger(String observableName) {
        this.observableName = observableName;
        System.out.println("Observable: " + this.observableName + " - Build");
    }

    public void add(IObserverInteger observer) {
        observerList.add(observer);
        System.out.println("Observable: " + this.observableName + " - Add observer: " + observer.getObserverName());
    }

    public void remove(IObserverInteger observer) {
        observerList.remove(observer);
        System.out.println("Observable: " + this.observableName + " - Remove observer: " + observer.getObserverName());
    }

    @Override
    public void sendNotify() {
        System.out.println("Observable: " + this.observableName + " - Notify to all observers");
        for (IObserverInteger observer : observerList) {
            observer.update(this.observedValue);
        }
    }

    public String getObservableName() {
        return this.observableName;
    }

    public int getObservedValue() {
        System.out.println("Observable: getObservedValue");
        return this.observedValue;
    }

    public void setObservedValue(int observedValue) {
        System.out.println("Observable: setObservedValue: " + observedValue);
        this.observedValue = observedValue;
    }
}
