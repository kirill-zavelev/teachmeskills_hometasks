package by.teachmeskills.oop.clinic;

public class Dentist implements Treatable {

    @Override
    public void treat() {
        System.out.println(Doctor.DENTIST.getDuty());
    }
}
