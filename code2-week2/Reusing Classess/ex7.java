// File: ClassInheritanceWithArgs.java
package com.mycompany.app;

class A {
    A(int i) {
        System.out.println("Constructor of A called with argument: " + i);
    }
}

class B {
    B(String s) {
        System.out.println("Constructor of B called with argument: " + s);
    }
}

class C extends A {
    B b;

    C(int i, String s) {
        super(i); // Gọi constructor của A
        b = new B(s); // Khởi tạo thành viên B
        System.out.println("Constructor of C called");
    }
}

public class InitializationCleanupExercise7 {
    public static void main(String[] args) {
        C c = new C(42, "Hello"); // Tạo đối tượng của C
    }
}
