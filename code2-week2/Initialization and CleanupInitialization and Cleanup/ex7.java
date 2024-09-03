// File: InitializationCleanupExercise7.java
package com.mycompany.app;

class NoConstructorClass {
    // Không có constructor nào được định nghĩa
}

public class InitializationCleanupExercise7 {
    public static void main(String[] args) {
        NoConstructorClass ncc = new NoConstructorClass(); // Gọi constructor mặc định tự động được tạo ra
        System.out.println("Object of NoConstructorClass is created.");
    }
}
