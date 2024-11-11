package org.example.ParkingLot.Financemodule;

public class HourlyPricingStrategy implements PriceStrategy{

    private final double hourlyRate;

    public HourlyPricingStrategy(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getCost(long timeTakenInMillis) {
        double timeInHours = timeTakenInMillis / (1000.0 * 60 * 60);
        return timeInHours * hourlyRate;
    }
}
