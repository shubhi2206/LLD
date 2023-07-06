package org.example.DesignPatterns.AbstractDP;

public interface CheckBox {
    void check();
}

class MacCheckBox implements CheckBox{

    @Override
    public void check() {
        System.out.println("Mac Checkbox");
    }
}

class WinCheckBox implements CheckBox{

    @Override
    public void check() {
        System.out.println("Windows Checkbox");
    }
}
