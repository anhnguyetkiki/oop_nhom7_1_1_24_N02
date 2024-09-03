// File: AccessControlExercise5.java
package com.mycompany.app;

class StaticFieldExample {
    private static int staticCounter = 0;

    public static int getStaticCounter() {
        return staticCounter;
    }

    public static void incrementCounter() {
        staticCounter++;
    }
}

public class AccessControlExercise5 {
    public static void main(String[] args) {
        System.out.println("Initial Counter: " + StaticFieldExample.getStaticCounter());

        StaticFieldExample.incrementCounter();
        StaticFieldExample.incrementCounter();

        System.out.println("Counter after increments: " + StaticFieldExample.getStaticCounter());
    }
}
