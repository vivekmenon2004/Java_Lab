import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoginForm extends Application {

    @Override
    public void start(Stage stage) {

        Label userLabel = new Label("Username:");
        Label passLabel = new Label("Password:");

        TextField username = new TextField();
        PasswordField password = new PasswordField();

        Button login = new Button("Login");

        Label result = new Label();

        login.setOnAction(e -> {

            if (username.getText().equals("admin")
                    && password.getText().equals("1234")) {

                result.setText("Login Successful");

            } else {

                result.setText("Invalid Username or Password");
            }
        });

        GridPane root = new GridPane();

        root.setHgap(10);
        root.setVgap(10);

        root.add(userLabel, 0, 0);
        root.add(username, 1, 0);

        root.add(passLabel, 0, 1);
        root.add(password, 1, 1);

        root.add(login, 1, 2);
        root.add(result, 1, 3);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("Login Form");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
