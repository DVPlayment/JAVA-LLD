package org.example.MovieTicketBookingSystem.Enums;

public enum SeatType {
    GOLD("gold"),
    SILVER("silver"),
    PLATINUM("platinum");

    public final String value;

    SeatType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
