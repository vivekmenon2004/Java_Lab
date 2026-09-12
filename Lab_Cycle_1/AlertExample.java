import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AlertExample extends Application {

    @Override
    public void start(Stage stage) {

        Button button = new Button("Show Alert");

        button.setOnAction(e -> {

            Alert alert = new Alert(Alert.AlertType.INFORMATION);

            alert.setTitle("Information");
            alert.setHeaderText("Welcome");
            alert.setContentText("This is a JavaFX Alert Box.");

            alert.show();
        });

        VBox root = new VBox(10);
        root.getChildren().add(button);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("Alert Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
