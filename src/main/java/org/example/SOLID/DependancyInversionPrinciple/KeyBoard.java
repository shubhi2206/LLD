package org.example.SOLID.DependancyInversionPrinciple;

import java.security.Key;

interface KeyBoard {
    void printKeys();
}

class WiredKeyBoard implements KeyBoard{

    @Override
    public void printKeys() {
        System.out.println("It is a wired Keyboard");
    }
}

class WirelessBoard implements KeyBoard{

    @Override
    public void printKeys() {
        System.out.println("It is a wireless Keyboard");
    }
}
