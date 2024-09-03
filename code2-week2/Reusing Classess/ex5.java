// File: ClassInheritanceExample.java
package com.mycompany.app;

class A {
    A() {
        System.out.println("Constructor of A called");
    }
}

class B {
    B() {
        System.out.println("Constructor of B called");
    }
}

class C extends A {
    B b = new B(); // Tạo thành viên của lớp B trong C
}

public class InitializationCleanupExercise5 {
    public static void main(String[] args) {
        C c = new C(); // Tạo đối tượng của C
    }
}
