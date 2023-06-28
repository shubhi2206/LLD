package org.example.DesignPatterns.ObservableDP;

public interface NotificationObserver {

    void update();

}

class EmailNotifyObserver implements NotificationObserver{
    StockObservable stockObservable;
    String email;

    public EmailNotifyObserver(String email, StockObservable observable){
        this.email = email;
        this.stockObservable = observable;
    }

    @Override
    public void update() {
        sendEmail(email,"Product available");
    }

    private void sendEmail(String email, String msg){
        System.out.println("mail sent to : " + email);
    }
}

class MobileAlertObserver implements NotificationObserver{
    StockObservable stockObservable;
    String mobNo;

    public MobileAlertObserver(String mobNo, StockObservable observable){
        this.mobNo = mobNo;
        this.stockObservable = observable;
    }

    @Override
    public void update() {
        sendEmail(mobNo,"Product available");
    }

    private void sendEmail(String mobNo, String msg){
        System.out.println("Mobile Alert  : " + mobNo);
    }
}
