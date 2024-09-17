class Wind extends Instrument {
    void play() {
        System.out.println("Wind plays");
    }
    void adjust() {
        System.out.println("Adjusting Wind");
    }
    String what() {
        return "Wind";
    }
}

class Percussion extends Instrument {
    void play() {
        System.out.println("Percussion plays");
    }
    void adjust() {
        System.out.println("Adjusting Percussion");
    }
    String what() {
        return "Percussion";
    }
}

class Stringed extends Instrument {
    void play() {
        System.out.println("Stringed plays");
    }
    void adjust() {
        System.out.println("Adjusting Stringed");
    }
    String what() {
        return "Stringed";
    }
}
