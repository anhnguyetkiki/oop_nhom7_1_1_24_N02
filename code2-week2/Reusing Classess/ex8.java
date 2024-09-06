// File: BaseDerivedConstructors.java
package com.mycompany.app;

class BaseClass {
    BaseClass(int i) {
        System.out.println("BaseClass constructor called with argument: " + i);
    }
}

class DerivedClass extends BaseClass {
    DerivedClass() {
        super(0); // Gọi constructor của BaseClass với giá trị mặc định
        System.out.println("Default constructor of DerivedClass called");
    }

    DerivedClass(int i) {
        super(i); // Gọi constructor của BaseClass với giá trị truyền vào
        System.out.println("Non-default constructor of DerivedClass called with argument: " + i);
    }
}

public class InitializationCleanupExercise8 {
    public static void main(String[] args) {
        DerivedClass d1 = new DerivedClass(); // Gọi constructor mặc định
        DerivedClass d2 = new DerivedClass(42); // Gọi constructor không mặc định
    }
}
