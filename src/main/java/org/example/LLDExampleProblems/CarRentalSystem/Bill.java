package org.example.LLDExampleProblems.CarRentalSystem;

public class Bill{
    Reservation reservation;
    boolean isPaid;
    double amount;

    Bill(Reservation reservation){
        this.reservation = reservation;
        this.amount = payBill();
        this.isPaid = false;
    }

    private double payBill() {
        return 100.0;
    }
}
