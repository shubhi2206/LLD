package org.example.DesignPatterns.ObservableDP;

public class Demo {
    public static void main(String[] args) {
        StockObservable stockObservable = new IphoneStockObservable();
        NotificationObserver n1 = new EmailNotifyObserver("sh@gmail.com",stockObservable);
        NotificationObserver n2 = new MobileAlertObserver("942355677",stockObservable);

        stockObservable.add(n1);
        stockObservable.add(n2);

        stockObservable.setData(5);
        stockObservable.setData(0);
        stockObservable.setData(8);
    }
}
