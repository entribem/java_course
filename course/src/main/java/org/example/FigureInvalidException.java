package org.example;

public class FigureInvalidException extends RuntimeException {
    public FigureInvalidException(String errorMessage, Throwable cause) {
        super(errorMessage, cause);
    }
}
