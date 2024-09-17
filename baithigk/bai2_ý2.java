public class Radar {
    public double calculateSignal(int n) {
        if (n >= 0 && n <= 15) {
            return 1 - (n / 15.0);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Radar radar = new Radar();
        System.out.println("X(4) = " + radar.calculateSignal(4));  // In ra kết quả cho n = 4
    }
}
