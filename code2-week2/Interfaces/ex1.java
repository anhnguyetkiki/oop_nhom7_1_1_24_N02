// File: AbstractRodent.java
package com.mycompany.app;

abstract class Rodent {
    abstract void gnaw();
    abstract void run();
}

class Mouse extends Rodent {
    @Override
    void gnaw() {
        System.out.println("Mouse gnawing");
    }

    @Override
    void run() {
        System.out.println("Mouse running");
    }
}

class Gerbil extends Rodent {
    @Override
    void gnaw() {
        System.out.println("Gerbil gnawing");
    }

    @Override
    void run() {
        System.out.println("Gerbil running");
    }
}

class Hamster extends Rodent {
    @Override
    void gnaw() {
        System.out.println("Hamster gnawing");
    }

    @Override
    void run() {
        System.out.println("Hamster running");
    }
}

public class AbstractRodentTest {
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
