package org.example.ATMMachine.State;

import org.example.ATMMachine.ATM;
import org.example.ATMMachine.Card;

public class SelectionState implements State{

    public SelectionState() {
        System.out.println("ATM in selection state");
    }

    @Override
    public void insertCard(Card card, ATM atm) throws Exception {
        throw new Exception("Cannot insert card when ATM machine is in selection-State");
    }

    @Override
    public void removeCard(ATM atm) throws Exception {
        throw new Exception("Cannot remove card when ATM machine is in Selection-State");
    }

    @Override
    public double getBalance(ATM atm) throws Exception  {
        return atm.getCardBalance();
    }

    @Override
    public void enterAccDetails(double amt, ATM atm) throws Exception {
        System.out.println("Enter details of account");
        if (atm.getCardBalance() < amt ) {
            System.out.println("Insufficient balance");
            cancelTransaction(atm);
        } else {
            atm.setRequestedAmount(amt);
        }
    }

    @Override
    public void cancelTransaction(ATM atm) throws Exception  {
        atm.setState(new IdleState(atm));
    }

    @Override
    public void dispenseCash() throws Exception  {
        throw new Exception("Cannot dispense cash when ATM machine is in Selection-State");
    }

    @Override
    public void clickOnEnterDetailsButton(ATM atm) throws Exception {
        throw new Exception("Invalid");
    }

    @Override
    public void clickOnEnterPinButton(ATM atm) throws Exception {
        atm.setState(new PinnedState());
    }
}
