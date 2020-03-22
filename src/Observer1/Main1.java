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
        System.out.println("The observable is passed in the constructor of the observer.");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Create an Integer Observable");
        System.out.println("--------------------------------------------------------------------------------");
        ConcreteObservableInteger observableInteger = new ConcreteObservableInteger("Integer Observable");
        System.out.println("--------------------------------------------------------------------------------");
        Observer observer1 = new ConcreteObserverInteger(observableInteger,"Integer Observer 1");
        System.out.println("--------------------------------------------------------------------------------");
        Observer observer2 = new ConcreteObserverInteger(observableInteger,"Integer Observer 2");
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
        Observer observer3 = new ConcreteObserverString(observableString,"String Observer 3");
        System.out.println("--------------------------------------------------------------------------------");
        Observer observer4 = new ConcreteObserverString(observableString,"String Observer 4");
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
