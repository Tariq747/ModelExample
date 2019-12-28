package com.company.models;

public class UserModel {

    public String name;
    public int age;
    public static String user_gender;

    public UserModel(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public UserModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
