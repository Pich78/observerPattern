package Observer1;

public interface IObservableString {
    public void add(IObserverString observer);
    public void remove(IObserverString observer);
    public void sendNotify();
}
