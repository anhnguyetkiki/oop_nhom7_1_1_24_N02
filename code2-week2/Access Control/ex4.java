// File: AccessControlExercise4.java
package com.mycompany.app;

class OuterClassStatic {
    public static class PublicStaticInner {
        public void display() {
            System.out.println("Public Static Inner Class");
        }
    }

    private static class PrivateStaticInner {
        public void display() {
            System.out.println("Private Static Inner Class");
        }
    }

    protected static class ProtectedStaticInner {
        public void display() {
            System.out.println("Protected Static Inner Class");
        }
    }
}

public class AccessControlExercise4 {
    public static void main(String[] args) {
        // Truy cập Public Static Inner Class
        OuterClassStatic.PublicStaticInner pubStaticInner = new OuterClassStatic.PublicStaticInner();
        pubStaticInner.display();

        // Truy cập Private Static Inner Class
        // OuterClassStatic.PrivateStaticInner privStaticInner = new OuterClassStatic.PrivateStaticInner(); 
        // Lỗi biên dịch: không thể truy cập private static inner class

        // Truy cập Protected Static Inner Class
        OuterClassStatic.ProtectedStaticInner protStaticInner = new OuterClassStatic.ProtectedStaticInner();
        protStaticInner.display();
    }
}
