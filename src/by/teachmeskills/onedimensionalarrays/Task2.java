package by.teachmeskills.onedimensionalarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[] initialArray = {1, 2, 3, 5, 5};
        System.out.println("Initial array is " + Arrays.toString(initialArray));
        System.out.print("Enter number to remove from initial array: ");
        Scanner scanner = new Scanner(System.in);
        int numberFromConsole = scanner.nextInt();

        int amountOfRepetitions = 0;
        for (int i : initialArray) {
            if (numberFromConsole == i) {
                amountOfRepetitions++;
            }
        }

        if (amountOfRepetitions == 0) {
            System.out.println("Number " + numberFromConsole + " is outside of " + Arrays.toString(initialArray));
        } else {
            int[] newArray = new int[initialArray.length - amountOfRepetitions];
            for (int i = 0, j = 0; i < initialArray.length; i++) {
                if (initialArray[i] != numberFromConsole) {
                    newArray[j] = initialArray[i];
                    j++;
                }
            }
            System.out.println("Result array is " + Arrays.toString(newArray));
        }
    }
}