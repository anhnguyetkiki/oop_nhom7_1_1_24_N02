// File: AccessControlExercise1.java
package com.mycompany.app;

class AccessControlExample {
    public int publicVar = 1;
    private int privateVar = 2;
    protected int protectedVar = 3;

    public void publicMethod() {
        System.out.println("Public method");
    }

    private void privateMethod() {
        System.out.println("Private method");
    }

    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    void showAccess() {
        System.out.println("publicVar: " + publicVar);
        System.out.println("privateVar: " + privateVar);
        System.out.println("protectedVar: " + protectedVar);
    }
}

public class AccessControlExercise1 {
    public static void main(String[] args) {
        AccessControlExample ace = new AccessControlExample();
        
        // Truy cập biến
        System.out.println("publicVar: " + ace.publicVar);
        // System.out.println("privateVar: " + ace.privateVar); // Lỗi biên dịch: không thể truy cập private
        System.out.println("protectedVar: " + ace.protectedVar);

        // Truy cập phương thức
        ace.publicMethod();
        // ace.privateMethod(); // Lỗi biên dịch: không thể truy cập private
        ace.protectedMethod();
    }
}
