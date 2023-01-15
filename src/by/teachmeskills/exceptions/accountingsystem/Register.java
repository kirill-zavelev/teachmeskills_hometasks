package by.teachmeskills.exceptions.accountingsystem;

public interface Register {
    void saveDocument(Document[] documents) throws WrongDocumentFormatException;

    void getDocumentInformation(Document document);
}
