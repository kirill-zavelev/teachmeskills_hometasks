package by.teachmeskills.onedimensionalarrays;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        final int min = 0;
        final int max = 10;
        int[] firstArray = new int[5];
        int[] secondArray = new int[5];

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = (int) (Math.random() * (max - min));
        }
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = (int) (Math.random() * (max - min));
        }
        System.out.println("First array is: " + Arrays.toString(firstArray));
        System.out.println("Second array is: " + Arrays.toString(secondArray));

        int sumForFirstArray = 0;
        int sumForSecondArray = 0;
        for (int i = 0; i < firstArray.length; i++) {
            sumForFirstArray += firstArray[i];
        }
        for (int i = 0; i < secondArray.length; i++) {
            sumForSecondArray += secondArray[i];
        }
        double averageForFirstArray = (double) sumForFirstArray / firstArray.length;
        double averageForSecondArray = (double) sumForSecondArray / secondArray.length;

        if (averageForFirstArray > averageForSecondArray) {
            System.out.println("Average for First array is higher and = " + averageForFirstArray);
        } else if (averageForFirstArray == averageForSecondArray) {
            System.out.println("Average for First array " + averageForFirstArray + " = Average for Second array " + averageForSecondArray);
        } else {
            System.out.println("Average for Second array is higher and = " + averageForSecondArray);
        }
    }
}
