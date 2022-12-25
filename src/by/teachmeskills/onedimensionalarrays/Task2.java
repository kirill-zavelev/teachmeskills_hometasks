package by.teachmeskills.onedimensionalarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[] initialArray = {1, 2, 3, 4, 5};
        System.out.println("Initial array is " + Arrays.toString(initialArray));
        System.out.print("Enter number to remove from initial array: ");
        Scanner scanner = new Scanner(System.in);
        int numberFromConsole = scanner.nextInt();
        int[] newArray = new int[initialArray.length - 1];
        boolean isMatches = false;

        for (int i = 0; i < initialArray.length; i++) {
            if (numberFromConsole == initialArray[i]) {
                System.arraycopy(initialArray, 0, newArray, 0, i);
                System.arraycopy(initialArray, i + 1, newArray, i, initialArray.length - 1 - i);
                System.out.println("Result array is " + Arrays.toString(newArray));
                isMatches = true;
                break;
            }
        }
        if (!isMatches) {
            System.out.println("Number " + numberFromConsole + " is outside of " + Arrays.toString(initialArray));
        }
    }
}
