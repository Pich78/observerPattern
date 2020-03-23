package Observer5;

public class IntegerDataManager implements IDataManager<Integer> {

    String dataManagerName;

    public IntegerDataManager(String dataManagerName) {
        this.dataManagerName = dataManagerName;
    }

    public void manage(Integer data) {
        System.out.println("   " + this.dataManagerName + " handle data: " + data);
    }

    public String getName() {
        return this.dataManagerName;
    }


}

