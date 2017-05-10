package com.vaibhav.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.time.*;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        StringBuilder dateString = new StringBuilder(day + "/" + month + "/" + year);
        SimpleDateFormat format = new SimpleDateFormat("dd/M/yyyy");
        try {
            Date dt1 = format.parse(dateString.toString());
            DateFormat format2 = new SimpleDateFormat("EEEE");
            String finalDay = format2.format(dt1);
            System.out.println(finalDay.toUpperCase());
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
