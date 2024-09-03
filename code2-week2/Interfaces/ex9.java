// File: com/mycompany/polymorphism/Instrument.java
package com.mycompany.polymorphism;

abstract class Instrument {
    abstract void play(Note n);
    abstract String what();
    abstract void adjust();
}
// File: com/mycompany/polymorphism/Wind.java
package com.mycompany.polymorphism;

class Wind extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

    @Override
    String what() {
        return "Wind";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Wind");
    }
}
// File: com/mycompany/polymorphism/Percussion.java
package com.mycompany.polymorphism;

class Percussion extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }

    @Override
    String what() {
        return "Percussion";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Percussion");
    }
}
// File: com/mycompany/polymorphism/Stringed.java
package com.mycompany.polymorphism;

class Stringed extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }

    @Override
    String what() {
        return "Stringed";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Stringed");
    }
}
// File: com/mycompany/polymorphism/Musics.java
package com.mycompany.polymorphism;

public class Musics {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        Percussion drum = new Percussion();
        Stringed violin = new Stringed();

        tune(flute);
        tune(drum);
        tune(violin);
    }
}
