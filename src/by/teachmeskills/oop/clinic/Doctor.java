package by.teachmeskills.oop.clinic;

public enum Doctor {

    SURGEON("Doing surgery"),
    DENTIST("Treats teeth"),
    THERAPIST("Treats a cold");

    private final String duty;

    Doctor(String duty) {
        this.duty = duty;
    }

    public String getDuty() {
        return duty;
    }
}
