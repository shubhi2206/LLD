package org.example.LLDExampleProblems.CarRentalSystem;

import org.example.LLDExampleProblems.CarRentalSystem.Product.Vehicle;
import org.example.LLDExampleProblems.CarRentalSystem.Product.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> users= addUsers();
        List<Vehicle> vehicles = addVehicles();
        List<Store> stores = addStores(vehicles);

        VehicleRentalSystem vehicleRentalSystem = new VehicleRentalSystem(users,stores);
        //User comes
        User user1 = users.get(0);

        //User gets location
        Location location = new Location(403012, "Bangalore", "Karnataka", "India");
        Store store = vehicleRentalSystem.getStore(location);

        //Get Vehicles
        List<Vehicle> storeVehicles = store.getVehicles(VehicleType.CAR);

        //Create Reservation
        Reservation reservation = store.createReservation(user1,storeVehicles.get(0));

        //Generate bill
        Bill bill = new Bill(reservation);

        //Paymwnt
        Payment payment = new Payment();
        payment.payBill(bill);

        //Close reservation
        store.completeReservation(reservation.reserveId);



    }

    public static List<User> addUsers(){
        List<User> users = new ArrayList<>();
        User user1 = new User();
        user1.setUserId(1);
        users.add(user1);
        return users;

    }

    public static List<Vehicle> addVehicles(){
        List<Vehicle> vehicles = new ArrayList<>();
        Vehicle v = new Vehicle();
        v.setVehicleId(1);
        v.setVehicleType(VehicleType.CAR);
        vehicles.add(v);

        Vehicle v1 = new Vehicle();
        v1.setVehicleId(2);
        v1.setVehicleType(VehicleType.CAR);
        vehicles.add(v1);
        return vehicles;
    }

    public static List<Store> addStores(List<Vehicle> vehicles){
        List<Store> stores = new ArrayList<>();
        Store store1 = new Store();
        store1.storeId=1;
        store1.setVehicles(vehicles);

        stores.add(store1);
        return stores;

    }
}
