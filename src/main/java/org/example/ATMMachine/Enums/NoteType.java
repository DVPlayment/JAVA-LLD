package org.example.ATMMachine.Enums;

public enum NoteType {
    TWO_THOUSAND(2000),
    FIVE_HUNDRED(500),
    HUNDRED(100);

    private final int value;

    NoteType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
