package com.prottonne.pattern.facade;

import java.time.LocalDateTime;

public class Flight {

    private String number;
    private LocalDateTime date;

    public Flight(String number, LocalDateTime date) {
        this.number = number;
        this.date = date;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

}
