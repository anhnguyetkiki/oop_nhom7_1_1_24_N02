// File: com/mycompany/interfaces/MyInterface.java
package com.mycompany.interfaces;

public interface MyInterface {
    void methodOne();
    void methodTwo();
    void methodThree();
}
// File: com/mycompany/implementations/MyInterfaceImpl.java
package com.mycompany.implementations;

import com.mycompany.interfaces.MyInterface;

public class MyInterfaceImpl implements MyInterface {
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
        MyInterfaceImpl impl = new MyInterfaceImpl();
        impl.methodOne();
        impl.methodTwo();
        impl.methodThree();
    }
}
