package org.example.LLDExampleProblems.CarRentalSystem;

import org.example.LLDExampleProblems.CarRentalSystem.Product.Vehicle;
import org.example.LLDExampleProblems.CarRentalSystem.Product.VehicleType;

import java.util.List;

public class Store {
    int storeId;
    VehicleInventoryManagement vim;
    Location location;
    List<Reservation> reservationList;

    public List<Vehicle> getVehicles(VehicleType vehicleType){
        return vim.getVehicles();
    }

    public void setVehicles(List<Vehicle> v){
        vim = new VehicleInventoryManagement(v);
    }

    public Reservation createReservation(User user, Vehicle v){
        Reservation reservation = new Reservation();
        reservation = createReservation(user,v);
        reservationList.add(reservation);
        return reservation;
    }

    public boolean completeReservation(int reservationID) {

        //take out the reservation from the list and call complete the reservation method.
        return true;
    }

}
