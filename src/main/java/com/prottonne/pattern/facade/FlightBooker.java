package com.prottonne.pattern.facade;

import com.prottonne.pattern.util.Utils;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FlightBooker {

    public List<Flight> getFlightsFor(LocalDateTime from, LocalDateTime to) {

        List<Flight> flights = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Flight flight = getFlight();
            if (Utils.isBetween(flight.getDate(), from, to)) {
                flights.add(flight);
            }
        }

        return flights;
    }

    private Flight getFlight() {
        Integer numberFlight = Utils.createRandomIntBetween(20, 5000);
        LocalDateTime now = LocalDateTime.now();
        Integer thisYear = now.getYear();
        Integer nextYear = thisYear + 1;
        LocalDateTime randomDate = Utils.createRandomDate(thisYear, nextYear);
        return new Flight("KL " + numberFlight, randomDate);
    }

}
