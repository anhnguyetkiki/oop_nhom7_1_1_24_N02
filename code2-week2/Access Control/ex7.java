// File: Widget.java
package access;

public class Widget {
    public Widget() {
        System.out.println("Widget created!");
    }
}
// File: AccessControlExercise7.java
package com.mycompany.app;

import access.Widget;

public class AccessControlExercise7 {
    public static void main(String[] args) {
        Widget widget = new Widget(); // Tạo đối tượng Widget từ package khác
    }
}
