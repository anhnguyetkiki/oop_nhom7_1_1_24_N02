// File: Music3WithRandomInstrument.java
package com.mycompany.app;

import java.util.Random;

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

class RandomInstrumentGenerator {
    private Random rand = new Random();

    public Instrument next() {
        switch (rand.nextInt(6)) {
            case 0: return new Wind();
            case 1: return new Percussion();
            case 2: return new Stringed();
            case 3: return new
