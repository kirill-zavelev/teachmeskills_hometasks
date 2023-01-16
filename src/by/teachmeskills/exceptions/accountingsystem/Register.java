package by.teachmeskills.exceptions.accountingsystem;

public interface Register {

    String DOCUMENT_STARTS_WITH = "555";
    String DOCUMENT_ENDS_WITH = "1a2b";
    String DOCUMENT_CONTAINS = "abc";
    String DOCUMENT_IS_NOT_SAVED = "Can't save Document №";

    default void saveDocument(Document[] documents) throws WrongDocumentFormatException {
        for (Document document : documents) {
            if (!document.getDocumentNumber().startsWith(DOCUMENT_STARTS_WITH)) {
                throw new WrongDocumentFormatException(DOCUMENT_IS_NOT_SAVED + document.getDocumentNumber()
                        + ". Document number should starts with 555 sequence");
            } else if (!document.getDocumentNumber().contains(DOCUMENT_CONTAINS)) {
                throw new WrongDocumentFormatException(DOCUMENT_IS_NOT_SAVED + document.getDocumentNumber()
                        + ". Document number should contains abc sequence");
            } else if (!document.getDocumentNumber().endsWith(DOCUMENT_ENDS_WITH)) {
                throw new WrongDocumentFormatException(DOCUMENT_IS_NOT_SAVED + document.getDocumentNumber()
                        + ". Document number should ends with 1a2b");
            } else {
                System.out.println(document);
            }
        }
    }

    void getDocumentInformation(Document document);
}
