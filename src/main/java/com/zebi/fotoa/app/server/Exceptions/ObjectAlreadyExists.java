package com.zebi.fotoa.app.server.Exceptions;

public class ObjectAlreadyExists extends Exception {

    public ObjectAlreadyExists() { super(); }
    public ObjectAlreadyExists(String message) { super(message); }
    public ObjectAlreadyExists(String message, Throwable cause) { super(message, cause); }
    public ObjectAlreadyExists(Throwable cause) { super(cause); }
}
