// File: AccessControlExercise3.java
package com.mycompany.app;

class OuterClass {
    public class PublicInner {
        public void display() {
            System.out.println("Public Inner Class");
        }
    }

    private class PrivateInner {
        public void display() {
            System.out.println("Private Inner Class");
        }
    }

    protected class ProtectedInner {
        public void display() {
            System.out.println("Protected Inner Class");
        }
    }

    void accessInnerClasses() {
        PublicInner pubInner = new PublicInner();
        PrivateInner privInner = new PrivateInner();
        ProtectedInner protInner = new ProtectedInner();

        pubInner.display();
        privInner.display();
        protInner.display();
    }
}

public class AccessControlExercise3 {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();

        // Truy cập Public Inner Class
        OuterClass.PublicInner pubInner = outer.new PublicInner();
        pubInner.display();

        // Truy cập Private Inner Class
        // OuterClass.PrivateInner privInner = outer.new PrivateInner(); // Lỗi biên dịch: không thể truy cập private inner class

        // Truy cập Protected Inner Class
        OuterClass.ProtectedInner protInner = outer.new ProtectedInner();
        protInner.display();
    }
}
