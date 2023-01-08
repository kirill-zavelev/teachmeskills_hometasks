package by.teachmeskills.oop.phone;

import java.util.Arrays;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone() {

    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public void receiveCall(String name) {
        System.out.println(name + " is calling");
    }

    public void receiveCall(String name, String number) {
        System.out.println(name + " is calling " + number);
    }

    public void sendMessage(String... phoneNumbers) {
        System.out.println("The message is sent to: " + Arrays.toString(phoneNumbers));
    }

    public String getNumber() {
        if (this.number == null) {
            System.out.println("Number is undefined");
        }
        return number;
    }
}
