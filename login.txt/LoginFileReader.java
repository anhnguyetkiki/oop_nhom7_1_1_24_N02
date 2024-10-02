import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LoginFileReader {

    public static void readLoginFile() {
        try {
            String filePath = "files/login.txt";
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Hiển thị nội dung ra terminal
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readLoginFile();
    }
}