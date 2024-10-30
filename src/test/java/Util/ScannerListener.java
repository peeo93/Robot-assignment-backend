package Util;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class ScannerListener {
    private static Scanner scanner;
    public static Scanner getUserInput() {
        scanner = new Scanner(System.in);
        return scanner;
    }

    public static Scanner close() {
        scanner.close();
        return scanner;
    }

    /*public static void main(String[] args) {
        // Simulate input for testing
        String simulatedInput = "Hello, World!\n";
        InputStream originalIn = System.in; // Save original System.in
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        try {
            Scanner result = getUserInput();
            System.out.println("Captured Output: " + result);
        } finally {
            System.setIn(originalIn); // Restore original System.in after the test
        }
    }*/
}
