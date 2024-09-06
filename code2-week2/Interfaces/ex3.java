// File: AbstractBaseWithPrint.java
package com.mycompany.app;

abstract class BaseClass {
    BaseClass() {
        System.out.println("BaseClass constructor");
        print(); // Gọi phương thức trừu tượng
    }

    abstract void print();
}

class DerivedClass extends BaseClass {
    private int x = 42;

    DerivedClass() {
        System.out.println("DerivedClass constructor");
    }

    @Override
    void print() {
        System.out.println("Value of x in DerivedClass: " + x);
    }
}

public class AbstractPrintTest {
    public static void main(String[] args) {
        DerivedClass dc = new DerivedClass(); // Tạo đối tượng của DerivedClass
        dc.print(); // Gọi phương thức print()
    }
}
