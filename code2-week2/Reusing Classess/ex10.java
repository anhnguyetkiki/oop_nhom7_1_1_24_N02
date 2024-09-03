// File: RootAndStemWithArgs.java
package com.mycompany.app;

class Component1 {
    Component1(int i) {
        System.out.println("Component1 constructor called with argument: " + i);
    }
}

class Component2 {
    Component2(int i) {
        System.out.println("Component2 constructor called with argument: " + i);
    }
}

class Component3 {
    Component3(int i) {
        System.out.println("Component3 constructor called with argument: " + i);
    }
}

class Root {
    Component1 c1;
    Component2 c2;
    Component3 c3;

    Root(int i) {
        c1 = new Component1(i);
        c2 = new Component2(i);
        c3 = new Component3(i);
        System.out.println("Root constructor called with argument: " + i);
    }
}

class Stem extends Root {
    Component1 c1;
    Component2 c2;
    Component3 c3;

    Stem(int i) {
        super(i);
        c1 = new Component1(i);
        c2 = new Component2(i);
        c3 = new Component3(i);
        System.out.println("Stem constructor called with argument: " + i);
    }
}

public class InitializationCleanupExercise10 {
    public static void main(String[] args) {
        Stem s = new Stem(42);
    }
}
