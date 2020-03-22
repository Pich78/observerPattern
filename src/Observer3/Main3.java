package Observer3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main3 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Test Observer 3");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Test Observer 3");
        System.out.println("The observed value is passed when the update method is called.");
        System.out.println("Interfaces are generic.");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Create an Integer Observable");
        System.out.println("--------------------------------------------------------------------------------");
        ConcreteObservable<Integer> observableInteger = new ConcreteObservable("Integer Observable");
        System.out.println("--------------------------------------------------------------------------------");
        IObserver<Integer> observer1 = new ConcreteObserver<Integer>("Integer Observer 1");
        System.out.println("--------------------------------------------------------------------------------");
        IObserver<Integer> observer2 = new ConcreteObserver<Integer>("Integer Observer 2");
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
        ConcreteObservable<String> observableString = new ConcreteObservable<String>("String Observable");
        System.out.println("--------------------------------------------------------------------------------");
        IObserver<String> observer3 = new ConcreteObserver<String>("String Observer 3");
        System.out.println("--------------------------------------------------------------------------------");
        IObserver<String> observer4 = new ConcreteObserver<String>("String Observer 4");
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
