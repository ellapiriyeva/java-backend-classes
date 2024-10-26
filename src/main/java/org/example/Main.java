package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number \t");
        int num = scan.nextInt();

        System.out.println((num % 2 == 0) ? "Even" : "Odd");

    }
}