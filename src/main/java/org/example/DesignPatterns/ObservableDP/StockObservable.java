package org.example.DesignPatterns.ObservableDP;

import java.util.ArrayList;
import java.util.List;

public interface StockObservable {
    void add(NotificationObserver notificationObserver);
    void remove(NotificationObserver notificationObserver);

    void notifyObservers();

    void setData(int count);

    int getData();
}

class IphoneStockObservable implements StockObservable{

    List<NotificationObserver> stocks = new ArrayList<>();
    int stockCount;
    @Override
    public void add(NotificationObserver notificationObserver) {
        stocks.add(notificationObserver);
    }

    @Override
    public void remove(NotificationObserver notificationObserver) {
        stocks.remove(notificationObserver);
    }

    @Override
    public void notifyObservers() {
        for(NotificationObserver n : stocks){
            n.update();
        }
    }

    @Override
    public void setData(int count) {
        if(count == 0)
            stockCount = 0;
        else{
            if(stockCount == 0)
                notifyObservers();
            stockCount += count;
        }

    }

    @Override
    public int getData() {
        return stockCount;
    }

}
