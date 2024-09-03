// File: BaseDerivedMethodCalls.java
package com.mycompany.app;

class BaseClass {
    void firstMethod() {
        System.out.println("BaseClass firstMethod");
        secondMethod(); // Gọi phương thức thứ hai
    }

    void secondMethod() {
        System.out.println("BaseClass secondMethod");
    }
}

class DerivedClass extends BaseClass {
    @Override
    void secondMethod() {
        System.out.println("DerivedClass secondMethod");
    }
}

public class PolymorphismExercise10 {
    public static void main(String[] args) {
        BaseClass bc = new DerivedClass(); // Upcast về BaseClass
        bc.firstMethod(); // Gọi firstMethod
    }
}
