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
        String B = new StringBuilder(A).reverse().toString();

        if (A.equals(B)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
