package org.example.DesignPatterns.AbstractDP;

public class Windows implements GuiFactory {

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new WinCheckBox();
    }
}
