package org.study.example.pattern.facade;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlightBooker {

    public List<Flight> getFlightsFor(Date from, Date to) {
        // returns flights  availble in the particular date range
        Flight flight = new Flight("KL 5299", new Date());
        List<Flight> flights;
        flights = new ArrayList<>();
        flights.add(flight);

        return flights;
    }
}
