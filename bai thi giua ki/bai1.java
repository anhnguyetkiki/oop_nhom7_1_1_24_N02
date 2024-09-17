// Định nghĩa giao diện Signal
interface Signal {
    void generateSignal();
}e

// Lớp DiscreteSignal kế thừa từ giao diện Signal
class DiscreteSignal implements Signal {
    @Override
    public void generateSignal() {
        System.out.println("Đang tạo tín hiệu rời rạc...");
        // Thực hiện thêm logic cho tín hiệu rời rạc nếu cần
    }
}

// Lớp ContinuousSignal kế thừa từ giao diện Signal
class ContinuousSignal implements Signal {
    @Override
    public void generateSignal() {
        System.out.println("Đang tạo tín hiệu liên tục...");
        // Thực hiện thêm logic cho tín hiệu liên tục nếu cần
    }
}

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng của các lớp và gọi phương thức generateSignal()
        Signal discreteSignal = new DiscreteSignal();
        Signal continuousSignal = new ContinuousSignal();
        
        discreteSignal.generateSignal();  // Kết quả: Đang tạo tín hiệu rời rạc...
        continuousSignal.generateSignal();  // Kết quả: Đang tạo tín hiệu liên tục...
    }
}
