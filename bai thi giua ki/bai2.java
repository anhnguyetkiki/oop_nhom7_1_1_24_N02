// Interface Signal
interface Signal {
    void generateSignal();
}

// Lớp DiscreteSignal cài đặt tín hiệu rời rạc
class DiscreteSignal implements Signal {
    private int[] signal;  // Mảng lưu trữ tín hiệu rời rạc

    // Constructor
    public DiscreteSignal(int[] signal) {
        this.signal = signal;
    }

    // Hàm delta, theo định nghĩa của xung đơn vị
    public int delta(int n) {
        return (n == 0) ? 1 : 0;
    }

    // Hàm thực hiện công thức tín hiệu rời rạc
    public int x(int n) {
        int result = 0;
        for (int k = 0; k < signal.length; k++) {
            result += signal[k] * delta(n - k);
        }
        return result;
    }

    // Triển khai phương thức generateSignal từ interface Signal
    @Override
    public void generateSignal() {
        System.out.println("Tín hiệu rời rạc:");
        for (int i = 0; i < signal.length; i++) {
            System.out.println("x(" + i + ") = " + x(i));
        }
    }
}
// Lớp Radar để phân tích tín hiệu rời rạc mẫu
class Radar {
    // Hàm thực hiện công thức tín hiệu mẫu X(n)
    public double X(int n) {
        if (n >= 0 && n <= 15) {
            return 1 - (double)n / 15;
        } else {
            return 0;
        }
    }

    // Hàm tạo chuỗi tín hiệu rời rạc mẫu
    public void generateDiscreteSignal(int n) {
        System.out.println("X(" + n + ") = " + X(n));
    }
}
public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng DiscreteSignal với các giá trị tín hiệu
        int[] signalValues = {1, 0, 0, 1};  // Ví dụ tín hiệu
        DiscreteSignal discreteSignal = new DiscreteSignal(signalValues);
        discreteSignal.generateSignal();

        // Tạo đối tượng Radar và kiểm tra với n = 4
        Radar radar = new Radar();
        radar.generateDiscreteSignal(4);
    }
}
