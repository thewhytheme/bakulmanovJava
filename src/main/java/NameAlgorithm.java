package main.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NameAlgorithm {
    public static void printHelloNameMessageIfInputNameIsCorrect() {
        try {
            Scanner scanner = new Scanner(System.in);
            if (scanner.nextLine().equals("Вячеслав")) {
                System.out.println("Привет Вячеслав");
            } else {
                System.out.println("Нет такого имени");
            }
        } catch (InputMismatchException ignore) {
        }
    }
}
