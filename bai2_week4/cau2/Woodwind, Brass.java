class Woodwind extends Wind {
    void play() {
        System.out.println("Woodwind plays");
    }
    String what() {
        return "Woodwind";
    }
}

class Brass extends Wind {
    void play() {
        System.out.println("Brass plays");
    }
    void adjust() {
        System.out.println("Adjusting Brass");
    }
    String what() {
        return "Brass";
    }
}
