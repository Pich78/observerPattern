package Observer3;

public interface IObservable<T> {
    public void add(IObserver<T> observer);
    public void remove(IObserver<T> observer);
    public void sendNotify();
}
