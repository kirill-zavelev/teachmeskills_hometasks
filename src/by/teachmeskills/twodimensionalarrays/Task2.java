package by.teachmeskills.twodimensionalarrays;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        String[][] stringArray = new String[8][8];

        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    stringArray[i][j] = "W";
                } else {
                    stringArray[i][j] = "B";
                }
            }
        }

        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(Arrays.toString(stringArray[i])
                    .replace(",", "")
                    .replace("[", "")
                    .replace("]", "")
                    .trim());
        }
    }
}
