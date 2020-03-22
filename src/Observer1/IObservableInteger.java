package Observer1;

public interface IObservableInteger {
    public void add(IObserverInteger observer);
    public void remove(IObserverInteger observer);
    public void sendNotify();
}
