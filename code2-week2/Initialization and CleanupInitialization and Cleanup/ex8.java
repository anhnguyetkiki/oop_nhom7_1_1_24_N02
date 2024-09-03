// File: InitializationCleanupExercise8.java
package com.mycompany.app;

class MethodCallingExample {
    void secondMethod() {
        System.out.println("secondMethod called!");
    }

    void firstMethod() {
        // Gọi phương thức thứ hai không sử dụng `this`
        secondMethod();

        // Gọi phương thức thứ hai sử dụng `this`
        this.secondMethod();
    }
}

public class InitializationCleanupExercise8 {
    public static void main(String[] args) {
        MethodCallingExample example = new MethodCallingExample();
        example.firstMethod(); // Gọi firstMethod
    }
}
