package com.prottonne.pattern.exception;

/**
 *
 * @author jose
 */
public class DocumentCreatorException extends RuntimeException {

    public DocumentCreatorException() {
        super();
    }

    public DocumentCreatorException(String message) {
        super(message);
    }

    public DocumentCreatorException(String message, Throwable cause) {
        super(message, cause);
    }

    public DocumentCreatorException(Throwable cause) {
        super(cause);
    }
}
