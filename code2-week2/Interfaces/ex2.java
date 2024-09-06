ẽ// File: AbstractClassWithoutAbstractMethods.java
package com.mycompany.app;

abstract class AbstractClass {
    void display() {
        System.out.println("Display method in AbstractClass");
    }
}

public class TestAbstractClass {
    public static void main(String[] args) {
        // AbstractClass ac = new AbstractClass(); // Không thể khởi tạo AbstractClass
        System.out.println("Cannot instantiate an abstract class.");
    }
}
