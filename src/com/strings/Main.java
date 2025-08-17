// Java program to use copyValueOf() method to copy chars from array to new string

package com.strings;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating array of chars
        char[] arr = {'c', 'f', 's', 'm', ' ', 'l'};

        // Creating string with initialization
        String str = String.copyValueOf(arr);

        // Printing created string to console
        System.out.println(str);
    }
}