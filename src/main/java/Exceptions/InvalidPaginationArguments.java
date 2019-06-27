package Exceptions;

public class InvalidPaginationArguments extends Exception {

    public InvalidPaginationArguments() {}

    public InvalidPaginationArguments(String message) {
        super(message);
    }
}