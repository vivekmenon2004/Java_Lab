import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RadioButton extends Application {

    @Override
    public void start(Stage stage) {

        Label label = new Label("Select Gender:");

        RadioButton male = new RadioButton("Male");
        RadioButton female = new RadioButton("Female");

        ToggleGroup group = new ToggleGroup();

        male.setToggleGroup(group);
        female.setToggleGroup(group);

        Button button = new Button("Submit");
        Label result = new Label();

        button.setOnAction(e -> {
            RadioButton selected =
                    (RadioButton) group.getSelectedToggle();

            if (selected != null) {
                result.setText("Selected: " + selected.getText());
            }
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(
                label, male, female, button, result
        );

        Scene scene = new Scene(root, 400, 300);

        stage.setTitle("Radio Button Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}