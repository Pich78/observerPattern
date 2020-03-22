package Observer3;

public interface IObserver<T> {
    public String getObserverName();
    public void update(T observedValue);
}
