package com.vaibhav.hackerrank;

import java.util.Scanner;
import java.io.BufferedReader;


public class Main {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        int a = scan1.nextInt();
        double b = scan1.nextDouble();

        String c = scan2.nextLine(); // Have to create a new scanner

        System.out.println("String: " + c);
        System.out.println("Double: " + b);
        System.out.println("Int: " + a);
    }
}
