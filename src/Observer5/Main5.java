package Observer5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main5 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Test Observer 5");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Test Observer 5");
        System.out.println("The observed value is passed when the update method is called.");
        System.out.println("The observed data handler is passed in the constructor.");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Create an Integer Observable and Integer Data Manager");
        System.out.println("--------------------------------------------------------------------------------");
        ConcreteObservable<Integer> observableInteger = new ConcreteObservable("Integer Observable");
        IDataManager<Integer> integerDataManager = new IntegerDataManager("integerDataManager");
        System.out.println("--------------------------------------------------------------------------------");

        IObserver<Integer> observer1 = new ConcreteObserver<Integer>("Integer Observer 1",integerDataManager);
        IObserver<Integer> observer2 = new ConcreteObserver<Integer>("Integer Observer 2",integerDataManager);
        System.out.println("--------------------------------------------------------------------------------");

        observableInteger.add(observer1);
        observableInteger.add(observer2);
        System.out.println("--------------------------------------------------------------------------------");

        observableInteger.setObservedValue(5);
        observableInteger.sendNotify();
        System.out.println("--------------------------------------------------------------------------------");

        observableInteger.setObservedValue(6);
        observableInteger.sendNotify();

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Create a String Observable and Integer Data Manager");
        System.out.println("--------------------------------------------------------------------------------");
        ConcreteObservable<String> observableString = new ConcreteObservable<String>("String Observable");
        IDataManager<String> stringDataManager = new StringDataManager("StringDataManager");
        System.out.println("--------------------------------------------------------------------------------");

        IObserver<String> observer3 = new ConcreteObserver<String>("String Observer 3",stringDataManager);
        IObserver<String> observer4 = new ConcreteObserver<String>("String Observer 4",stringDataManager);
        System.out.println("--------------------------------------------------------------------------------");

        observableString.add(observer3);
        observableString.add(observer4);
        System.out.println("--------------------------------------------------------------------------------");

        observableString.setObservedValue("StringFoo");
        observableString.sendNotify();
        System.out.println("--------------------------------------------------------------------------------");

        observableString.setObservedValue("StringBar");
        observableString.sendNotify();
        System.out.println("--------------------------------------------------------------------------------");

    }


    public static void main(String[] args) {
        launch(args);
    }
}
