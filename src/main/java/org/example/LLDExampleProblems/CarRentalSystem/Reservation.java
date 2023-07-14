package org.example.LLDExampleProblems.CarRentalSystem;

import org.example.LLDExampleProblems.CarRentalSystem.Product.Vehicle;

import java.util.Date;

public class Reservation {
    int reserveId;
    User user;
    Vehicle v;
    Date dateOfBooking;
    Date bookFrom;
    Date bookTill;
    Location pickUp;
    Location drop;

    public int createReserve(User user, Vehicle vehicle){

        //generate new id
        reserveId = 12232;
        this.user=user;
        this.v=vehicle;

        return reserveId;
    }

}
