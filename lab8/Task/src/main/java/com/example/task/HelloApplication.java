package com.example.task;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.time.LocalDate;

import javax.swing.*;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        GridPane layout = new GridPane();

        Image img1 = new Image(HelloApplication.class.getResourceAsStream("/com/example/task/images/img.png"));
        ImageView imageView = new ImageView(img1);
        imageView.setFitWidth(560);
        imageView.setFitHeight(50);

        //can aslo use Vbox to fit the picture
        layout.add(imageView, 0, 0,4,1); //use Column spans to fit picture

        Label name = new Label("Name");
        Label fatherName = new Label("Father Name");
        Label cnic = new Label("CNIC");
        Label date = new Label("Date");
        Label gender = new Label("Gender");
        Label city = new Label("City");

        TextField nameField = new TextField();
        TextField fatherNameField = new TextField();
        TextField cnicField = new TextField();
        TextField cityField = new TextField();




        layout.add(name, 0, 1); //
        layout.add(nameField, 1, 1); //col . row
        layout.add(fatherName, 0, 2);
        layout.add(fatherNameField, 1, 2);
        layout.add(cnic, 0, 3);
        layout.add(cnicField, 1, 3);



        DatePicker datePicker = new DatePicker();
        layout.add(date, 0, 4);
        layout.add(datePicker, 1, 4);


        RadioButton maleRadio = new RadioButton("Male");
        RadioButton femaleRadio = new RadioButton("Female");

        ToggleGroup genderGroup = new ToggleGroup(); // this will allow only one RButton tbs
        maleRadio.setToggleGroup(genderGroup);
        femaleRadio.setToggleGroup(genderGroup);

        HBox genderBox = new HBox();
        genderBox.setSpacing(10);
        genderBox.getChildren().addAll(maleRadio, femaleRadio);

        layout.add(gender, 0, 5);
        layout.add(genderBox, 1, 5);

        layout.add(city, 0, 6);
        layout.add(cityField, 1, 6);

        Button selectImageButton = new Button("Select Image");

        layout.add(selectImageButton, 3, 1,5,2);
        GridPane.setHalignment(selectImageButton, HPos.CENTER);

        ImageView selectedImage = new ImageView();
        selectedImage.setFitWidth(300);
        selectedImage.setFitHeight(300);
        selectedImage.setPreserveRatio(true);


        selectImageButton.setOnAction(e -> {
            FileChooser imgSelect = new FileChooser();
            imgSelect.setTitle("Select Image");

            imgSelect.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.jpeg", "*.gif"));



            File image = imgSelect.showOpenDialog(stage);

            if (image != null) {
//                selectedImage.setImage(null);
                Image img2 = new Image(image.toURI().toString());
                selectedImage.setImage(img2);

                layout.add(selectedImage, 3, 3,5,7);
                GridPane.setHalignment(selectedImage, HPos.CENTER);

            }
        });


        Button saveButton = new Button("Save");
        saveButton.setScaleX(1.5);
        saveButton.setScaleY(1.5);
        saveButton.setTextFill(Color.GREEN);
        layout.add(saveButton, 4,10);



        Scene scene = new Scene(layout,600,400);



//        layout.paddingProperty().set(Insets.);
        layout.setPadding(new Insets(10, 5, 15, 20)); // top=10, right=5, bottom=15, left=20
        layout.setVgap(10.0);
        layout.setHgap(5.0);

        stage.setResizable(false);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}