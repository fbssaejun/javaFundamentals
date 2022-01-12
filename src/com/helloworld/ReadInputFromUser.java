package com.helloworld;

import java.util.Scanner;

public class ReadInputFromUser {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        String name = scanner.nextLine().trim();
        System.out.println("You are " + name);
    }
}
