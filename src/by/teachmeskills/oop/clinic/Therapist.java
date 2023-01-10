package by.teachmeskills.oop.clinic;

public class Therapist implements Treatable {
    @Override
    public void treat() {
        System.out.println(Doctor.THERAPIST.getDuty());
    }
}
