package by.teachmeskills.exceptions.accountingsystem;

import java.util.Date;
import java.util.Objects;

public class FinancialInvoice extends Document {

    private double totalMonthAmount;
    private String departmentCode;

    public FinancialInvoice(Date documentDate, String documentNumber, double totalMonthAmount, String departmentCode) {
        super(documentDate, documentNumber);
        this.totalMonthAmount = totalMonthAmount;
        this.departmentCode = departmentCode;
    }

    public FinancialInvoice() {
    }

    @Override
    public String toString() {
        return "FinancialInvoice{" +
                "totalMonthAmount=" + totalMonthAmount +
                ", departmentCode='" + departmentCode + "', " +
                super.toString() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FinancialInvoice)) return false;
        if (!super.equals(o)) return false;
        FinancialInvoice that = (FinancialInvoice) o;
        return Double.compare(that.totalMonthAmount, totalMonthAmount) == 0
                && departmentCode.equals(that.departmentCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), totalMonthAmount, departmentCode);
    }
}
