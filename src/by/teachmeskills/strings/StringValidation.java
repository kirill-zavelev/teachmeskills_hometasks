package by.teachmeskills.strings;

import java.util.regex.Pattern;

public class StringValidation {

    private static final String ANY_DIGIT_REGEX = "\\d";
    private static final String ANY_ALPHABETIC_WITH_CASE_INSENSITIVE_REGEX = "[a-zA-Z]";

    private static final String DOCUMENT_FORMAT = "\\d{4}-[a-zA-Z]{3}-\\d{4}-[a-zA-Z]{3}-\\d[a-zA-Z]\\d[a-zA-Z]";

    private static final String INCORRECT_DOCUMENT_FORMAT_MSG = "Document format is incorrect, please use "
            + DOCUMENT_FORMAT;

    public static void printFirstTwoBlocksWithFourDigits(String document) {
        if (isDocumentAppliesRequiredFormat(document)) {
            String newDocument = document.replaceAll("-"
                    + ANY_ALPHABETIC_WITH_CASE_INSENSITIVE_REGEX + "{3}", "");
            System.out.println(newDocument.replaceAll("-"
                    + ANY_DIGIT_REGEX
                    + ANY_ALPHABETIC_WITH_CASE_INSENSITIVE_REGEX
                    + ANY_DIGIT_REGEX
                    + ANY_ALPHABETIC_WITH_CASE_INSENSITIVE_REGEX, ""));
        } else {
            System.out.println(INCORRECT_DOCUMENT_FORMAT_MSG);
        }
    }

    public static void replaceWordBlocksWithAsterisk(String document) {
        if (isDocumentAppliesRequiredFormat(document)) {
            System.out.println(document.replaceAll(ANY_ALPHABETIC_WITH_CASE_INSENSITIVE_REGEX
                    + "{3}", "***"));
        } else {
            System.out.println(INCORRECT_DOCUMENT_FORMAT_MSG);
        }
    }

    public static String printOnlyWordsInCertainFormat(String document) {
        String documentWithSlashes = document.replaceAll("-", "/");
        String documentWithoutDigits = documentWithSlashes.replaceAll(ANY_DIGIT_REGEX + "/*", "");
        StringBuilder sb = new StringBuilder(documentWithoutDigits)
                .insert(documentWithoutDigits.length() - 1, "/");
        if (isDocumentAppliesRequiredFormat(document)) {
            System.out.println(sb);
        } else {
            System.out.println(INCORRECT_DOCUMENT_FORMAT_MSG);
        }
        return sb.toString();
    }

    public static void printOnlyWordsInCertainFormatInUpperCaseWithStringBuilder(String document) {
        if (isDocumentAppliesRequiredFormat(document)) {
            document = printOnlyWordsInCertainFormat(document);
            StringBuilder sb = new StringBuilder();
            sb.insert(0, "Letters:").append(document);
            System.out.println(sb.toString().toUpperCase());
        } else {
            System.out.println(INCORRECT_DOCUMENT_FORMAT_MSG);
        }
    }

    public static void findAbcSequenceInDocument(String document) {
        boolean isMatches = Pattern
                .compile(Pattern.quote("abc"), Pattern.CASE_INSENSITIVE)
                .matcher(document)
                .find();
        if (isDocumentAppliesRequiredFormat(document)) {
            if (isMatches) {
                System.out.println(document + " contains 'abc or ABC' sequence");
            } else {
                System.out.println(document + " does not contains 'abc or ABC' sequence");
            }
        } else {
            System.out.println(INCORRECT_DOCUMENT_FORMAT_MSG);
        }
    }

    public static void findIfDocumentStartsWith555(String document) {
        if (isDocumentAppliesRequiredFormat(document)) {
            boolean isStarts = document.toLowerCase().startsWith("555");
            if (isStarts) {
                System.out.println(document + " starts with 555 sequence");
            } else {
                System.out.println(document + " does not starts with 555 sequence");
            }
        } else {
            System.out.println(INCORRECT_DOCUMENT_FORMAT_MSG);
        }
    }

    public static void findIfDocumentEndsWith1a2b(String document) {
        boolean isEnds = document.toLowerCase().endsWith("1a2b");
        if (isEnds) {
            System.out.println(document + " ends with 1a2b sequence");
        } else {
            System.out.println(document + " does not starts with 1a2b sequence");
        }
    }

    private static boolean isDocumentAppliesRequiredFormat(String document) {
        Pattern p = Pattern.compile(DOCUMENT_FORMAT);
        return p.matcher(document).matches();
    }
}
