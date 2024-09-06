public class ContinuousSignal implements Signal {
    private double amplitude;  // Biên độ của tín hiệu liên tục
    private double frequency;  // Tần số của tín hiệu liên tục
    private double phase;      // Pha của tín hiệu liên tục

    // Constructor để khởi tạo tín hiệu liên tục với biên độ, tần số và pha
    public ContinuousSignal(double amplitude, double frequency, double phase) {
        this.amplitude = amplitude;
        this.frequency = frequency;
        this.phase = phase;
    }

    // Cài đặt phương thức getAmplitude từ giao diện Signal
    @Override
    public double getAmplitude() {
        return amplitude;
    }

    // Cài đặt phương thức getFrequency từ giao diện Signal
    @Override
    public double getFrequency() {
        return frequency;
    }

    // Phương thức trả về pha của tín hiệu
    public double getPhase() {
        return phase;
    }

    // Phương thức để tính giá trị tín hiệu liên tục tại một thời điểm t
    public double calculateSignal(double t) {
        return amplitude * Math.sin(2 * Math.PI * frequency * t + phase);
    }

    // Phương thức hiển thị thông tin tín hiệu
    public void displaySignal(double startTime, double endTime, double step) {
        System.out.println("Tín hiệu liên tục:");
        for (double t = startTime; t <= endTime; t += step) {
            System.out.printf("x(%.2f) = %.3f\n", t, calculateSignal(t));
        }
    }
}
