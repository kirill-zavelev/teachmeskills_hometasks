package by.teachmeskills.classesAndObjects.creditcard;

public class CreditCard {
    private static final String NEGATIVE_BALANCE_MESSAGE = "Balance of Credit Card # %s can't be negative. " +
            "Please add sum to card <= current balance\n";
    private static final String BALANCE_MESSAGE = "Balance of Credit Card # %s is %s\n";
    private final String cardNumber;
    private int currentBalance = 0;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void addSumToCard(int sumToAdd) {
        this.currentBalance += sumToAdd;
    }

    public void withDrawSumFromCard(int sumToWithDraw) {
        if (sumToWithDraw > this.currentBalance) {
            System.out.printf(NEGATIVE_BALANCE_MESSAGE, this.cardNumber);
        } else {
            this.currentBalance -= sumToWithDraw;
        }
    }

    public void printCurrentBalanceOfCard() {
        System.out.printf(BALANCE_MESSAGE, this.cardNumber, this.currentBalance);
    }
}
