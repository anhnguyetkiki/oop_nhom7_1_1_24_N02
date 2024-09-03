// File: InitializationCleanupExercise6.java
package com.mycompany.app;

class Dog {
    void bark() {
        System.out.println("Woof!");
    }

    void bark(int times) {
        System.out.println("Woof ".repeat(times) + "!");
    }

    void bark(double pitch) {
        System.out.println("A high-pitched bark with pitch: " + pitch);
    }

    void bark(boolean loud) {
        if (loud) {
            System.out.println("Loud Woof!");
        } else {
            System.out.println("Quiet Woof...");
        }
    }

    void bark(int times, double pitch) {
        System.out.println("Barking " + times + " times with a pitch of " + pitch);
    }

    void bark(double pitch, int times) {
        System.out.println("Barking " + times + " times with a high pitch of " + pitch);
    }
}

public class InitializationCleanupExercise6 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark(); // Gọi phương thức không tham số
        dog.bark(3); // Gọi phương thức với tham số int
        dog.bark(0.5); // Gọi phương thức với tham số double
        dog.bark(true); // Gọi phương thức với tham số boolean
        dog.bark(5, 0.75); // Gọi phương thức với hai tham số (int, double)
        dog.bark(0.75, 5); // Gọi phương thức với hai tham số (double, int)
    }
}
