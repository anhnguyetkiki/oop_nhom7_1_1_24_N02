public class time {
    private int hours;
    private int minutes;
    private int seconds;

    // Constructor
    public time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // Phương thức để hiển thị thời gian
    public String displayTime() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    // Phương thức để cộng thêm thời gian
    public void addTime(int h, int m, int s) {
        this.seconds += s;
        this.minutes += m + this.seconds / 60;
        this.hours += h + this.minutes / 60;
        this.seconds %= 60;
        this.minutes %= 60;
        this.hours %= 24;
    }
}
