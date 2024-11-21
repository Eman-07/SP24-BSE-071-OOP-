package com.example.task;


public enum Gender {

    MALE("M"),
    FEMALE("F");

    String type;
    Gender(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
