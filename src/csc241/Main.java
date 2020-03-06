package csc241;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Initialize an object
        MyNumbers mn1 = new MyNumbers(10);

        // Iterate!
        for (Integer i: mn1) {
            // Print
            System.out.print(i + " ");
        }
    }
}
