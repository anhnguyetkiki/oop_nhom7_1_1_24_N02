public class NameNumber {
    private String name;
    private int number;

    // Constructor
    public NameNumber(String name, int number) {
        this.name = name;
        this.number = number;
    }

    // Getter và Setter cho các thuộc tính
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    // Phương thức trả về thông tin chi tiết
    public String getDetails() {
        return "Name: " + name + ", Number: " + number;
    }

}
