public class book {
    private String title;
    private String author;
    private String publisher;
    private int year;

    // Constructor
    public book(String title, String author, String publisher, int year) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
    }

    // Getter và Setter cho các thuộc tính
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Phương thức trả về thông tin chi tiết về sách
    public String getDetails() {
        return "Title: " + title + "\nAuthor: " + author + "\nPublisher: " + publisher + "\nYear: " + year;
    }

    // Phương thức trả về tóm tắt sách
    public String getSummary() {
        return "Title: " + title + " by " + author + " (" + year + ")";
    }
}
