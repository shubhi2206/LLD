package practice.ObserverDP;

public interface WChangeObserver {
    void update();
}

class TVObserver implements WChangeObserver{

    WeatherObservable weatherObservable;
    String msg;

    public TVObserver(String msg, WeatherObservable wo){
        this.weatherObservable = wo;
        this.msg = msg;
    }

    @Override
    public void update() {
        sendingMsg(msg);
    }

    private void sendingMsg(String msg){
        System.out.println("Msg from TV : "+msg);
    }
}

class RadioObserver implements WChangeObserver{

    WeatherObservable weatherObservable;
    String msg;

    public RadioObserver(String msg, WeatherObservable wo){
        this.weatherObservable = wo;
        this.msg = msg;
    }

    @Override
    public void update() {
        sendingMsg(msg);
    }

    private void sendingMsg(String msg){
        System.out.println("Msg from Radio : "+msg);
    }
}
