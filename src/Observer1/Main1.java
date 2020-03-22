package Observer1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main1 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Test Observer 1");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Test Observer 1");
        System.out.println("The observed value is passed when the update method is called.");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Create an Integer Observable");
        System.out.println("--------------------------------------------------------------------------------");
        ConcreteObservableInteger observableInteger = new ConcreteObservableInteger("Integer Observable");
        System.out.println("--------------------------------------------------------------------------------");
        IObserverInteger observer1 = new ConcreteObserverInteger("Integer Observer 1");
        System.out.println("--------------------------------------------------------------------------------");
        IObserverInteger observer2 = new ConcreteObserverInteger("Integer Observer 2");
        System.out.println("--------------------------------------------------------------------------------");
        observableInteger.add(observer1);
        System.out.println("--------------------------------------------------------------------------------");
        observableInteger.add(observer2);
        System.out.println("--------------------------------------------------------------------------------");
        observableInteger.setObservedValue(5);
        System.out.println("--------------------------------------------------------------------------------");
        observableInteger.sendNotify();
        System.out.println("--------------------------------------------------------------------------------");
        observableInteger.setObservedValue(6);
        System.out.println("--------------------------------------------------------------------------------");
        observableInteger.sendNotify();
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Create a String Observable");
        System.out.println("--------------------------------------------------------------------------------");
        ConcreteObservableString observableString = new ConcreteObservableString("String Observable");
        System.out.println("--------------------------------------------------------------------------------");
        IObserverString observer3 = new ConcreteObserverString("String Observer 3");
        System.out.println("--------------------------------------------------------------------------------");
        IObserverString observer4 = new ConcreteObserverString("String Observer 4");
        System.out.println("--------------------------------------------------------------------------------");
        observableString.add(observer3);
        System.out.println("--------------------------------------------------------------------------------");
        observableString.add(observer4);
        System.out.println("--------------------------------------------------------------------------------");
        observableString.setObservedValue("StringFoo");
        System.out.println("--------------------------------------------------------------------------------");
        observableString.sendNotify();
        System.out.println("--------------------------------------------------------------------------------");
        observableString.setObservedValue("StringBar");
        System.out.println("--------------------------------------------------------------------------------");
        observableString.sendNotify();
        System.out.println("--------------------------------------------------------------------------------");

    }


    public static void main(String[] args) {
        launch(args);
    }
}
