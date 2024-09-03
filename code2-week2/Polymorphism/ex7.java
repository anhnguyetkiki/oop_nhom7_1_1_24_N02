// File: Music3WithNewInstrument.java
package com.mycompany.app;

class Instrument {
    public void play(Note n) {
        System.out.println("Instrument.play()");
    }

    @Override
    public String toString() {
        return "Instrument";
    }
}

class Wind extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Wind.play()");
    }

    @Override
    public String toString() {
        return "Wind";
    }
}

class Percussion extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Percussion.play()");
    }

    @Override
    public String toString() {
        return "Percussion";
    }
}

class Stringed extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Stringed.play()");
    }

    @Override
    public String toString() {
        return "Stringed";
    }
}

class Brass extends Wind {
    @Override
    public void play(Note n) {
        System.out.println("Brass.play()");
    }

    @Override
    public String toString() {
        return "Brass";
    }
}

class Woodwind extends Wind {
    @Override
    public void play(Note n) {
        System.out.println("Woodwind.play()");
    }

    @Override
    public String toString() {
        return "Woodwind";
    }
}

class Keyboard extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Keyboard.play()");
    }

    @Override
    public String toString() {
        return "Keyboard";
    }
}

enum Note {
    MIDDLE_C, C_SHARP, B_FLAT;
}

public class PolymorphismExercise7 {
    public static void main(String[] args) {
        Instrument[] orchestra = {
            new Wind(),
            new Percussion(),
            new Stringed(),
            new Brass(),
            new Woodwind(),
            new Keyboard() // Thêm loại nhạc cụ mới
        };
        
        for (Instrument i : orchestra) {
            System.out.println(i); // Sử dụng toString() tự động
            i.play(Note.MIDDLE_C);
        }
    }
}
