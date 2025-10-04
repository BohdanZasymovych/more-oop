package game;

import characters.Character;

public class GameManager {
    public void fight(Character c1, Character c2) {
        int turn = 0;
        while (c1.isAlive() && c2.isAlive()) {
            if ((turn & 1) == 0) {
                c1.kick(c2);
                System.out.println("First character kiks the second");

                if (!(c2.isAlive())) {
                    System.out.println("Second character was killed, first won");
                }
            } else {
                c2.kick(c1);
                System.out.println("Second character kiks the first");

                if (!(c1.isAlive())) {
                    System.out.println("First character was killed, second won");
                }
            }

            System.out.println(String.format("First character stats: %s", c1.toString()));
            System.out.println(String.format("Second character stats: %s\n", c2.toString()));
        }
    }
}
