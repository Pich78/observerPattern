package ObserverX;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main3 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

        System.out.println("Test Observer 3");
        Card card = new Card("Test Card");
        List list = new List();
        card.add(list);

        String string = "Pippo";
        card.sendNotify(string);

        int value = 5;
        card.sendNotify(value);

    }


    public static void main(String[] args) {
        launch(args);
    }
}
