// File: com/mycompany/adventure/Adventure.java
package com.mycompany.adventure;

interface CanFight {
    void fight();
}

interface CanSwim {
    void swim();
}

interface CanFly {
    void fly();
}

interface CanClimb {
    void climb();
}

class ActionCharacter {
    public void fight() {
        System.out.println("ActionCharacter fights");
    }
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly, CanClimb {
    @Override
    public void swim() {
        System.out.println("Hero swims");
    }

    @Override
    public void fly() {
        System.out.println("Hero flies");
    }

    @Override
    public void climb() {
        System.out.println("Hero climbs");
    }
}

public class Adventure {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.fight();
        h.swim();
        h.fly();
        h.climb();
    }
}
