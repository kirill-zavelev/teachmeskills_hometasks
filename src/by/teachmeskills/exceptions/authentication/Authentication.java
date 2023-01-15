package by.teachmeskills.exceptions.authentication;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Authentication {

    private static final String PASSWORD_NUMBERS_REGEX = "[0-9]";

    private String login;
    private String password;

    public Authentication() {
    }

    public void setLogin(String login) throws WrongLoginException {
        if (login.contains(" ")) {
            throw new WrongLoginException("Login contains space");
        } else if (login.length() > 19) {
            throw new WrongLoginException("Invalid login length");
        } else {
            this.login = login;
            System.out.println("Your login is: " + this.login);
        }
    }

    public void setPassword(String password) throws WrongPasswordException {
        Pattern pattern = Pattern.compile(PASSWORD_NUMBERS_REGEX);
        Matcher matcher = pattern.matcher(password);
        boolean matcherFound = matcher.find();
        if (password.contains(" ")) {
            throw new WrongPasswordException("Password contains space");
        } else if (password.length() > 19) {
            throw new WrongPasswordException("Password length is: " + password.length()
                    + ". It should be < 20 characters");
        } else if (!matcherFound) {
            throw new WrongPasswordException("Password should contains at least one digit");
        } else {
            this.password = password;
            System.out.println("Your password is: " + this.password);
        }
    }

    @Override
    public String toString() {
        return "Authentication credentials{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Authentication)) return false;
        Authentication that = (Authentication) o;
        return login.equals(that.login) && password.equals(that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }
}
