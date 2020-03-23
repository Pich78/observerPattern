package Observer5;

public interface IDataManager<T> {
    public String getName();
    public void manage(T data);
}
