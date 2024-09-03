// File: CycleWithWheels.java
package com.mycompany.app;

class Cycle {
    void ride() {
        System.out.println("Riding a Cycle with " + wheels() + " wheels");
    }

    int wheels() {
        return 0; // Default implementation
    }
}

class Unicycle extends Cycle {
    @Override
    int wheels() {
        return 1;
    }

    @Override
    void ride() {
        System.out.println("Riding a Unicycle with " + wheels() + " wheel");
    }
}

class Bicycle extends Cycle {
    @Override
    int wheels() {
        return 2;
    }

    @Override
    void ride() {
        System.out.println("Riding a Bicycle with " + wheels() + " wheels");
    }
}

class Tricycle extends Cycle {
    @Override
    int wheels() {
        return 3;
    }

    @Override
    void ride() {
        System.out.println("Riding a Tricycle with " + wheels() + " wheels");
    }
}

public class PolymorphismExercise5 {
    public static void main(String[] args) {
        Cycle[] cycles = { new Unicycle(), new Bicycle(), new Tricycle() };
        for (Cycle cycle : cycles) {
            cycle.ride();
        }
    }
}
