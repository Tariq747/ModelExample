package com.company;


import com.company.models.UserModel;

import java.util.Scanner;

public class Main {

    private static String name;
    private static Scanner input;
    private static String switch_value;


    public static void main(String[] args) {
	// write your code here

        UserModel userModel = new UserModel("Kashan",21);

        System.out.println(userModel.getName());
        userModel.setName("Imtiaz Bhai");
        System.out.println(userModel.getName());

        // Input Class Object
        input = new Scanner(System.in);

        // assign input value to name variable
        name = input.nextLine();

        // set input name to user model
        userModel.setName(name);

        // print update name
        System.out.println(userModel.getName());

        // input value for switch case
        switch_value = input.nextLine();

        // Switch Statement
        switch (switch_value){
            case "kashan":
                System.out.println("case Kashan");
                break;
            case "imtiaz":
                System.out.println("case Imtiaz");
                break;
            case "tariq":
                System.out.println("case Tariq");
                break;
            default:
                System.out.println("nothing");
                break;
        }



        // call static variable


    }
}
