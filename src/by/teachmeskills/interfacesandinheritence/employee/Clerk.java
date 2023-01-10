package by.teachmeskills.interfacesandinheritence.employee;

import java.util.Objects;

public class Clerk implements Employee {
    private final String name;
    private final String surname;

    public Clerk(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public void printJobTitle() {
        System.out.println("Job title of " + name + " " + surname + " is: " + EmployeeJobTitle.CLERK.getJobTitle());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Clerk)) return false;
        Clerk clerk = (Clerk) o;
        return name.equals(clerk.name) && surname.equals(clerk.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public String toString() {
        return "Clerk{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
