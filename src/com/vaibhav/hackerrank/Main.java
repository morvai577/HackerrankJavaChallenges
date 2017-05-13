package com.vaibhav.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        int stringCount = A.length() + B.length();
        System.out.println(stringCount);

        if(A.compareTo(B) > 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        String newA = capitalize(A);
        String newB = capitalize(B);

        System.out.println(newA+ " "+newB);

    }

    private static String capitalize(final String line) {
        return Character.toUpperCase(line.charAt(0)) + line.substring(1);
    }

}
