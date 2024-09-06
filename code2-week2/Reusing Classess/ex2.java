// File: NewDetergent.java
package com.mycompany.app;

class Cleanser {
    private String s = "Cleanser";
    
    public void append(String a) { s += a; }
    public void dilute() { append(" dilute()"); }
    public void apply() { append(" apply()"); }
    public void scrub() { append(" scrub()"); }
    public String toString() { return s; }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute(); x.apply(); x.scrub();
        System.out.println(x);
    }
}

class Detergent extends Cleanser {
    // Override the scrub() method:
    @Override
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub(); // Call base-class version
    }

    // Add methods to the interface:
    public void foam() { append(" foam()"); }

    // Test the new class:
    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        Cleanser.main(args);
    }
}

public class NewDetergent extends Detergent {
    // Override the scrub() method:
    @Override
    public void scrub() {
        append(" NewDetergent.scrub()");
        super.scrub(); // Call Detergent's version of scrub()
    }

    // Add a new method:
    public void sterilize() {
        append(" sterilize()");
    }

    public static void main(String[] args) {
        NewDetergent nd = new NewDetergent();
        nd.dilute();
        nd.apply();
        nd.scrub();
        nd.foam();
        nd.sterilize();
        System.out.println(nd);
    }
}
