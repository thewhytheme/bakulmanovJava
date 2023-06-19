package main.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HelloAlgorithm {
    public static void printHelloIfInputValueMoreThanSeven() {
        try {
            Scanner scanner = new Scanner(System.in);
            if (scanner.nextInt() >= 7) {
                System.out.println("Привет");
            }
        } catch (InputMismatchException ignore) {
        }
    }

}
