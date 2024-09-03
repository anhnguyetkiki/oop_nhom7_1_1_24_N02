// File: Cycle.java
package com.mycompany.app;

class Cycle {
    void ride() {
        System.out.println("Riding a Cycle");
    }
}

class Unicycle extends Cycle {
    @Override
    void ride() {
        System.out.println("Riding a Unicycle");
    }
}

class Bicycle extends Cycle {
    @Override
    void ride() {
        System.out.println("Riding a Bicycle");
    }
}

class Tricycle extends Cycle {
    @Override
    void ride() {
        System.out.println("Riding a Tricycle");
    }
}

public class PolymorphismExercise1 {
    public static void main(String[] args) {
        Cycle c1 = new Unicycle(); // Upcast Unicycle to Cycle
        Cycle c2 = new Bicycle();  // Upcast Bicycle to Cycle
        Cycle c3 = new Tricycle(); // Upcast Tricycle to Cycle

        c1.ride(); // Calls Unicycle.ride()
        c2.ride(); // Calls Bicycle.ride()
        c3.ride(); // Calls Tricycle.ride()
    }
}
