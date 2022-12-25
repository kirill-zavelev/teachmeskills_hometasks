package by.teachmeskills.onedimensionalarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Given array is " + Arrays.toString(array));
        System.out.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);
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
