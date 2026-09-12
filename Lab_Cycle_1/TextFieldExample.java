import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextFieldExample extends Application {

    @Override
    public void start(Stage stage) {

        Label label = new Label("Enter your name:");

        TextField textField = new TextField();
        textField.setPromptText("Enter name");

        Button button = new Button("Submit");

        Label result = new Label();

        button.setOnAction(e -> {
            result.setText("Hello " + textField.getText());
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(label, textField, button, result);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("TextField Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}