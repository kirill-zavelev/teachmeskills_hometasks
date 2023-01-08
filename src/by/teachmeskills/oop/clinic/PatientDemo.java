package by.teachmeskills.oop.clinic;

public class PatientDemo {
    public static void main(String[] args) {
        Patient patient = new Patient();
        patient.addTreatmentPlan(3);
        patient.assignDoctor();
    }
}
