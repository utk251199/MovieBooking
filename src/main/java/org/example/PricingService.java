package org.example;

import java.util.List;

public class PricingService {

    public double calculateTotalPrice(List<Seat> seats) {
        double basePrice = 200.0;
        return seats.stream()
                .mapToDouble(seat -> basePrice * getPriceMultiplier(seat.getSeatCategory()))
                .sum();
    }

    private static double getPriceMultiplier(SeatCategory category) {
        return switch (category) {
            case CLASSIC -> 1.0;
            case GOLD -> 1.5;
            case RECLINER -> 2.0;
        };
    }
}
