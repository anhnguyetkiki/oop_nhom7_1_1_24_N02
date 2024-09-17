
public class Orchestra {
    public static void main(String[] args) {
        Instrument[] orchestra = {
            new Wind(),
            new Percussion(),
            new Stringed(),
            new Woodwind(),
            new Brass()
        };

        for (Instrument inst : orchestra) {
            inst.play();
            System.out.println(inst.what());
            inst.adjust();
        }
    }
}
