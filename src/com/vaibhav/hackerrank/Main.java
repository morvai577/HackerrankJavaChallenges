package com.vaibhav.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat us_format = NumberFormat.getCurrencyInstance(Locale.US);
        String us = us_format.format(payment);

        NumberFormat india_format = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = india_format.format(payment);

        NumberFormat china_format = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = china_format.format(payment);

        NumberFormat france_format = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = france_format.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
