package com.vaibhav.hackerrank;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int y = 1; y <= 10; y++){
            System.out.println(x + " x " + y + " =  " + x*y);
        }
    }
}
