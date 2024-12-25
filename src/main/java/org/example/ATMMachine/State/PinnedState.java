package org.example.ATMMachine.State;

import org.example.ATMMachine.ATM;
import org.example.ATMMachine.Card;

public class PinnedState implements State{
    @Override
    public void insertCard(Card card, ATM atm) throws Exception {
        throw new Exception("Invalid");
    }

    @Override
    public void removeCard(ATM atm) throws Exception {
        throw new Exception("Invalid");
    }

    @Override
    public double getBalance(ATM atm) throws Exception {
        throw new Exception("Invalid");
    }

    @Override
    public void enterAccDetails(ATM atm, double amt) throws Exception {
        throw new Exception("Invalid");
    }

    @Override
    public void cancelTransaction(ATM atm) throws Exception {
        atm.setState(new IdleState(atm));
    }

    @Override
    public void dispenseCash(ATM atm) throws Exception {
        throw new Exception("Invalid");
    }

    @Override
    public void clickOnEnterDetailsButton(ATM atm) throws Exception {

    }

    @Override
    public void clickOnEnterPinButton(ATM atm) throws Exception {

    }
}
