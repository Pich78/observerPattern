package Observer5;

public class StringDataManager implements IDataManager<String> {

    String dataManagerName;

    public StringDataManager(String dataManagerName) {
        this.dataManagerName = dataManagerName;
    }

    public void manage(String data) {
        System.out.println(this.dataManagerName + " handle data: " + data);
    }

    public String getName() {
        return this.dataManagerName;
    }


}

