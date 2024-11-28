package com.example.loginpage;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HelloApplication extends Application {


    Label usernameLabel = new Label("Username:");
    TextField username = new TextField();


    Label passwordLabel = new Label("Password:");
    PasswordField password = new PasswordField();

    @Override
    public void start(Stage stage) {

        GridPane layout = new GridPane();
        layout.setAlignment(Pos.CENTER);
        layout.setHgap(10);
        layout.setVgap(10);


        VBox box1 = new VBox(20);
        box1.setPadding(new Insets(20));
        box1.setAlignment(Pos.TOP_CENTER);

        Image image = new Image("C:\\Users\\Muhammad Eman\\Desktop\\SP24-BSE-071-OOP\\lab9\\LoginPage\\img.png");
        ImageView imageView = new ImageView(image);
        imageView.setPreserveRatio(false);
        imageView.setFitWidth(600);
        imageView.setFitHeight(50);

        box1.getChildren().add(imageView);



        layout.add(usernameLabel, 0, 0);
        layout.add(username, 1, 0);

        layout.add(passwordLabel, 0, 1);
        layout.add(password, 1, 1);


        Button loginButton = new Button("Login");
        Button cancelButton = new Button("Cancel");


        HBox box = new HBox(10);
        box.getChildren().addAll(cancelButton, loginButton);
        box.setAlignment(Pos.CENTER_RIGHT);
        layout.add(box, 1, 2);


        box1.getChildren().add(layout);

        loginButton.setOnAction(e -> {
            String enteredUsername = username.getText().trim();
            String enteredPassword = password.getText().trim();

            if (checkCredentials(enteredUsername, enteredPassword)) {
                showAlert(Alert.AlertType.INFORMATION, "Login Successful",
                        "You have successfully logged in!",
                        "Username: " + enteredUsername + "\nPassword: " + enteredPassword);
            } else {
                showAlert(Alert.AlertType.ERROR, "Login Failed", "Invalid username or password.", null);
            }
        });

        cancelButton.setOnAction(e -> {
            username.clear();
            password.clear();
        });


        Scene scene = new Scene(box1, 600, 400);
        stage.setTitle("Login Page");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    private boolean checkCredentials(String username, String password) {
        String fileName = "credentials.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String fileUsername = parts[0].trim();
                    String filePassword = parts[1].trim();
                    if (fileUsername.equals(username) && filePassword.equals(password)) {
                        return true;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    private void showAlert(Alert.AlertType alertType, String title, String header, String content) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
        username.clear();
        password.clear();
    }

    public static void main(String[] args) {
        launch();
    }
}
