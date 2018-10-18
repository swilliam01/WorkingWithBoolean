package com.company;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList <Person> value = new ArrayList<>();
        String response = "";

        do {
            System.out.println("Enter your name");
            String name = keyboard.nextLine();
            System.out.println("Does this person like french fries (true or false):");
            Boolean frenFries = keyboard.nextBoolean();
            System.out.println("Does this person likes to sleep (true or false):");
            Boolean sleep = keyboard.nextBoolean();
            System.out.println("Is this person adventurous (true or false):");
            Boolean advent = keyboard.nextBoolean();

            value.add(new Person(name,frenFries,sleep,advent));
            System.out.println("Add another person Y(yes) or N(no)");
             response = keyboard.next();
             keyboard.nextLine();

        }while (!response.equalsIgnoreCase("n"));

        for (Person value2 :value) {
            System.out.println("\n");
            System.out.println("Name :" +value2.getName());
            System.out.println("Likes French Fries :" + value2.getFrenchFries());
            System.out.println("Likes sleeping :" + value2.getSleeping());
            System.out.println("Is adventurous :" + value2.getAdventurous());
        }
        System.out.print("These persons like french fries :\n");

        for (Person value3: value){
            if (value3.getFrenchFries() == true){
                System.out.println(value3.getName());
            }

        }

    }

}
