// File: com/mycompany/interfaces/Rodent.java
package com.mycompany.interfaces;

public interface Rodent {
    void gnaw();
    void run();
}

class Mouse implements Rodent {
    @Override
    public void gnaw() {
        System.out.println("Mouse gnawing");
    }

    @Override
    public void run() {
        System.out.println("Mouse running");
    }
}

class Gerbil implements Rodent {
    @Override
    public void gnaw() {
        System.out.println("Gerbil gnawing");
    }

    @Override
    public void run() {
        System.out.println("Gerbil running");
    }
}

class Hamster implements Rodent {
    @Override
    public void gnaw() {
        System.out.println("Hamster gnawing");
    }

    @Override
    public void run() {
        System.out.println("Hamster running");
    }
}

public class InterfaceRodentTest {
    public static void main(String[] args) {
        Rodent[] rodents = {
            new Mouse(),
            new Gerbil(),
            new Hamster()
        };

        for (Rodent rodent : rodents) {
            rodent.gnaw();
            rodent.run();
        }
    }
}
