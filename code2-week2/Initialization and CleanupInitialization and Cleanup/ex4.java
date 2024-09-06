// File: InitializationCleanupExercise4.java
package com.mycompany.app;

class OverloadedConstructorExample {
    OverloadedConstructorExample() {
        System.out.println("Default constructor called!");
    }

    OverloadedConstructorExample(String message) {
        System.out.println("Overloaded constructor called with message: " + message);
    }
}

public class InitializationCleanupExercise4 {
    public static void main(String[] args) {
        OverloadedConstructorExample example1 = new OverloadedConstructorExample(); // Gọi constructor mặc định
        OverloadedConstructorExample example2 = new OverloadedConstructorExample("Hello, World!"); // Gọi constructor overload
    }
}
