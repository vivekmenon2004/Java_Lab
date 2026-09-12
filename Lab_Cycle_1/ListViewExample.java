import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ListViewExample extends Application {

    @Override
    public void start(Stage stage) {

        Label label = new Label("Select a Language:");

        ListView<String> listView = new ListView<>();

        listView.getItems().addAll(
                "Java",
                "Python",
                "C",
                "C++",
                "JavaScript"
        );

        Button button = new Button("Select");

        Label result = new Label();

        button.setOnAction(e -> {
            String selected =
                    listView.getSelectionModel().getSelectedItem();

            result.setText("Selected: " + selected);
        });

        VBox root = new VBox(10);

        root.getChildren().addAll(
                label, listView, button, result
        );

        Scene scene = new Scene(root, 400, 400);

        stage.setTitle("ListView Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
