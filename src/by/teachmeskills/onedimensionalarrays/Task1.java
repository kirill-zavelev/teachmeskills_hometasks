package by.teachmeskills.onedimensionalarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Enter number indicates size of array: ");
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        int[] array = new int[sizeOfArray];
        final int min = 0;
        final int max = 10;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (max - min));
        }
        System.out.println("Given array is " + Arrays.toString(array));
        System.out.print("Enter number: ");
        int numberFromConsole = scanner.nextInt();
        boolean isMatches = false;

        for (int i : array) {
            if (numberFromConsole == i) {
                System.out.println(numberFromConsole + " is included to " + Arrays.toString(array));
                isMatches = true;
                break;
            }
        }
        if (!isMatches) {
            System.out.println(numberFromConsole + " is not included to " + Arrays.toString(array));
        }
    }
}