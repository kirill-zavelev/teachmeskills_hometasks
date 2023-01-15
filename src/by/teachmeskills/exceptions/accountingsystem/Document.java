package by.teachmeskills.exceptions.accountingsystem;

import java.util.Date;
import java.util.Objects;

public class Document implements Register {

    private static final String DOCUMENT_STARTS_WITH = "555";
    private static final String DOCUMENT_ENDS_WITH = "1a2b";
    private static final String DOCUMENT_CONTAINS = "abc";
    private static final String DOCUMENT_IS_NOT_SAVED = "Can't save Document №";

    private Date documentDate;
    private String documentNumber;

    public Document(Date documentDate, String documentNumber) {
        this.documentDate = documentDate;
        this.documentNumber = documentNumber;
    }

    public Document() {
    }

    @Override
    public void saveDocument(Document[] documents) throws WrongDocumentFormatException {
        for (Document document : documents) {
            if (!document.documentNumber.startsWith(DOCUMENT_STARTS_WITH)) {
                throw new WrongDocumentFormatException(DOCUMENT_IS_NOT_SAVED + document.documentNumber
                        + ". Document number should starts with 555 sequence");
            } else if (!document.documentNumber.contains(DOCUMENT_CONTAINS)) {
                throw new WrongDocumentFormatException(DOCUMENT_IS_NOT_SAVED + document.documentNumber
                        + ". Document number should contains abc sequence");
            } else if (!document.documentNumber.endsWith(DOCUMENT_ENDS_WITH)) {
                throw new WrongDocumentFormatException(DOCUMENT_IS_NOT_SAVED + document.documentNumber
                        + ". Document number should ends with 1a2b");
            } else {
                System.out.println(document);
            }
        }
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
