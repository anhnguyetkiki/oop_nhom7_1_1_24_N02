// File: com/mycompany/interfaces/PublicMethodsInterface.java
package com.mycompany.interfaces;

interface PublicMethodsInterface {
    void methodOne();
    void methodTwo();
    void methodThree();
}

// Implementing the interface
class TestClass implements PublicMethodsInterface {
    @Override
    public void methodOne() {
        System.out.println("Method One implementation");
    }

    @Override
    public void methodTwo() {
        System.out.println("Method Two implementation");
    }

    @Override
    public void methodThree() {
        System.out.println("Method Three implementation");
    }

    public static void main(String[] args) {
        TestClass test = new TestClass();
        test.methodOne();
        test.methodTwo();
        test.methodThree();
    }
}
