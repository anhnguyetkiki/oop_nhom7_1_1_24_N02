// File: ReferenceCountingWithFinalize.java
package com.mycompany.app;

class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;
    
    Shared() {
        System.out.println("Creating " + this);
    }

    void addRef() {
        refcount++;
    }

    protected void finalize() {
        if (refcount > 0) {
            System.out.println("Error: Object is being finalized while still in use!");
        } else {
            System.out.println("Finalizing " + this);
        }
    }

    void dispose() {
        if (--refcount == 0) {
            System.out.println("Disposing " + this);
        }
    }

    public String toString() {
        return "Shared " + id;
    }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    
    Composing(Shared shared) {
        System.out.println("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    protected void finalize() {
        System.out.println("Finalizing " + this);
    }

    void dispose() {
        System.out.println("Disposing " + this);
        shared.dispose();
    }

    public String toString() {
        return "Composing " + id;
    }
}

public class PolymorphismExercise13 {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composing = { 
            new Composing(shared), 
            new Composing(shared), 
            new Composing(shared), 
            new Composing(shared), 
            new Composing(shared) 
        };
        
        for (Composing c : composing) {
            c.dispose();
        }
        System.gc(); // Yêu cầu thu gom rác
    }
}
