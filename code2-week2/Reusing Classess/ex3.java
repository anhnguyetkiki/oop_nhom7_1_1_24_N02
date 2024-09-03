// File: Chess.java
package com.mycompany.app;

class Game {
    Game(int i) {
        System.out.println("Game constructor called with argument: " + i);
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i); // Gọi constructor của Game
        System.out.println("BoardGame constructor called with argument: " + i);
    }
}

public class Chess extends BoardGame {
    Chess() {
        super(11); // Gọi constructor của BoardGame
        System.out.println("Chess constructor called");
    }

    public static void main(String[] args) {
        Chess x = new Chess(); // Tạo đối tượng của Chess
    }
}
