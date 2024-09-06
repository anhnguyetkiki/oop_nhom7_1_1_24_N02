// File: Connection.java
package com.mycompany.app;

public class Connection {
    // Constructor private để ngăn tạo đối tượng từ bên ngoài
    private Connection() {
        System.out.println("Connection created!");
    }

    // Phương thức factory để tạo đối tượng Connection
    static Connection createConnection() {
        return new Connection();
    }
}
// File: ConnectionManager.java
package com.mycompany.app;

public class ConnectionManager {
    private static Connection[] connections = new Connection[5];
    private static int counter = 0;

    // Static block để tạo trước các đối tượng Connection
    static {
        for (int i = 0; i < connections.length; i++) {
            connections[i] = Connection.createConnection();
        }
    }

    // Phương thức static để lấy đối tượng Connection
    public static Connection getConnection() {
        if (counter < connections.length) {
            return connections[counter++];
        }
        return null; // Trả về null khi hết đối tượng Connection
    }
}
// File: AccessControlExercise8.java
package com.mycompany.app;

public class AccessControlExercise8 {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) { // Thử lấy 7 kết nối (trong khi chỉ có 5)
            Connection conn = ConnectionManager.getConnection();
            if (conn != null) {
                System.out.println("Got a connection.");
            } else {
                System.out.println("No more connections available.");
            }
        }
    }
}
