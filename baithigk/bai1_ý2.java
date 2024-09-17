public class DiscreteSignal implements Signal {
    private double amplitude; // Biên độ của tín hiệu
    private double frequency; // Tần số của tín hiệu
    private int[] values;     // Mảng các giá trị tín hiệu rời rạc

    // Constructor để khởi tạo tín hiệu rời rạc với biên độ, tần số và các giá trị
    public DiscreteSignal(double amplitude, double frequency, int[] values) {
        this.amplitude = amplitude;
        this.frequency = frequency;
        this.values = values;
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

    // Phương thức trả về mảng các giá trị tín hiệu rời rạc
    public int[] getValues() {
        return values;
    }

    // Phương thức hiển thị giá trị tín hiệu rời rạc
    public void displaySignal() {
        System.out.println("Tín hiệu rời rạc:");
        for (int i = 0; i < values.length; i++) {
            System.out.println("x(" + i + ") = " + values[i]);
        }
    }
}
