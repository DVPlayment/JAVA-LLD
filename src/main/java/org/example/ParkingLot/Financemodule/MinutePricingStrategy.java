package org.example.ParkingLot.Financemodule;

public class MinutePricingStrategy implements PriceStrategy{

    private final double minuteRate;

    public MinutePricingStrategy(double minuteRate) {
        this.minuteRate = minuteRate;
    }

    @Override
    public double getCost(long timeTakenInMillis) {
        double timeInMinutes = timeTakenInMillis / (1000.0 * 60);
        return timeInMinutes * minuteRate;
    }
}
