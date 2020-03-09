package Observer3;

public class List<T> implements Observer<T> {

    @Override
    public void update(T value) {
        System.out.println(value.toString());
    }
}
