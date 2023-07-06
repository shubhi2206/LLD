package org.example.DesignPatterns.AbstractDP;

public interface Button {
    void paint();
}

class MacButton implements Button{

    @Override
    public void paint() {
        System.out.println("Mac Button");
    }
}

class WinButton implements Button{

    @Override
    public void paint() {
        System.out.println("Windows Button");
    }
}
