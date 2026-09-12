import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckBoxExample extends Application {

    @Override
    public void start(Stage stage) {

        Label label = new Label("Select Courses:");

        CheckBox java = new CheckBox("Java");
        CheckBox python = new CheckBox("Python");
        CheckBox web = new CheckBox("Web Development");

        Button button = new Button("Submit");

        Label result = new Label();

        button.setOnAction(e -> {

            String selected = "";

            if (java.isSelected())
                selected += "Java ";

            if (python.isSelected())
                selected += "Python ";

            if (web.isSelected())
                selected += "Web Development ";

            result.setText("Selected: " + selected);
        });

        VBox root = new VBox(10);

        root.getChildren().addAll(
                label, java, python, web, button, result
        );

        Scene scene = new Scene(root, 400, 300);

        stage.setTitle("CheckBox Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
