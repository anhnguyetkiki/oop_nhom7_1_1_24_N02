import java.io.FileWriter;
import java.io.IOException;

public class LoginFileManager {

    public static void writeLoginToFile(String username, String password) {
        try {
            // Tạo folder "files" trong thư mục dự án (nếu chưa có)
            String folderPath = "files";
            java.io.File folder = new java.io.File(folderPath);
            if (!folder.exists()) {
                folder.mkdir();
            }

            // Ghi username và password vào file "login.txt"
            String filePath = folderPath + "/login.txt";
            FileWriter writer = new FileWriter(filePath);
            writer.write(username + ": " + password);
            writer.close();
            System.out.println("Ghi thành công vào file login.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        writeLoginToFile("admin", "password123");
    }
}