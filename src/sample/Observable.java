package sample;

public interface Observable {
    public void add(Observer observer);
    public void remove(Observer observer);
    public void sendNotify();
}
