// File: InitializationCleanupExercise2.java
package com.mycompany.app;

class StringInitializationExample {
    String initializedAtDefinition = "Initialized at definition"; // Khởi tạo tại điểm khai báo
    String initializedInConstructor;

    StringInitializationExample() {
        initializedInConstructor = "Initialized in constructor"; // Khởi tạo trong constructor
    }

    void printValues() {
        System.out.println("Initialized at definition: " + initializedAtDefinition);
        System.out.println("Initialized in constructor: " + initializedInConstructor);
    }
}

public class InitializationCleanupExercise2 {
    public static void main(String[] args) {
        StringInitializationExample example = new StringInitializationExample();
        example.printValues();
    }
}
