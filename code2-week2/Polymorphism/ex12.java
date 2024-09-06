// File: RodentHierarchyWithInitialization.java
package com.mycompany.app;

class Rodent {
    private Tail tail = new Tail("Rodent");
    
    Rodent() {
        System.out.println("Rodent constructor");
    }

    public void gnaw() {
        System.out.println("Rodent gnawing");
    }

    public void run() {
        System.out.println("Rodent running");
    }
}

class Tail {
    Tail(String s) {
        System.out.println("Creating Tail in " + s);
    }
}

class Mouse extends Rodent {
    private Tail tail = new Tail("Mouse");
    
    Mouse() {
        System.out.println("Mouse constructor");
    }

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
    private Tail tail = new Tail("Gerbil");

    Gerbil() {
        System.out.println("Gerbil constructor");
    }

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
    private Tail tail = new Tail("Hamster");

    Hamster() {
        System.out.println("Hamster constructor");
    }

    @Override
    public void gnaw() {
        System.out.println("Hamster gnawing");
    }

    @Override
    public void run() {
        System.out.println("Hamster running");
    }
}

public class PolymorphismExercise12 {
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
