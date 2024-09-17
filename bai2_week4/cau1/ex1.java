package cau1;
// Base class Cycle

class Cycle {
    void ride() {
        System.out.println("Riding Cycle");
    }
}

// Subclass Unicycle
class Unicycle extends Cycle {
    @Override
    void ride() {
        System.out.println("Riding Unicycle");
    }
}

// Subclass Bicycle
class Bicycle extends Cycle {
    @Override
    void ride() {
        System.out.println("Riding Bicycle");
    }
}

// Subclass Tricycle
class Tricycle extends Cycle {
    @Override
    void ride() {
        System.out.println("Riding Tricycle");
    }
}

// Main class to demonstrate upcasting
public class ex1 {
    public static void main(String[] args) {
        Cycle unicycle = new Unicycle();
        Cycle bicycle = new Bicycle();
        Cycle tricycle = new Tricycle();

        unicycle.ride();
        bicycle.ride();
        tricycle.ride();
    }
}
