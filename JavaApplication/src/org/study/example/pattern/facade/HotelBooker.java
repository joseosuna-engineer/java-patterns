package org.study.example.pattern.facade;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HotelBooker {

    public List<Hotel> getHotelsFor(Date from, Date to) {
        // returns hotels availble in the particular date range
        Hotel hotel = new Hotel("New York Marriot Marquis", new Date());
        List<Hotel> hotels = new ArrayList<>();
        hotels.add(hotel);

        return hotels;
    }
}
