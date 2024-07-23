package org.example.pruebaspringai.model;

public class Request {

    private String message;

    public Request(String message) {
        this.message = message;
    }

    public Request() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
