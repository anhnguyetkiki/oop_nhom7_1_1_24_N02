package cau1;
public // Unicycle with balance() method
class Unicycle extends Cycle {
    @Override
    void ride() {
        System.out.println("Riding Unicycle");
    }

    void balance() {
        System.out.println("Balancing Unicycle");
    }
}

// Bicycle with balance() method
class Bicycle extends Cycle {
    @Override
    void ride() {
        System.out.println("Riding Bicycle");
    }

    void balance() {
        System.out.println("Balancing Bicycle");
    }
}

// Main class to test behavior
public class Main {
    public static void main(String[] args) {
        Cycle[] cycles = new Cycle[3];
        cycles[0] = new Unicycle();
        cycles[1] = new Bicycle();
        cycles[2] = new Tricycle();

        // Attempting to call balance() on each type of Cycle
        for (Cycle c : cycles) {
            if (c instanceof Unicycle) {
                ((Unicycle) c).balance();
            } else if (c instanceof Bicycle) {
                ((Bicycle) c).balance();
            } else {
                System.out.println("No balance method for " + c.getClass().getSimpleName());
            }
        }
    }
}
 {
    
}
