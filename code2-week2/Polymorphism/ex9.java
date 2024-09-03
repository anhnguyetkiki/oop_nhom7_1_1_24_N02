// File: RodentHierarchy.java
package com.mycompany.app;

class Rodent {
    public void gnaw() {
        System.out.println("Rodent gnawing");
    }

    public void run() {
        System.out.println("Rodent running");
    }
}

class Mouse extends Rodent {
    @Override
    public void gnaw() {
        System.out.println("Mouse gnawing");
    }

    @Override
    public void run() {
        System.out.println("Mouse running");
    }
}

class Gerbil extends Rodent {
    @Override
    public void gnaw() {
        System.out.println("Gerbil gnawing");
    }

    @Override
    public void run() {
        System.out.println("Gerbil running");
    }
}

class Hamster extends Rodent {
    @Override
    public void gnaw() {
        System.out.println("Hamster gnawing");
    }

    @Override
    public void run() {
        System.out.println("Hamster running");
    }
}

public class PolymorphismExercise9 {
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
