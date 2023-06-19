package main.java;

public class MultiplicityAlgorithm {
    public static void printArrayElementsDivisibleToThree(int[] array) {
        for (int j : array) {
            if (j % 3 == 0) {
                System.out.println(j);
            }
        }

    }
}
