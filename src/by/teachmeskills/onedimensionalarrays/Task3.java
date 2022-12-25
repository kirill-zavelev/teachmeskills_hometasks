package by.teachmeskills.onedimensionalarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
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
        System.out.println("Array is: " + Arrays.toString(array));

        int valueToCompareWith = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > valueToCompareWith) {
                valueToCompareWith = array[i];
            }
        }
        System.out.println("Max value from array is: " + valueToCompareWith);

        for (int i = 0; i < array.length; i++) {
            if (array[i] < valueToCompareWith) {
                valueToCompareWith = array[i];
            }
        }
        System.out.println("Min value from array is: " + valueToCompareWith);

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = (double) sum / array.length;
        int avgNumber = (int) average;
        System.out.println("Average value from array is: " + avgNumber);
    }
}
