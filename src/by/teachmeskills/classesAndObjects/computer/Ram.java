package by.teachmeskills.classesAndObjects.computer;

public class Ram {
    private String name;
    private int capacity;

    public Ram() {

    }

    public Ram(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "ram.name='" + name + '\'' +
                ", ram.capacity=" + capacity;
    }
}