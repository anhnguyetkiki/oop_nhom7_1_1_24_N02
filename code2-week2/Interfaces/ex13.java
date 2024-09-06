// File: com/mycompany/interfaces/BaseInterface.java
package com.mycompany.interfaces;

public interface BaseInterface {
    void baseMethod();
}

interface FirstDerived extends BaseInterface {
    void firstMethod();
}

interface SecondDerived extends BaseInterface {
    void secondMethod();
}

interface MultiDerived extends FirstDerived, SecondDerived {
    void multiMethod();
}

class ImplementingClass implements MultiDerived {
    @Override
    public void baseMethod() {
        System.out.println("Implementing baseMethod()");
    }

    @Override
    public void firstMethod() {
        System.out.println("Implementing firstMethod()");
    }

    @Override
    public void secondMethod() {
        System.out.println("Implementing secondMethod()");
    }

    @Override
    public void multiMethod() {
        System.out.println("Implementing multiMethod()");
    }

    public static void main(String[] args) {
        ImplementingClass impl = new ImplementingClass();
        impl.baseMethod();
        impl.firstMethod();
        impl.secondMethod();
        impl.multiMethod();
    }
}
