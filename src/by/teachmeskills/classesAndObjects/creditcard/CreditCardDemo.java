package by.teachmeskills.classesAndObjects.creditcard;

import java.util.Scanner;

public class CreditCardDemo {
    private static final String SUM_TO_ADD_MESSAGE = "Enter sum to add for the cards: ";
    private static final String SUM_TO_WITHDRAW_MESSAGE = "Enter sum to withdraw from the card: ";

    public static void main(String[] args) {
        CreditCard firstCreditCard = new CreditCard("1");
        CreditCard secondCreditCard = new CreditCard("2");
        CreditCard thirdCreditCard = new CreditCard("3");

        Scanner scanner = new Scanner(System.in);
        System.out.print(SUM_TO_ADD_MESSAGE);
        int sumToAdd = scanner.nextInt();
        CreditCard[] creditCards = {firstCreditCard, secondCreditCard, thirdCreditCard};
        addSumToCreditCardsAndPrintBalance(creditCards, sumToAdd);
        System.out.print(SUM_TO_WITHDRAW_MESSAGE);
        int sumToWithDraw = scanner.nextInt();
        thirdCreditCard.withDrawSumFromCard(sumToWithDraw);
        thirdCreditCard.printCurrentBalanceOfCard();
    }

    private static void addSumToCreditCardsAndPrintBalance(CreditCard[] creditCards, int sumToAdd) {
        for (CreditCard creditCard : creditCards) {
            creditCard.addSumToCard(sumToAdd);
            creditCard.printCurrentBalanceOfCard();
        }
    }
}
