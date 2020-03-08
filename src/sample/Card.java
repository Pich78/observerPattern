package sample;

import java.util.ArrayList;

public class Card implements Observable {

    String cardName;
    ArrayList<Observer> observerList = new ArrayList<>();

    public Card(String cardName) {
        this.cardName = cardName;
    }

    public void add(Observer observer){
        observerList.add(observer);
    }

    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    public void sendNotify() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }

    public int getValue() {
        return 5;
    }
}
