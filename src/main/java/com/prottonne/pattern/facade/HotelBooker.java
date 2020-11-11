package com.prottonne.pattern.facade;

import com.prottonne.pattern.util.Utils;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class HotelBooker {

    public List<Hotel> getHotelsFor(LocalDateTime from, LocalDateTime to) {

        List<Hotel> hotels = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Hotel hotel = getHotel();
            if (Utils.isBetween(hotel.getDate(), from, to)) {
                hotels.add(hotel);
            }
        }

        return hotels;
    }

    private Hotel getHotel() {
        LocalDateTime now = LocalDateTime.now();
        Integer thisYear = now.getYear();
        Integer nextYear = thisYear + 1;
        LocalDateTime randomDate = Utils.createRandomDate(thisYear, nextYear);
        return new Hotel("New York Marriot Marquis", randomDate);
    }

}
