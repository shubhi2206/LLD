package org.example.DesignPatterns.AbstractDP;

public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(GuiFactory g){
        this.button = g.createButton();
        this.checkBox = g.createCheckbox();
    }

    public void activity(){
        button.paint();
        checkBox.check();
    }
}

class Demo{
    public static void main(String[] args) {
        Application application = new Application(new Windows());
        application.activity();
    }
}
