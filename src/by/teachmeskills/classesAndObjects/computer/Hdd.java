package by.teachmeskills.classesAndObjects.computer;

import java.util.Objects;

public class Hdd {
    private static final String HDD_TYPE_MESSAGE = "Hdd type can be only External or Internal";
    private static final String HDD_TYPE_INTERNAL = "Internal";
    private static final String HDD_TYPE_EXTERNAL = "External";
    private String name;
    private int capacity;
    private String type;

    public Hdd() {

    }

    public Hdd(String name, int capacity, String type) {
        this.name = name;
        this.capacity = capacity;
        if (Objects.equals(type, HDD_TYPE_INTERNAL) || Objects.equals(type, HDD_TYPE_EXTERNAL)) {
            this.type = type;
        } else {
            System.out.println(HDD_TYPE_MESSAGE);
        }
    }

    @Override
    public String toString() {
        return "hdd.name='" + name + '\'' +
                ", hdd.capacity=" + capacity +
                ", hdd.type='" + type + '\'';
    }
}