// File: AccessControlExercise6.java
package com.mycompany.app;

class FirstClass {
    protected int protectedData = 10;

    public void showProtectedData() {
        System.out.println("Protected Data: " + protectedData);
    }
}

class SecondClass {
    public void modifyProtectedData(FirstClass first) {
        // Thao tác với dữ liệu protected của lớp FirstClass
        first.protectedData += 5;
        System.out.println("Modified Protected Data: " + first.protectedData);
    }
}

public class AccessControlExercise6 {
    public static void main(String[] args) {
        FirstClass first = new FirstClass();
        SecondClass second = new SecondClass();

        // Hiển thị dữ liệu protected ban đầu
        first.showProtectedData();

        // Sử dụng lớp thứ hai để thay đổi dữ liệu protected của lớp đầu tiên
        second.modifyProtectedData(first);

        // Hiển thị dữ liệu protected sau khi đã bị thay đổi
        first.showProtectedData();
    }
}
