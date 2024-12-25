package org.example.ATMMachine.State;

import org.example.ATMMachine.ATM;
import org.example.ATMMachine.Card;

public interface State {
    void insertCard(Card card, ATM atm) throws Exception;
    void removeCard(ATM atm) throws Exception;
    double getBalance(ATM atm) throws Exception;
    void enterAccDetails(ATM atm, double amt) throws Exception;
    void cancelTransaction(ATM atm) throws Exception;
    void dispenseCash(ATM atm) throws Exception;
    void clickOnEnterDetailsButton(ATM atm) throws Exception;
    void clickOnEnterPinButton(ATM atm) throws Exception;
}
