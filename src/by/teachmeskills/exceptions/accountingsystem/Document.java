package by.teachmeskills.exceptions.accountingsystem;

import java.util.Date;
import java.util.Objects;

public class Document implements Register {

    private Date documentDate;
    private String documentNumber;

    public Document(Date documentDate, String documentNumber) {
        this.documentDate = documentDate;
        this.documentNumber = documentNumber;
    }

    public Document() {
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    @Override
    public void getDocumentInformation(Document document) {
        System.out.println(document);
    }

    @Override
    public String toString() {
        return "documentDate=" + documentDate + ", documentNumber='" + documentNumber + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Document)) return false;
        Document document = (Document) o;
        return documentDate.equals(document.documentDate) && documentNumber.equals(document.documentNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentDate, documentNumber);
    }
}
