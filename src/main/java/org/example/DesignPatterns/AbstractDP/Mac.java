package org.example.DesignPatterns.AbstractDP;

public class Mac implements GuiFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new MacCheckBox();
    }
}
