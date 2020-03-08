package Observer1;

public interface Observable {
    public void add(Observer observer);
    public void remove(Observer observer);
    public void sendNotify();
}
