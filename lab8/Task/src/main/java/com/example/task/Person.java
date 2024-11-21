package com.example.task;

import javafx.scene.image.Image;

public class Person {
    private String name;
    private String fatherName;
    private String cnic;
    private String city;
    private Image image;
    private Gender gender;

    public Person(String name, String fatherName, String cnic, String city, Image image, Gender gender) {
        this.name = name;
        this.fatherName = fatherName;
        this.cnic = cnic;
        this.city = city;
        this.image = image;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
