package by.teachmeskills.interfacesandinheritence.employee;

public enum EmployeeJobTitle {
    BOSS("Boss"),
    ACCOUNTANT("Accountant"),
    CLERK("Clerk");

    private final String jobTitle;

    EmployeeJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }
}
