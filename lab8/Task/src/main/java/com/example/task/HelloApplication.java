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
import java.util.ArrayList;

public class HelloApplication extends Application {

    private Boolean isDark = false;
    private ArrayList<Person> persons = new ArrayList<>();



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
//        TextField cityField = new TextField();

        ComboBox<String> cityField = new ComboBox<>();
        cityField.getItems().addAll("Lahore", "Islamabad","Quetta","Peshawar","Karachi");


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

        layout.add(city, 0, 6);
        layout.add(cityField, 1, 6);


        layout.add(gender, 0, 5);
        layout.add(genderBox, 1, 5);



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

        //save Button setup
        Button saveButton = new Button("Save");
        saveButton.setScaleX(1);
        saveButton.setScaleY(1);
        saveButton.setTextFill(Color.GREEN);
        layout.add(saveButton, 0,10);
        saveButton.setOnAction(e -> {
            if (isFormComplete(nameField, fatherNameField, cnicField, cityField.getValue(), datePicker, genderGroup)) {

                String tempName = nameField.getText();
                String tempFatherName = fatherNameField.getText();
                String tempCnic = cnicField.getText();
                String tempCity = cityField.getValue();
                String tempDate = datePicker.getValue().toString();
                String tempGender = ((RadioButton) genderGroup.getSelectedToggle()).getText();

                persons.add(new Person(tempName, tempFatherName, tempCnic, tempDate, tempCity, null, Gender.valueOf(tempGender.toUpperCase())));

//                System.out.println("Data saved successfully.");
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Success");
                alert.setHeaderText(null);
                alert.setContentText("Data Saved Successfully");
                alert.showAndWait();

                nameField.clear();
                fatherNameField.clear();
                cnicField.clear();
                cityField.setValue(null);
                datePicker.setValue(null);
                genderGroup.selectToggle(null);
                selectedImage.setImage(null);

            } else {
//                System.out.println("All entities are not filled!");
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText("All entities are not filled");
                alert.showAndWait();
            }

        });

        //view Button setup
        Button viewDataButton = new Button("View Saved Data");
        layout.add(viewDataButton, 0, 11);
        viewDataButton.setScaleX(1);
        viewDataButton.setScaleY(1);
        viewDataButton.setTextFill(Color.BLUE);
        viewDataButton.setOnAction(e -> viewRecords());


        //Button to display creator details
        Button createButton = new Button("Creator Details");
        layout.add(createButton, 5, 10);
        createButton.setScaleX(1);
        createButton.setScaleY(1);
        createButton.setTextFill(Color.RED);
        createButton.setOnAction(e -> creatorDetails());

        Scene scene = new Scene(layout,600,400);


        //Dark mode Toogle
        Button darkmodetogler = new Button("🌞");
        layout.add(darkmodetogler, 5, 11);
        darkmodetogler.setScaleX(1);
        darkmodetogler.setScaleY(1);
        darkmodetogler.setTextFill(Color.BLACK);
        darkmodetogler.setOnAction(e -> {
            if (isDark) {
                isDark = false;
            }else {
                isDark = true;
            }
            if (isDark){
                darkmodetogler.setText("🌙");
//                layout.setStyle("-fx-background-color: #000000;");
                scene.getStylesheets().add(HelloApplication.class.getResource("/dark.css").toExternalForm());


            }else {
                darkmodetogler.setText("🌞");
                scene.getStylesheets().add(HelloApplication.class.getResource("light.css").toExternalForm());

//                layout.setStyle("-fx-background-color: #ffffff;");
            }
        });




        layout.setPadding(new Insets(10, 5, 15, 20)); // top=10, right=5, bottom=15, left=20
        layout.setVgap(10.0);
        layout.setHgap(5.0);

        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }


    private boolean isFormComplete(TextField nameField, TextField fatherNameField, TextField cnicField, String cityField, DatePicker datePicker, ToggleGroup genderGroup) {
        return !nameField.getText().isEmpty() &&
                !fatherNameField.getText().isEmpty() &&
                !cnicField.getText().isEmpty() &&
                !cityField.isEmpty() &&
                datePicker.getValue() != null &&
                genderGroup.getSelectedToggle() != null;
    }



    public void viewRecords(){
        if (persons.isEmpty()){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("There is not any data to show");
            alert.showAndWait();
        }else {
            StringBuilder dataList = new StringBuilder("Saved Records:\n");
            for (int i = 0; i < persons.size(); i++) {
                dataList.append(i).append(": ").append(persons.get(i).getName()).append("\n");
            }

            Alert dataListAlert = new Alert(Alert.AlertType.INFORMATION);
            dataListAlert.setTitle("Saved Records");
            dataListAlert.setHeaderText("Select an index to view details.");
            dataListAlert.setContentText(dataList.toString());
            dataListAlert.showAndWait();

            TextInputDialog inputDialog = new TextInputDialog();
            inputDialog.setTitle("View Record");
            inputDialog.setHeaderText("Enter the index of the person to view details.");
            inputDialog.setContentText("Index:");


            inputDialog.showAndWait().ifPresent(indexInput -> {
                try {
                    int index = Integer.parseInt(indexInput);
                    if (index >= 0 && index < persons.size()) {
                        Person selectedPerson = persons.get(index);

                        //details of the selected person//
                        Alert personDetailsAlert = new Alert(Alert.AlertType.INFORMATION);
                        personDetailsAlert.setTitle("Person Details");
                        personDetailsAlert.setHeaderText("Details for " + selectedPerson.getName());
                        personDetailsAlert.setContentText(
                                "Name: " + selectedPerson.getName() + "\n" +
                                        "Father Name: " + selectedPerson.getFatherName() + "\n" +
                                        "CNIC: " + selectedPerson.getCnic() + "\n" +
                                        "Date of Birth: " + selectedPerson.getDate() + "\n" +
                                        "City: " + selectedPerson.getCity() + "\n" +
                                        "Gender: " + selectedPerson.getGender()
                        );
                        personDetailsAlert.showAndWait();
                    } else {
                        // Show error if index is out of range
                        Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                        errorAlert.setTitle("Invalid Index");
                        errorAlert.setHeaderText(null);
                        errorAlert.setContentText("Index out of range. Please enter a valid index.");
                        errorAlert.showAndWait();
                    }
                } catch (NumberFormatException ex) {
                    //if input is not a number
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setTitle("Invalid Input");
                    errorAlert.setHeaderText(null);
                    errorAlert.setContentText("Please enter a valid integer for the index.");
                    errorAlert.showAndWait();
                }
            });
            }

        }


public void creatorDetails(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Creation Details");
        alert.setHeaderText(null);
        alert.setContentText("Name : Muhammad Eman\nReg No: SP24-BSE-071");
        alert.showAndWait();

}

    public static void main(String[] args) {
        launch();
    }
}