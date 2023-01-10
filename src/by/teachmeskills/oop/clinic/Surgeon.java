package by.teachmeskills.oop.clinic;

public class Surgeon implements Treatable {

    @Override
    public void treat() {
        System.out.println(Doctor.SURGEON.getDuty());
    }
}
