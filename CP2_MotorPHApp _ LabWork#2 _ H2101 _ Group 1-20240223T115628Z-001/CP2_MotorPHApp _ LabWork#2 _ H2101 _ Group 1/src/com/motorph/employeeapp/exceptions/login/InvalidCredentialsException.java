package java.exceptions.login;

public class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException() {
        super("Invalid credentials");
    }
}