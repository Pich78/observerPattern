package ObserverX;

import java.util.ArrayList;

public class Card<T> implements Observable<T> {

    String cardName;
    ArrayList<Observer<T>> observerList = new ArrayList<>();

    public Card(String cardName)
    {
        this.cardName = cardName;
    }

    public void add(Observer<T> observer){
        observerList.add(observer);
    }

    public void remove(Observer<T> observer) {
        observerList.remove(observer);
    }

    public void sendNotify(T notification) {
        for (Observer observer : observerList) {
            observer.update(notification);
        }
    }
}
