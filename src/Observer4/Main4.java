package Observer4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main4 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

        System.out.println("Test Observer 4");
        Card<String> card = new Card<>("Test Card");
        List<String> list = new List<>();
        card.add(list);

        String string = "Pippo";
        card.sendNotify(string);

        Card<Integer> card2 = new Card<>("Test Card");
        List<Integer> list2 = new List<>();
        card2.add(list2);

        int value = 5;
        card2.sendNotify(value);

    }


    public static void main(String[] args) {
        launch(args);
    }
}
