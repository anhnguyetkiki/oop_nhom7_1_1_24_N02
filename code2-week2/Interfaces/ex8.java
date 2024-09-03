// File: com/mycompany/interfaces/FastFood.java
package com.mycompany.interfaces;

public interface FastFood {
    void prepareIngredients();
    void cook();
    void serve();
}
// File: com/mycompany/polymorphism/Sandwich.java
package com.mycompany.polymorphism;

import com.mycompany.interfaces.FastFood;

class Meal {
    Meal() {
        System.out.println("Meal()");
    }
}

class Bread {
    Bread() {
        System.out.println("Bread()");
    }
}

class Cheese {
    Cheese() {
        System.out.println("Cheese()");
    }
}

class Lettuce {
    Lettuce() {
        System.out.println("Lettuce()");
    }
}

class Pickle {
    Pickle() {
        System.out.println("Pickle()");
    }
}

class Lunch extends Meal {
    Lunch() {
        System.out.println("Lunch()");
    }
}

class PortableLunch extends Lunch {
    PortableLunch() {
        System.out.println("PortableLunch()");
    }
}

public class Sandwich extends PortableLunch implements FastFood {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    private Pickle p = new Pickle();

    public Sandwich() {
        System.out.println("Sandwich()");
    }

    @Override
    public void prepareIngredients() {
        System.out.println("Preparing ingredients for Sandwich");
    }

    @Override
    public void cook() {
        System.out.println("Cooking Sandwich");
    }

    @Override
    public void serve() {
        System.out.println("Serving Sandwich");
    }

    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich();
        sandwich.prepareIngredients();
        sandwich.cook();
        sandwich.serve();
    }
}
