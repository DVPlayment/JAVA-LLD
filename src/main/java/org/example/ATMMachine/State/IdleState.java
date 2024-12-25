package org.example.ATMMachine.State;

import org.example.ATMMachine.ATM;
import org.example.ATMMachine.Card;

public class IdleState implements State {

    public IdleState() {
        System.out.println("Atm machine is in idle state");
    }

    public IdleState(ATM atm) {
        atm.removeCard();
        atm.setRequestedAmount(0);
    }

    @Override
    public void insertCard(Card card, ATM atm) throws Exception {
        atm.setCard(card);
        System.out.println("Card inserted!");
    }

    @Override
    public void removeCard(ATM atm) throws Exception {
        atm.removeCard();
    }

    @Override
    public double getBalance() throws Exception  {
        throw new Exception("Cannot fetch balance when ATM machine is in Idle-State");
    }

    @Override
    public void enterAccDetails() throws Exception {
        throw new Exception("Cannot enter acc details when ATM machine is in Idle-State");
    }

    @Override
    public void cancelTransaction() throws Exception  {
        throw new Exception("Cannot cancel txn when ATM machine is in Idle-State");
    }

    @Override
    public void dispenseCash() throws Exception  {
        throw new Exception("Cannot dispense cash when ATM machine is in Idle-State");
    }

    @Override
    public void clickOnEnterDetailsButton(ATM atm) throws Exception {
        // set new state in atm
        atm.setState(new SelectionState());
    }

    @Override
    public void clickOnEnterPinButton(ATM atm) throws Exception {
        throw new Exception("Cannot enter pim when ATM machine is in Idle-State");
    }


}
