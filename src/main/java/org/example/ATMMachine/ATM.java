package org.example.ATMMachine;

import org.example.ATMMachine.Dispenser.NoteDispenseSystem;
import org.example.ATMMachine.State.State;

public class ATM {
    private State state;
    private NoteDispenseSystem noteDispenser;
    private Card card;
    private double requestedAmount;

    public ATM(NoteDispenseSystem noteDispenser) {
        this.noteDispenser = noteDispenser;
    }

    public State getState() {
        return state;
    }
    public void setState(State state) {
        this.state = state;
    }

    public Double getCardBalance() {
        return card.getAmount();
    }

    public void removeCard() {
        this.card = null;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public void setRequestedAmount(double requestedAmount) {
        this.requestedAmount = requestedAmount;
    }
}
