package by.teachmeskills.exceptions.accountingsystem;

import java.util.Date;
import java.util.Objects;

public class ContractWithEmployee extends Document {
    private Date endOfContractDate;
    private String employeeName;

    public ContractWithEmployee(Date documentDate, String documentNumber, Date endOfContractDate, String employeeName) {
        super(documentDate, documentNumber);
        this.endOfContractDate = endOfContractDate;
        this.employeeName = employeeName;
    }

    public ContractWithEmployee() {
    }

    @Override
    public String toString() {
        return "ContractWithEmployee{" +
                "endOfContractDate=" + endOfContractDate +
                ", employeeName='" + employeeName + "', " +
                super.toString() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContractWithEmployee)) return false;
        if (!super.equals(o)) return false;
        ContractWithEmployee that = (ContractWithEmployee) o;
        return endOfContractDate.equals(that.endOfContractDate) && employeeName.equals(that.employeeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), endOfContractDate, employeeName);
    }
}
