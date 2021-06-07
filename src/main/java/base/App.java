/*
 * UCF COP3330 Summer 2021 Assignment 1 Solution
 * Copyright 2021 Ursula Shaw
 */

package base;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is the password? ");
        String entry = in.nextLine();
        String password = "abc$123";

        if (entry.equals(password)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("I don't know you.");
            }
    }
}
