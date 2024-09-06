// File: RootAndStem.java
package com.mycompany.app;

class Component1 {
    Component1() {
        System.out.println("Component1 constructor called");
    }
}

class Component2 {
    Component2() {
        System.out.println("Component2 constructor called");
    }
}

class Component3 {
    Component3() {
        System.out.println("Component3 constructor called");
    }
}

class Root {
    Component1 c1 = new Component1();
    Component2 c2 = new Component2();
    Component3 c3 = new Component3();

    Root() {
        System.out.println("Root constructor called");
    }
}

class Stem extends Root {
    Component1 c1 = new Component1();
    Component2 c2 = new Component2();
    Component3 c3 = new Component3();

    Stem() {
        System.out.println("Stem constructor called");
    }
}

public class InitializationCleanupExercise9 {
    public static void main(String[] args) {
        Stem s = new Stem();
    }
}
