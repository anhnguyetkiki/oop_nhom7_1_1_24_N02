// File: SimpleClass.java
package com.mycompany.app;

class SimpleClass {
    SimpleClass() {
        System.out.println("SimpleClass object created!");
    }

    void showMessage() {
        System.out.println("Hello from SimpleClass!");
    }
}
// File: LazyInitializationExample.java
package com.mycompany.app;

class LazyInitializationExample {
    private SimpleClass simpleObject; // Tham chiếu đến SimpleClass, chưa khởi tạo

    void useSimpleClass() {
        if (simpleObject == null) {
            simpleObject = new SimpleClass(); // Khởi tạo lười biếng: chỉ khởi tạo khi cần thiết
        }
        simpleObject.showMessage(); // Gọi phương thức của SimpleClass
    }
}

public class InitializationCleanupExercise1 {
    public static void main(String[] args) {
        LazyInitializationExample example = new LazyInitializationExample();
        
        System.out.println("First call to useSimpleClass():");
        example.useSimpleClass(); // Khởi tạo và sử dụng đối tượng SimpleClass

        System.out.println("Second call to useSimpleClass():");
        example.useSimpleClass(); // Đối tượng đã được khởi tạo từ lần trước, không cần khởi tạo lại
    }
}
