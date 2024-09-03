// File: access/local/PackagedClass.java
package access.local;

class PackagedClass {
    public PackagedClass() {
        System.out.println("Creating a packaged class");
    }
}
// File: access/foreign/Foreign.java
package access.foreign;

import access.local.*;

public class Foreign {
    public static void main(String[] args) {
        PackagedClass pc = new PackagedClass();  // Lỗi xảy ra ở đây
    }
}
