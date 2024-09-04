import java.util.ArrayList;
import java.util.Collections;

public class NNCollection {
     private ArrayList<Integer> numbers;
    private ArrayList<String> names;

    // Constructor
    public NNCollection() {
        numbers = new ArrayList<>();
        names = new ArrayList<>();
    }

    // Phương thức thêm số vào danh sách
    public void addNumber(int number) {
        numbers.add(number);
    }

    // Phương thức thêm tên vào danh sách
    public void addName(String name) {
        names.add(name);
    }

    // Phương thức xóa số khỏi danh sách
    public void removeNumber(int number) {
        numbers.remove(Integer.valueOf(number));
    }

    // Phương thức xóa tên khỏi danh sách
    public void removeName(String name) {
        names.remove(name);
    }

    // Phương thức tìm kiếm số
    public boolean searchNumber(int number) {
        return numbers.contains(number);
    }

    // Phương thức tìm kiếm tên
    public boolean searchName(String name) {
        return names.contains(name);
    }

    // Phương thức sắp xếp danh sách số
    public void sortNumbers() {
        Collections.sort(numbers);
    }

    // Phương thức sắp xếp danh sách tên
    public void sortNames() {
        Collections.sort(names);
    }

    // Phương thức hiển thị danh sách số
    public void displayNumbers() {
        System.out.println("Numbers: " + numbers);
    }

    // Phương thức hiển thị danh sách tên
    public void displayNames() {
        System.out.println("Names: " + names);
    }
}
