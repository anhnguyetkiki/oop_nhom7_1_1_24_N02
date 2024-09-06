// File: BaseDerivedExample.java
package com.mycompany.app;

class BaseClass {
    BaseClass() {
        System.out.println("BaseClass constructor called");
    }
}

class DerivedClass extends BaseClass {
    DerivedClass() {
        System.out.println("DerivedClass constructor called");
    }
}

public class InitializationCleanupExercise4 {
    public static void main(String[] args) {
        DerivedClass dc = new DerivedClass(); // Tạo đối tượng của DerivedClass
    }
}

