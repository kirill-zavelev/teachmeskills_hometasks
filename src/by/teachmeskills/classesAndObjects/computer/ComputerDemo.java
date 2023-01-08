package by.teachmeskills.classesAndObjects.computer;

import java.util.Scanner;

public class ComputerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter model for first computer: ");
        final String firstComputerModel = scanner.nextLine();
        System.out.print("Enter price for first computer: ");
        final double firstComputerPrice = scanner.nextDouble();
        Computer firstComputer = new Computer(firstComputerPrice, firstComputerModel);
        System.out.println(firstComputer);

        Ram ram = new Ram("Some ram", 100);
        Hdd hdd = new Hdd("Some hdd", 200, "Internal");
        Computer secondComputer = new Computer(1000, "Asus", ram, hdd);
        System.out.println(secondComputer);
    }
}
