package com.prottonne.pattern.facade;

import java.time.LocalDateTime;

public class Hotel {

    private String name;
    private LocalDateTime date;

    public Hotel(String name, LocalDateTime date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

  

}
