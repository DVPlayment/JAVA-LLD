package org.example.ATMMachine;

public class Card {
    private Double amount;
    private String type;
    public Card(Double amount, String type) {
        this.amount = amount;
        this.type = type;
    }
    public Double getAmount() {
        return amount;
    }
    public String getType() {
        return type;
    }
}
