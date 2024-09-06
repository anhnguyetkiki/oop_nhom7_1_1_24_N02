// File: AbstractBaseWithDowncast.java
package com.mycompany.app;

abstract class AbstractBase {
    // Không có phương thức nào
}

class DerivedClass extends AbstractBase {
    void derivedMethod() {
        System.out.println("DerivedClass method called");
    }
}

public class DowncastExample {
    public static void callDerivedMethod(AbstractBase base) {
        if (base instanceof DerivedClass) {
            DerivedClass derived = (DerivedClass) base; // Ép kiểu xuống lớp dẫn xuất
            derived.derivedMethod();
        }
    }

    public static void main(String[] args) {
        AbstractBase base = new DerivedClass();
        callDerivedMethod(base); // Gọi phương thức với ép kiểu
    }
}
// File: AbstractBaseWithAbstractMethod.java
package com.mycompany.app;

abstract class AbstractBase {
    abstract void derivedMethod(); // Khai báo phương thức trừu tượng
}

class DerivedClass extends AbstractBase {
    @Override
    void derivedMethod() {
        System.out.println("DerivedClass method called");
    }
}

public class PolymorphismExercise4 {
    public static void main(String[] args) {
        AbstractBase base = new DerivedClass();
        base.derivedMethod(); // Gọi phương thức trực tiếp mà không cần ép kiểu
    }
}
