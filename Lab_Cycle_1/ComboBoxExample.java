import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ComboBoxExample extends Application {

    @Override
    public void start(Stage stage) {

        Label label = new Label("Select a Course:");

        ComboBox<String> comboBox = new ComboBox<>();

        comboBox.getItems().addAll(
                "Java",
                "Python",
                "JavaScript",
                "C++"
        );

        Button button = new Button("Submit");

        Label result = new Label();

        button.setOnAction(e -> {
            result.setText(
                    "Selected: " + comboBox.getValue()
            );
        });

        VBox root = new VBox(10);

        root.getChildren().addAll(
                label, comboBox, button, result
        );

        Scene scene = new Scene(root, 400, 300);

        stage.setTitle("ComboBox Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
