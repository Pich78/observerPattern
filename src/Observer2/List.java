package Observer2;

public class List implements Observer {

    @Override
    public void update(int value) {
        System.out.println(value);
    }
}
