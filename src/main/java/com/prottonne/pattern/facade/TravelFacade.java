package com.prottonne.pattern.facade;

import java.time.LocalDateTime;
import java.util.List;

public class TravelFacade {

    private final FlightBooker flightBooker;
    private final HotelBooker hotelBooker;

    public TravelFacade() {
        flightBooker = new FlightBooker();
        hotelBooker = new HotelBooker();
    }

    public FlightsAndHotels getFlightsAndHotels(LocalDateTime from, LocalDateTime to) {

        List<Flight> flights = flightBooker.getFlightsFor(from, to);
        List<Hotel> hotels = hotelBooker.getHotelsFor(from, to);

        FlightsAndHotels flightsAndHotels = new FlightsAndHotels();

        flightsAndHotels.setFlights(flights);
        flightsAndHotels.setHotels(hotels);

        return flightsAndHotels;
    }
}
