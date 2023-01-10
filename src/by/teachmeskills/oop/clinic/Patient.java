package by.teachmeskills.oop.clinic;

public class Patient {
    private static final String TREATMENT_PLAN_DESCRIPTION =
            "Based on your treatment plan you need to visit doctor %s which: ";
    private static final int FIRST_TREATMENT_CODE = 1;
    private static final int SECOND_TREATMENT_CODE = 2;
    private final TreatmentPlan treatmentPlan;
    private final Surgeon surgeon;
    private final Dentist dentist;
    private final Therapist therapist;

    public Patient() {
        this.treatmentPlan = new TreatmentPlan();
        this.surgeon = new Surgeon();
        this.dentist = new Dentist();
        this.therapist = new Therapist();
    }

    public void addTreatmentPlan(int code) {
        treatmentPlan.setTreatmentCode(code);
    }

    public void assignDoctor() {
        final int treatmentCode = treatmentPlan.getTreatmentCode();
        switch (treatmentCode) {
            case FIRST_TREATMENT_CODE:
                System.out.printf(TREATMENT_PLAN_DESCRIPTION, Doctor.SURGEON);
                surgeon.treat();
            case SECOND_TREATMENT_CODE:
                System.out.printf(TREATMENT_PLAN_DESCRIPTION, Doctor.DENTIST);
                dentist.treat();
            default:
                System.out.printf(TREATMENT_PLAN_DESCRIPTION, Doctor.THERAPIST);
                therapist.treat();
        }
    }
}
