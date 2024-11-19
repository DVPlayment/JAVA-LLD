package org.example.CarRentalSystem;

import java.util.UUID;

public class Payment {
    private UUID id;
    private Bill bill;
    public Payment(Bill bill) {
        this.id = UUID.randomUUID();
        this.bill = bill;
    }

    public void pay() {
        double cost = bill.CalculateHourlyCost();
        // pay logic; pay via UPI, Cash , Card etc. we will need to have enums, and payment strategy which needs to be passed at runtime
    }
}
