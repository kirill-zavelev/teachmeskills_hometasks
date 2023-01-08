package by.teachmeskills.interfacesandinheritence.employee;

import java.util.Objects;

public class Boss implements Employee {
    private final String name;
    private final String surname;

    public Boss(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public void printJobTitle() {
        System.out.println("Job title of " + name + " " + surname + " is: " + EmployeeJobTitle.BOSS.getJobTitle());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Boss)) return false;
        Boss boss = (Boss) o;
        return name.equals(boss.name) && surname.equals(boss.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public String toString() {
        return "Boss{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
