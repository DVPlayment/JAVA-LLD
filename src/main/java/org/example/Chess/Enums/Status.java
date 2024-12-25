package org.example.Chess.Enums;

public enum Status {
    ALIVE("alive"),
    KILLED("killed");

    private final String value;
    Status(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
