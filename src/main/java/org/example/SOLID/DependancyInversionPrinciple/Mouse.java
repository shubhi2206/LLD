package org.example.SOLID.DependancyInversionPrinciple;

public interface Mouse {
    void mouseType();
}

class WiredMouse implements Mouse{

    @Override
    public void mouseType() {
        System.out.println("This is a wired mouse");
    }
}

class WirelessMouse implements Mouse{

    @Override
    public void mouseType() {
        System.out.println("This is a wire less mouse");
    }
}

// This class does not satisfy Dependency Inversion principle as it depends on concrete classes
class Laptop{
    private WiredKeyBoard wiredKeyBoard;
    private WiredMouse wiredMouse;

    public Laptop(WiredKeyBoard wiredKeyBoard, WiredMouse wiredMouse){
        this.wiredKeyBoard = wiredKeyBoard;
        this.wiredMouse = wiredMouse;
    }
}

class Macbook{
    private KeyBoard keyBoard;
    private Mouse mouse;

    public Macbook(KeyBoard keyBoard, Mouse mouse){
        this.keyBoard = keyBoard;
        this.mouse = mouse;
    }
}
