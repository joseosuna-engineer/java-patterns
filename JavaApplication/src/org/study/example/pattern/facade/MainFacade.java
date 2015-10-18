package org.study.example.pattern.facade;

import java.util.Date;
import java.util.List;

public class MainFacade {

    public static void main(String[] args) {
        try {
            Date from = new Date();
            Date to = new Date();
            TravelFacade travelFacade = new TravelFacade();
            FlightsAndHotels flightsAndHotels = travelFacade.getFlightsAndHotels(from, to);
            List<Flight> flights = flightsAndHotels.getFlights();
            List<Hotel> hotels = flightsAndHotels.getHotels();

            System.out.println("Flights:");
            for (Flight flight : flights) {
                System.out.println("Flight: " + flight.getNumber());
                System.out.println("Date: " + flight.getDate());
            }
            System.out.println("Hotels:");
            for (Hotel hotel : hotels) {
                System.out.println("Hotel: " + hotel.getName());
                System.out.println("Date: " + hotel.getDate());
            }
        } catch (Exception e) {
        }

    }
}
