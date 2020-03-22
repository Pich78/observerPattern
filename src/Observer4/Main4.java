package Observer4;

import javafx.application.Application;
import javafx.beans.InvalidationListener;
import javafx.beans.property.Property;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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

        Property<String> propString = new Property<String>() {
            @Override
            public void bind(ObservableValue<? extends String> observableValue) {

            }

            @Override
            public void unbind() {

            }

            @Override
            public boolean isBound() {
                return false;
            }

            @Override
            public void bindBidirectional(Property<String> property) {

            }

            @Override
            public void unbindBidirectional(Property<String> property) {

            }

            @Override
            public Object getBean() {
                return null;
            }

            @Override
            public String getName() {
                return null;
            }

            @Override
            public void addListener(ChangeListener<? super String> changeListener) {

            }

            @Override
            public void removeListener(ChangeListener<? super String> changeListener) {

            }

            @Override
            public String getValue() {
                return null;
            }

            @Override
            public void addListener(InvalidationListener invalidationListener) {

            }

            @Override
            public void removeListener(InvalidationListener invalidationListener) {

            }

            @Override
            public void setValue(String s) {

            }
        };

        int value = 5;
        card2.sendNotify(value);

    }


    public static void main(String[] args) {
        launch(args);
    }
}
