// File: com/mycompany/polymorphism/Playable.java
package com.mycompany.polymorphism;

public interface Playable {
    void play(Note n);
}
// File: com/mycompany/polymorphism/Instrument.java
package com.mycompany.polymorphism;

abstract class Instrument {
    abstract String what();
    abstract void adjust();
}
// File: com/mycompany/polymorphism/Wind.java
package com.mycompany.polymorphism;

class Wind extends Instrument implements Playable {
    @Override
    public void play(Note n) {
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
// File: com/mycompany/polymorphism/Musics.java
package com.mycompany.polymorphism;

public class Musics {
    public static void tune(Playable p) {
        p.play(Note.MIDDLE_C);
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
