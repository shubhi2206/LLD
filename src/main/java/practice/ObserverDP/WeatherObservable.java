package practice.ObserverDP;

import java.util.ArrayList;
import java.util.List;

public interface WeatherObservable {
    void addObserver(WChangeObserver wChangeObserver);
    void deleteObserver(WChangeObserver wChangeObserver);

    void notifyObservers();

    void setData(String msg);

    String getData();
}

class TempObservable implements WeatherObservable{

    List<WChangeObserver> temp = new ArrayList<>();

    String msg = "";
    @Override
    public void addObserver(WChangeObserver wChangeObserver) {
        temp.add(wChangeObserver);
    }

    @Override
    public void deleteObserver(WChangeObserver wChangeObserver) {
        temp.remove(wChangeObserver);
    }

    @Override
    public void notifyObservers() {
        for(WChangeObserver w : temp){
            w.update();
        }
    }

    @Override
    public void setData(String m) {
        if(m.equals(""))
            msg = "";
        else{
            if(msg.length() == 0)
                notifyObservers();
            msg = m;
        }


    }

    @Override
    public String getData() {
        return msg;
    }
}
