package org.example.SOLID.SingleResponsibility;
// A class should have only single reason to change

public class Marker {
    String name;
    String color;
    int price;

    public Marker(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }
}

class Invoice{
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal(){
        int price = marker.price * this.quantity;
        return price;
    }

    public void printInvoice(){
        //Print the invoice
    }

    public void saveToDB(){
        //Save to DB
    }
}

//Here class Invoice can change on multiple occasions like change in calculation, change in printing logic or saving to File etc.
// Thus it does not follow SOLID Principle. To make it cohesive, we should divide the responsibility into multiple classes.

class InvoiceCal{
    private Marker marker;
    private int quantity;

    public InvoiceCal(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal(){
        int price = marker.price * this.quantity;
        return price;
    }
}

class InvoiceDao{
    private Invoice invoice;

    public InvoiceDao(Invoice invoice){
        this.invoice = invoice;
    }

    public void saveToDB(){
        //Save to DB
    }

}

class InvoicePrint{
    private Invoice invoice;

    public InvoicePrint(Invoice invoice){
        this.invoice = invoice;
    }

    public void printInvoice(){
        //Print the invoice
    }
}
