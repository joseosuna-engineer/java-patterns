package org.study.example.pattern.facade;

import java.util.ArrayList;
import java.util.List;

public class FlightsAndHotels {

    private List<Flight> flights;

    private List<Hotel> hotels;

    public FlightsAndHotels() {
        flights = new ArrayList<>();
        hotels = new ArrayList<>();
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    public List<Hotel> getHotels() {
        return hotels;
    }

    public void setHotels(List<Hotel> hotels) {
        this.hotels = hotels;
    }

}
