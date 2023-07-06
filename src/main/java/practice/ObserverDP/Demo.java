package practice.ObserverDP;

public class Demo {
    public static void main(String[] args) {
        WeatherObservable wo = new TempObservable();
        WChangeObserver w1 = new RadioObserver("Helloo", wo);
        WChangeObserver w2 = new TVObserver("Wassup",wo);

        wo.addObserver(w1);
        wo.addObserver(w2);

        wo.setData("Hiii");
        wo.setData("");
        wo.setData("qwert");
    }
}
