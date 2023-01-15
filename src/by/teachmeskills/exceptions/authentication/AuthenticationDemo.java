package by.teachmeskills.exceptions.authentication;

public class AuthenticationDemo {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        Authentication auth = new Authentication();
        try {
            auth.setLogin("LoginWithBigAmountOfSymbols");
        } catch (WrongLoginException e) {
            System.out.println(e);
        }
        try {
            auth.setPassword("PasswordWithNumber1");
        } catch (WrongPasswordException e) {
            System.out.println(e);
        }
        auth.setPassword("PassNotIgnored1");
        auth.setLogin("LoginNotIgnored");
        auth.setLogin("Login with space");
        auth.setPassword("Ignored");
    }
}
