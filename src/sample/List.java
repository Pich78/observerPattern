package sample;

public class List implements Observer {

    Card card;
    public List (Card card) {
        this.card = card;
    }

    @Override
    public void update() {
        System.out.println(this.card.getValue());
    }
}
