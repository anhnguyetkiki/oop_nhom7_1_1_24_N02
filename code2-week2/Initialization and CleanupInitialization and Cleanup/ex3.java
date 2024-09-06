// File: InitializationCleanupExercise3.java
package com.mycompany.app;

class DefaultConstructorExample {
    DefaultConstructorExample() {
        System.out.println("Default constructor called!");
    }
}

public class InitializationCleanupExercise3 {
    public static void main(String[] args) {
        DefaultConstructorExample example = new DefaultConstructorExample(); // Tạo đối tượng và gọi constructor mặc định
    }
}
