public class DiscreteSignal {
    private int[] signalValues;

    public DiscreteSignal(int[] values) {
        this.signalValues = values;
    }

    // Hàm để tính toán giá trị của x(n) dựa trên hàm delta
    public int calculateSignal(int n) {
        int result = 0;
        for (int k = 0; k < signalValues.length; k++) {
            if (n - k == 0) {
                result += signalValues[k];
            }
        }
        return result;
    }
}
