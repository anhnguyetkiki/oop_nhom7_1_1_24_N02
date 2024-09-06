// File: InitializationCleanupExercise9.java
package com.mycompany.app;

class OverloadedConstructors {
    OverloadedConstructors() {
        this("Default message"); // Gọi constructor thứ hai bằng `this`
        System.out.println("No-argument constructor called");
    }

    OverloadedConstructors(String message) {
        System.out.println("Overloaded constructor called with message: " + message);
    }
}

public class InitializationCleanupExercise9 {
    public static void main(String[] args) {
        OverloadedConstructors oc1 = new OverloadedConstructors(); // Gọi constructor không tham số
        OverloadedConstructors oc2 = new OverloadedConstructors("Custom message"); // Gọi constructor với tham số
    }
}
