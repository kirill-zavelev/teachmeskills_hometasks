package by.teachmeskills.oop.phone;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone firstPhone = new Phone();
        firstPhone.getNumber();
        firstPhone.receiveCall("Name", "+375291112221");
        Phone secondPhone = new Phone("+375291112222", "Nokia");
        String numberOfSecondPhone = secondPhone.getNumber();
        secondPhone.receiveCall("Name2");
        Phone thirdPhone = new Phone(numberOfSecondPhone, "Siemens", 433.3);
        String[] numbers = {"+3751", "+3752", "+3753"};
        thirdPhone.sendMessage(numbers);
    }
}
