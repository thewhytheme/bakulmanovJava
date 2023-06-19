package main.java;

public class Runner {
    static int[] array;

    static {
        array = new int[]{1, 16, 144, 3, 98, 77, 0, 15};

    }

    public static void main(String[] args) {
//        HelloAlgorithm.printHelloIfInputValueMoreThanSeven();
//        NameAlgorithm.printHelloNameMessageIfInputNameIsCorrect();
        MultiplicityAlgorithm.printArrayElementsDivisibleToThree(array);
    }

}
